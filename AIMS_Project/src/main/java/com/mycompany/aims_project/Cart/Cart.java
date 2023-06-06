/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Cart;

import com.mycompany.aims_project.Media.DigitalVideoDisc;

/**
 *
 * @author Gray
 */
public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public Cart() {
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            ++qtyOrdered;
            System.out.println("Added "+disc.getTitle() );
        } else {
            System.out.println("Cart is full, cannot add more ");
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
            for (int i = 0; i < dvdList.length; ++i) {
                this.addDigitalVideoDisc(dvdList[i]); 
                if(qtyOrdered>= MAX_NUMBERS_ORDERED){
                    break;
                }
            }     
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
       DigitalVideoDisc[] dvdcombo2 = {dvd1,dvd2};
       this.addDigitalVideoDisc(dvdcombo2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("Nothing to remove!");
        } else {
            int index = -1;
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == disc) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Disc not found in cart!");
            } else {
                for (int i = index; i < qtyOrdered - 1; i++) {
                    itemsOrdered[i] = itemsOrdered[i + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println(disc.getTitle() + " has been removed from the cart.");
            }
        }
    }
    
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + ". " + itemsOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; ++i) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
