/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import java.util.ArrayList;
import com.mycompany.aims_project.Playable.Playable;

/**
 *
 * @author Gray
 */
public class CompactDisc extends Disc implements Playable {
    
    private String artist;
    private ArrayList<Track> tracks;
    
    public CompactDisc() {
        super();
    }
    
    public CompactDisc(String title, String artist) {
        super(title);
        this.artist = artist;
        
    }
    
    public CompactDisc(String title, String category, String artist) {
        super(title, category);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }
    
    public CompactDisc(String title, String category, float cost, String aritst) {
        super(title, category, cost);
        this.tracks = new ArrayList<>();
        this.artist = aritst;
    }
    
    private void addTrack(Track newTrack) {
        if (!this.tracks.contains(newTrack)) {
            this.tracks.add(newTrack);
        }
    }
    
    private void removeTrack(Track rmvble) {
        if (this.tracks.contains(rmvble)) {
            this.tracks.remove(rmvble);
        }
    }
    
    @Override
    public int getLength() {
        int temp = 0;
        for (int i = 0; i < tracks.size(); ++i) {
            temp += tracks.get(i).getLength();
        }
        return temp;
    }

    //getters
    public String getArtist() {
        return artist;
    }

    //interface
    @Override
    public void play() {
        
        System.out.println("You are now listening to \"" + this.getTitle() + "\" \n Produced by " + this.getArtist());
        
        for (int i = 0; i < tracks.size(); ++i) {
            System.out.print("Track no." + i + ":");
            tracks.get(i).play();
        }
    }
    
}
