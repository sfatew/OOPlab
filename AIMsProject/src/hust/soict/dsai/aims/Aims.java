package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class Aims {

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void MainMenu(Scanner scanner, Store store, Cart cart){
        boolean isRunning = true;
        while (isRunning) {
            showMenu();
            int options = scanner.nextInt();
            switch (options) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                    veiwStore(scanner, store);
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void veiwStore(Scanner scanner, Store store){
        store.display();
        boolean inStoreMenu = true;
        while (inStoreMenu) {
            storeMenu();
            int options = scanner.nextInt(); 
            switch (options) {
                case 0:
                    inStoreMenu = false;
                    break;
                case 1:
                    veiwStore(scanner, store);
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
    public static void updateStore(){

    }
    public static void seeCurrentCart(){

    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }


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
