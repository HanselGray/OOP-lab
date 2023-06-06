/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

/**
 *
 * @author Gray
 */
public class Track {
    private String title;
    private int length;
    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }
    
    
    
}
