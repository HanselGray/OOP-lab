/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import java.util.ArrayList;

/**
 *
 * @author Gray
 */
public class Book extends Media{
    private ArrayList<String> authors = new ArrayList<>();
    public int book_num_counter = 0;
    
    public Book(){
        super();
    }
    
    private void addAuthor(String AuthorName){
        if(!this.authors.contains(AuthorName)){
            this.authors.add(AuthorName);
        }
    }
    
     private void removeAuthor(String AuthorName){
        if(this.authors.contains(AuthorName)){
            this.authors.remove(AuthorName);
        }
    }
    
    
    
    
    
    
    
    
}
