package com.example.lucas.recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas on 14/09/2017.
 */

public class Companie {

    private int photo;
    private String name;
    private String hr;
    private String distance;

    public Companie(int photo, String name, String hr, String distance) {
        this.photo = photo;
        this.name = name;
        this.hr = hr;
        this.distance = distance;
    }

    public int getPhoto() { return photo; }

    public void setPhoto(int photo) { this.photo = photo; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getHr() { return hr; }

    public void setHr(String hr) { this.hr = hr; }

    public String getDistance() { return distance; }

    public void setDistance(String distance) { this.distance = distance; }

}