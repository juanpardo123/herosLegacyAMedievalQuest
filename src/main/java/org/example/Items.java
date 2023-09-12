package org.example;

import java.util.ArrayList;

public class Items {
    private String type;
    private String name;

    private String picture;

    int effectPoints;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getEffectPoints() {
        return effectPoints;
    }

    public void setEffectPoints(int effectPoints) {
        this.effectPoints = effectPoints;
    }

    public Items(String name , String type, int effectPoints, String picture){
        this.name = name;
        this.type = type;
        this.effectPoints = effectPoints;
        this.picture = picture;
    }


}
