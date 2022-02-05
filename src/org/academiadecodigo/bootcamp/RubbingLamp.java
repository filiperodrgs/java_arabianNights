package org.academiadecodigo.bootcamp;

public class RubbingLamp {
    public static void main(String[] args) {

        MagicLamp lamp1 = new MagicLamp(2);
        MagicLamp lamp2 = new MagicLamp(2);
        //MagicLamp Lamp2 = new MagicLamp();

        Genie genie1 = lamp1.rubbingLamp();
        //lamp1.rubbingLamp();
        //lamp1.rubbingLamp();
        //lamp1.rubbingLamp();
        genie1.askAWish();
        genie1.askAWish();
        genie1.askAWish();
        genie1.askAWish();
        Genie genie2 = lamp1.rubbingLamp();
        genie2.askAWish();
        genie2.askAWish();
        genie2.askAWish();
        RecyclableDemon demon = (RecyclableDemon)(lamp1.rubbingLamp());
        demon.askAWish();
        demon.askAWish();
        lamp1.recycle(demon);
        demon.askAWish();
        Genie genie3 = lamp1.rubbingLamp();
        genie3.askAWish();

        lamp1.comparingLamps(lamp2);



    }
}
