/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

/**
 *
 * @author Gray
 */
public class DigitalVideoDisc extends Disc {
   
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = MediaCtr;
        ++MediaCtr;

    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = MediaCtr;
        ++MediaCtr;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = MediaCtr;
        ++MediaCtr;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = MediaCtr;
        ++MediaCtr;
    }
         

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DVD: " + this.title
                + " - Category: " + this.category
                + " - Director: " + this.title
                + " - DVD length: " + this.length
                + " - Cost: " + this.cost + "$";
    }

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    public void play() {

        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());

    }

}
