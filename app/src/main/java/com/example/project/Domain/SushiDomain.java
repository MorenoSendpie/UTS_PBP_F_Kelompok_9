package com.example.project.Domain;

import java.io.Serializable;

public class SushiDomain implements Serializable {
    private String title;
    private String pic;
    private String description;
    private int fee;
    private int numberInCart;

    public SushiDomain(String title, String pic, String description, int fee) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
    }

    public SushiDomain(String title, String pic, String description, int fee, int numberInCart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }
    public String getPic() {
        return pic;
    }
    public String getDescription() {
        return description;
    }
    public int getFee() {
        return fee;
    }
    public int getNumberInCart() {
        return numberInCart;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
