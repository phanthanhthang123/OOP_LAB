//Phan Thanh Thang
//20225927
//2.2.3
package Lab01;

import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null, "Hi, " + result + "!");
        System.exit(0);
    }
}
