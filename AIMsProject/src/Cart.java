public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;

    /*
     * Add a field as an array to store a list of DigitalVideoDisc.
     */
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;


    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_NUMBERS_ORDERED - 1){
            System.out.println("the cart is almost full");
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            System.out.println(disc.getTitle() + " has been added");
            // System.out.println(qtyOrdered);
            qtyOrdered ++;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if (qtyOrdered == MAX_NUMBERS_ORDERED - dvdList.length){
            System.out.println("the cart is almost full");
        }
        else{
            for (int i = 0; i < dvdList.length; i++){
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
            }

            System.out.println(dvdList + " has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if (qtyOrdered == MAX_NUMBERS_ORDERED - 2){
            System.out.println("the cart is almost full");
        }
        else{
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
        }
    }

    // public void addDigitalVideoDisc(DigitalVideoDisc ... disc){

    // }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){

        DigitalVideoDisc newItemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        int index = 0;
        int j = -1;
        for (int i = 0; i < itemsOrdered.length; i++){
            if (itemsOrdered[i] == disc && j != 0){  
                // System.out.println(j);
                j = 0;
                continue;
            }
            // System.out.println(itemsOrdered[i]);
            newItemsOrdered[index] = itemsOrdered[i];
            index ++;
        }

        itemsOrdered = newItemsOrdered;

        System.out.println(disc.getTitle() + " has been removed");
        // System.out.println(index);
        qtyOrdered --;
    }

    
    /** 
     * @return float
     */
    public float totalCost(){
        float cost = 0;
        for (int i = 0; i < qtyOrdered; i ++){
            DigitalVideoDisc disc = itemsOrdered[i];
            cost += disc.getCost();
        }
        return cost;
    }

}
