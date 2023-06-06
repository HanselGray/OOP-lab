/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aims_project;

import com.mycompany.aims_project.Media.DigitalVideoDisc;
import com.mycompany.aims_project.Cart.Cart;

/**
 *
 * @author Gray
 */
public class AIMS_Project {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cart an0rder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);

        an0rder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);

        an0rder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        an0rder.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost is: ");
        System.out.println(an0rder.totalCost());

        an0rder.removeDigitalVideoDisc(dvd3);

        System.out.println("Total cost is: ");
        System.out.println(an0rder.totalCost());
        
         Cart aorder = new Cart();
         
        
    }

}
