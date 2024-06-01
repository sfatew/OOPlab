package hust.soict.dsai.aims.media;

public class Track implements Playable{

    private String title;
    private int length;
    
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String play() {
        String s1 = ("Playing Track: " + this.getTitle());
        String s2 =("Track length: " + this.getLength());

        return String.format("%s | %s", s1, s2);
    }

    @Override
    public boolean equals(Object o){

        if (this == o){
            return true;
        }
        if (!(o instanceof Track)) {  
            return false;  
        }  
        Track track = (Track) o; 
        return length == track.length && (title != null ? title.equals(track.title) : track.title == null);
    }
}
