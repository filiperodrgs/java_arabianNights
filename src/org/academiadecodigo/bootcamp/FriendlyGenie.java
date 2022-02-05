package org.academiadecodigo.bootcamp;

public class FriendlyGenie extends Genie {

    public FriendlyGenie(int wishMaxNum) {
        super(wishMaxNum);
    }
    public void askAWish() {
        if (super.getWishesAsked() < super.getWishMaxNum()) {
            System.out.println("Tell me a wish:");
            super.setWishesAsked();
        } else {
            System.out.println("You got out of wishes");
        }
    }
    /*When released from the lamp (instantiated), the maximum
    number of wishes is set
It can only grant one wish at a time
It can grant wishes if the maximum has not been reached
     */


    }

