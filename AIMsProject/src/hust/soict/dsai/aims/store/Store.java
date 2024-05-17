package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Store {
    List<Media> itemsInStore = new ArrayList<Media>(); 

    public void addMedia(Media media){
        itemsInStore.add(media);
        System.out.println(media.getTitle() + " has been added");     
    }

    public void removeMedia(Media media){
        itemsInStore.remove(media);
        System.out.println(media.getTitle() + " has been removed");     
    }
}
