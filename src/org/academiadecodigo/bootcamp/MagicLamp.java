package org.academiadecodigo.bootcamp;

public class MagicLamp {
    /*
    Releases a new genie every time it is rubbed
When enchanted (instantiated), the maximum number of genies is set
Genies can be Friendly (even) or Grumpy (odd)
When the number of genies is exhausted, it releases a recyclable demon
Has the ability to recharge itself by recycling a demon
We can compare two lamps by their capacity,
number of remaining genies and number of times it has been recharged
     */
    private int maxNumGenie;
    private int startingGenie;
    private int numOfRubs = 0;
    private int startingRubs=0;
    private int numOfRecharges=0;

    public int getNumOfRecharges() {
        return numOfRecharges;
    }

    public MagicLamp(int maxNumGenie) {
        this.maxNumGenie = maxNumGenie;
        startingGenie = maxNumGenie;

    }

    public void recycle(RecyclableDemon demon){
    maxNumGenie= startingGenie;
    numOfRubs=startingRubs;
    demon.setRecycled();
    numOfRecharges++;
        System.out.println("Lamp recycled.");
        System.out.println("The number of Recharges is "+ numOfRecharges);
    }

    public Genie rubbingLamp() {
        Genie genie;
        int num = (int) (Math.random() * 3);
        if (num % 2 == 0 && numOfRubs < maxNumGenie) {
            genie = new FriendlyGenie(3);
            System.out.println("Friendly created");
            numOfRubs++;
        } else if (num % 2 != 0 && numOfRubs < maxNumGenie) {
            genie = new GrumpyGenie(3);
            System.out.println("Grumpy created");
            numOfRubs++;
        } else{
            genie = new RecyclableDemon(3);
            System.out.println("Demon created");
            numOfRubs++;
        }
        System.out.println(numOfRubs);
        return genie;
    }
    public void comparingLamps(MagicLamp other){
        if (getNumOfRecharges()== other.getNumOfRecharges()){
        System.out.println("Same recharges: Lamp 1:" + getNumOfRecharges() +". "+  other + ": "+ other.getNumOfRecharges());
    } else{
            System.out.println(  getNumOfRecharges()+ " : " + other.getNumOfRecharges() );
        }
    }
}
