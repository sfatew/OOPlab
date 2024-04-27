import java.util.LinkedList;
import java.util.List;

public class Store {
    List<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>(); 

    public void addDVD(DigitalVideoDisc disc){
        itemsInStore.add(disc);
        System.out.println(disc.getTitle() + " has been added");     
    }

    public void removeDVD(DigitalVideoDisc disc){
        itemsInStore.remove(disc);
        System.out.println(disc.getTitle() + " has been removed");     
    }
}