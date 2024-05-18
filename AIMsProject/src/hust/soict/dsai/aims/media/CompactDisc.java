package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();



    public CompactDisc(int id, String title, String category, float cost, String director, String artist,
            List<Track> tracks) {
        super(id, title, category, cost, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
        }
        else{
            System.out.println("This track is already in the tracks");
        }
    }
    
    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
        }
        else{
            System.out.println("This track is not in the tracks");
        }
    }

    @Override
    public int getLength(){
        int length = 0;
        for (Track track : tracks){
            length += track.getLength();
        }

        return length;
    }

    @Override
    public void play() {
        for (Track track : tracks){
            track.play();
        }
    }

    @Override
    public String toString(){
        return String.format("CD - [%s] - [%s] - [%s] - [%s] - [%d]: [%.2f] $ " , this.getTitle(), this.getCategory(), this.getDirector(), this.getArtist() , this.getLength(), this.getCost()); 
    }
    
}
