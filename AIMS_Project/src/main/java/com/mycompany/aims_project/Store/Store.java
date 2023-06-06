/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Store;

import com.mycompany.aims_project.Media.DigitalVideoDisc;
import java.util.ArrayList;

/**
 *
 * @author Gray
 */
public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
    
    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore.add(dvd);
    }
    
    public void removeDVD(DigitalVideoDisc dvd){
        itemsInStore.remove(dvd);
    }
    
    public void print(){
        System.out.println("***********************************DVD LIST***********************************");
        for(int i=0;i<itemsInStore.size();++i){
            System.out.println(1+i + "." + itemsInStore.get(i));
        }
        System.out.println("***********************************  END   ***********************************");
        
        System.out.print("\n\n");
    }
}
