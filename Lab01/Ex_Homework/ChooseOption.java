//Phan Thanh Thang
//20225927
//6.1
package Lab01.Ex_Homework;

import javax.swing.JOptionPane;

public class ChooseOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the frist class ticket?");

        JOptionPane.showMessageDialog(null,"You've chosen: " + (option==JOptionPane.YES_OPTION ? "YES" : "NO"));

        System.exit(0);
    }
}
