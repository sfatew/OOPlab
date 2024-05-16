package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title);
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost, director);
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }


    public String toString(){
        return String.format("DVD - [%s] - [%s] - [%s] - [%d]: [%.2f] $ " , this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost()); 
    }

    public boolean isMatch(String title){
        if (this.title.equals(title)){
            return true;
        }
        return false;
    }

    public boolean isMatch(int id){
        if (this.id == id){
            return true;
        }
        return false;
    }


    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }



}
