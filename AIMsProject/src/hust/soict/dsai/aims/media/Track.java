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
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
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
