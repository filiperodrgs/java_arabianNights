package org.academiadecodigo.bootcamp;
/*
     When released from the lamp (instantiated), the maximum number of wishes is set
 It can only grant one wish at a time
 Grants ONLY ONE wish, even if the maximum has not been reached
      */
public class GrumpyGenie extends Genie {



    public GrumpyGenie(int wishMaxNum) {
        super(wishMaxNum);
    }

    public void askAWish() {
        if (super.getWishesAsked() < 1) {
            System.out.println("Tell me a wish:");
            super.setWishesAsked();
        } else {
            System.out.println("You got out of wishes");
        }


    }
}

