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
public class CompactDisc extends Disc {
    private int length;
    private String aritst;
    private ArrayList<Track> tracks;

    public CompactDisc() {
        super();
    }

    public CompactDisc(int length, String aritst, ArrayList<Track> tracks) {
        super();
        this.length = length;
        this.aritst = aritst;
        this.tracks = tracks;
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
        this.length = 0;
        for (int i = 0; i < tracks.size(); ++i) {
            length += tracks.get(i).getLength();
        }
        return length;
    }

}
