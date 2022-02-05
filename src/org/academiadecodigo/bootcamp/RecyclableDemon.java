package org.academiadecodigo.bootcamp;

public class RecyclableDemon extends Genie {
    public RecyclableDemon(int wishMaxNum) {
        super(wishMaxNum);
    }
    private boolean recycled=false;

    public boolean isRecycled() {
        return recycled;
    }

    public void setRecycled() {
        this.recycled = true;
    }
        public void askAWish() {
        //super.askAWish();
        if (isRecycled()==false){
            System.out.println("Tell me a wish");
        }else{
            System.out.println("No more wishes.");
        }
    }

    /*
        When released from the lamp (instantiated), the maximum number of wishes is set
    It can only grant one wish at a time
    Grants ALL wishes, even if the maximum has already been reached
    It can recharge a magic lamp, if recycled
    It will not grant any more wishes after being recycled
    It can only be recycled once
         */

    }

