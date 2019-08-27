/*
 * Prompts user for radius and height of a cylinder and returns the volume of the cylinder.
 * Intent of the program is to have popup windows to prompt you for the information using, JOptionPane 
 *
 * @author Stewart
 * @version JAVA 8, 6/26/2019
 */

import java.lang.Math;
import javax.swing.JOptionPane;

public class cylinderVolume{
    public static void main(String[] args){
        Boolean flag = true;

        while(flag){
            /// prompts the user for the height
            String inHeight = JOptionPane.showInputDialog("Enter the height of the cylinder:");
            double height = Double.parseDouble(inHeight);
            /// prompts user for the radius
            String inRadius = JOptionPane.showInputDialog("Enter the radius of the cylinder:");
            double radius = Double.parseDouble(inRadius);

            /// does math to find volume
            double volume = Math.PI * (radius * radius) * height;
            /// gives user the answer
            JOptionPane.showMessageDialog(null, String.format("The volume of the cylinder is: %,.2f", volume), String.format("Cylinder Volume"), JOptionPane.INFORMATION_MESSAGE);

            /// asks the user if they would like to continue
            int contin = JOptionPane.showConfirmDialog(null, "Would you like to continue?" , "Continue?", JOptionPane.YES_NO_OPTION);
            /// if the user enters '1' or 'no' in the above popup, switch flag to false and end the program
            if(contin == 1){
                flag = false;
                System.out.println("Exiting...");
            }
        }
    }
}

