package com.smartkindergarten.smartkindergarten.entries;

import java.io.Serializable;

public class Product implements Serializable{
    private String letter_des;
    private int photo;
    private int elementPhoto;

    public String getLetter_des() {
        return letter_des;
    }

    public void setLetter_des(String letter_des) {
        this.letter_des = letter_des;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getElementPhoto() {
        return elementPhoto;
    }

    public void setElementPhoto(int elementPhoto) {
        this.elementPhoto = elementPhoto;
    }

    public Product() {
    }

    public Product(String letter_des, int photo, int elementPhoto) {
        this.letter_des = letter_des;
        this.photo = photo;
        this.elementPhoto = elementPhoto;
    }
}

