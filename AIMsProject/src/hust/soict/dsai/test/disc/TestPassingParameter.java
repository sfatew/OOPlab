package hust.soict.dsai.test.disc;
import java.lang.reflect.Field;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    
    //JAVA is a pass by reference language
    
    //Because the reference that use in the swap method is only a copy of the original reference
    //→ the original reference is still pointing to the same object.

    //the copied reference in changeTitle method is currently pointing to the current Object. We then set the title attribute in our Object to the new title → change the Object title. 
    //When we try to point the  reference to another object, the reference that we use is only a copy and the original reference is still point to the modified Object.
    
    // when passing for primitive datatype we also got the copy of the refereance
    //but now pointing to the copy of the datatype
    
    public static void swap(Object o1, Object o2){
        try {        
            Class cls = o1.getClass();
            // returns the array of Field objects
            Field[] fields = cls.getDeclaredFields();
            for(int i = 0; i < fields.length; i++) {
                // System.out.println("Field = " + fields[i].toString());
                fields[i].setAccessible(true);
                Object tmp = fields[i].getType().getConstructor(new Class[]{}).newInstance();
                tmp = fields[i].get(o1);
                fields[i].set(o1, fields[i].get(o2));
                fields[i].set(o2, tmp);

            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
  
    /** 
     *
     * Have to Wrap the 2 object you want to swap before using this method.
     * After swap the Object refer by o1 will be refered by o2 and vice versa
     * 
     * @param o1 Wraped object
     * @param o2 Wraped object 
     */
    public static void swap(ObjectWrapper o1, ObjectWrapper o2){
        Object tmp = o1.o;
        o1.o = o2.o;
        // System.out.println(o1.getO());
        o2.o = tmp;

    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }  


    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        swap(jungleDVD, cinderellaDVD);


        ObjectWrapper<DigitalVideoDisc> ow1 = new ObjectWrapper<DigitalVideoDisc>(jungleDVD);
        ObjectWrapper<DigitalVideoDisc> ow2 = new ObjectWrapper<DigitalVideoDisc>(cinderellaDVD);

        swap(ow1, ow2);

        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("cinderalla DVD title: " + cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());

    }
}
