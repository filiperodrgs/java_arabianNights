package org.academiadecodigo.bootcamp;

public class Genie {
    private int wishMaxNum;
    private int wishesAsked=0;
    Genie genie;


    public Genie(int wishMaxNum) {
        this.wishMaxNum = wishMaxNum;
    }

    public void askAWish() {

    }

    public int getWishMaxNum() {
        return wishMaxNum;
    }

    public void setWishMaxNum(int wishMaxNum) {
        this.wishMaxNum = wishMaxNum;
    }

    public int getWishesAsked() {
        return wishesAsked;
    }

    public void setWishesAsked() {
        this.wishesAsked ++;
    }
}



