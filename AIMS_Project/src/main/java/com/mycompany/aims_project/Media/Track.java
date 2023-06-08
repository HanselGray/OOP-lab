/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import com.mycompany.aims_project.Playable.Playable;

/**
 *
 * @author Gray
 */
public class Track implements Playable {

    private String title;
    private int length;

    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public Track(String title) {
        this.title = title;
    }

    //getters
    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    //interface
    @Override
    public void play() {
        System.out.println("\"" + this.getTitle() + "\" length: " + this.getLength());
    }

}
