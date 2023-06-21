/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalab01;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class ChoosingOption {
    public static void main(String args[]){
        
        int option = JOptionPane.showConfirmDialog(null, 
                "Do you want to change the first class ticket?");
        
        JOptionPane.showMessageDialog(null, "You have choosen: "+ (option == JOptionPane.YES_OPTION?"Yes":"No"));
        
        System.exit(0);
                
    }
}
