/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

/**
 *
 * @author Gray
 */
public abstract class Media {

    private static int mediactr = 0;
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media() {
    }

    public Media(String title) {
        ++mediactr;
        this.id = mediactr;
        this.title = title;
    }

    public Media(String title, String category) {
        ++mediactr;
        this.id = mediactr;
        this.title = title;
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        ++mediactr;
        this.id = mediactr;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
