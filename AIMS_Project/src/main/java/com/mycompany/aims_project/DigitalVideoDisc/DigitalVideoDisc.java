/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.DigitalVideoDisc;

/**
 *
 * @author Gray
 */
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDisc =0;
    
    
    public DigitalVideoDisc() {
        
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }   

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDisc;
        ++nbDigitalVideoDisc;
        
    }
    
    public DigitalVideoDisc(String title)
    {
        this.title = title;
        this.id = nbDigitalVideoDisc;
        ++nbDigitalVideoDisc;
    }
    
    public DigitalVideoDisc( String title, String category, float cost)
    {
        this.category = category;
        this.title = title; 
        this.cost = cost;
        this.id = nbDigitalVideoDisc;
        ++nbDigitalVideoDisc;
    }
    
    public DigitalVideoDisc(String title, String category,  String director,   float cost)
    {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = nbDigitalVideoDisc;
        ++nbDigitalVideoDisc;
    }
    
    @Override
    public String toString() {
        return "DVD: " + this.title +
                " - Category: " + this.category +
                " - Director: " + this.title +
                " - DVD length: " + this.length +
                " - Cost: " + this.cost + "$";
    }
    
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
    
    
}
