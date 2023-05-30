/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project;
import com.mycompany.aims_project.DigitalVideoDisc.DigitalVideoDisc;

/**
 *
 * @author Gray
 */
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        swap(jungleDVD, cinderellaDVD);
        
        System.out.println("Jungle dvd title: "+ jungleDVD.getTitle());
        
        System.out.println("Cinderella dvd title: "+ cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        
        System.out.println("Jungle dvd title: "+ jungleDVD.getTitle());
   
    }
    
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;       
    }
    
    public static void changeTitle(DigitalVideoDisc dvd, String newTitle){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(newTitle);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
