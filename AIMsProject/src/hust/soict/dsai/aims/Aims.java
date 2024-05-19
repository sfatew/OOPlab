package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class Aims {
    public static void main(String[] args) {

        // Create a new cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart 
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia (dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
        anOrder.addMedia (dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
        anOrder.addMedia (dvd3);

        DigitalVideoDisc dvdList[] = {dvd1, dvd2}; 
        anOrder.addMedia(dvdList);

        anOrder.print();
        Collections.sort(anOrder.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);

        anOrder.print();

        //print total cost of the items in the cart System.out.println("Total Cost is: ");
        // System.out.println(anOrder.totalCost());


        //remove an item from cart
        // anOrder.removeMedia(dvd2);
        // System.out.println(anOrder.totalCost());

        // System.out.println(dvd1.getId());
        // System.out.println(dvd3.getId());



        // List<Media> mediae = new ArrayList<Media>();

        // Track cd1t1 = new Track("Wake me up", 2);
        // Track cd1t2 = new Track("Waiting for love", 2);
        // Track cd1t3 = new Track("Wake me up", 3);
        // List<Track> tracks = new ArrayList<Track>();
        // CompactDisc cd1 = new CompactDisc(01, "Wake me up", null, 10.99f, "NONE", "Avicii", tracks);
        // cd1.addTrack(cd1t1);
        // cd1.addTrack(cd1t2);
        // cd1.addTrack(cd1t3);

        // List<String> author = new ArrayList<String>();
        // author.add("Conan Doyle");
        // Book book = new Book("Sherlock Holmes", "detective", 4.99f, author);


        // mediae.add(book);
        // mediae.add(cd1);
        // mediae.add(dvd1);

        // for(Media m : mediae){
        //     System.err.println(m.toString());
        // }
    }
}
