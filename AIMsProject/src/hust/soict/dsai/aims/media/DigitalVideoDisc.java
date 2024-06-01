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

    @Override
    public String toString(){
        return String.format("DVD - [%s] - [%s] - [%s] - [%d]: [%.2f] $ " , this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost()); 
    }


    @Override
    public String play() {
        String s1 = ("Playing DVD: " + this.getTitle());
        String s2 = ("DVD length: " + this.getLength());

        return String.format("%s | %s", s1, s2);
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }



}
