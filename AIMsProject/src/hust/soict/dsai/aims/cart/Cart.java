package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    
    /*
     * Add a field as an array to store a list of DigitalVideoDisc.
     */
    private List<Media> itemsOrdered = new ArrayList<Media>();


    public void addMedia(Media media){

        itemsOrdered.add(media);
        System.out.println(media.getTitle() + " has been added");
        // System.out.println(qtyOrdered);

    }

    public void addMedia(Media [] mediaLst){

        for (Media media : mediaLst){
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added");
        }
    }

    public void addMedia(Media media1,Media media2){

        itemsOrdered.add(media1);
        System.out.println(media1.getTitle() + " has been added");

        itemsOrdered.add(media2);
        System.out.println(media2.getTitle() + " has been added");
        
    }

    // public void addMedia(Media ... media){

    // }

    public void removeMedia(Media media){

        itemsOrdered.remove(media);

        System.out.println(media.getTitle() + " has been removed");

    }

    
    /** 
     * @return float
     */
    public float totalCost(){
        float cost = 0;
        for (Media media : itemsOrdered){
            cost += media.getCost();
        }
        return cost;
    }

    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++){
            System.out.println(i+1 + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println(String.format("Total cost: [%f]", totalCost()));
        System.out.println("***************************************************");
    }

    public String search(String title){
        for (Media media : itemsOrdered){
            if (media.isMatch(title)){
                System.out.println("Found item: ");
                return media.toString();
            }
        }
        System.out.println("No such item in cart: ");
        return null;
    }

    public String search(int id){
        for (Media media : itemsOrdered){
            if (media.isMatch(id)){
                System.out.println("Found item: ");
                return media.toString();
            }
        }
        System.out.println("No such item in cart: ");
        return null;
    }
}
