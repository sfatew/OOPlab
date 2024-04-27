package JavaBasic.src;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket? ", 
                                                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        String[] respone = {"I do", "I don’t"};
        JOptionPane.showOptionDialog(null, 
                            "Do you want to change to the first class ticket? ", 
                            null, 
                            JOptionPane.YES_NO_OPTION, 
                            JOptionPane.QUESTION_MESSAGE, 
                            null, 
                            respone, 
                            0);

        JOptionPane.showMessageDialog(null, "You have choosen: " + (option == JOptionPane.YES_OPTION?"Yes": "No"));
        System.exit(0);
    }
}
