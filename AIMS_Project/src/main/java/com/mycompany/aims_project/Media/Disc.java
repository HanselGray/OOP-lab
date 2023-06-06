/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

/**
 *
 * @author Gray
 */
public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(int length, String director) {
        super();
        this.length = length;
        this.director = director;
    }
    
    public Disc(int length, String director, int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }
    
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

   
}
