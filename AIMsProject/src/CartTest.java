public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        //Create new dvd objects & add to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci. Fi", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "animation", "Roger Allers", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        
        //Test the print method
        cart.print();
        // System.out.println(dvd1.toString());

        //Test the search method
        System.out.println(cart.search("Star Wars"));
        System.out.println(cart.search("Star Strek"));

        System.out.println(cart.search(2));
    }
}
