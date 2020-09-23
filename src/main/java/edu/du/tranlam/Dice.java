package edu.du.tranlam;
import java.util.Random;

/**
 *
 * @author Lam Tran
 */
public class Dice {
    private static Random randomInstance = new Random();
    private int numberShowing;
    private int numberOfSides;
    final int DEFAULT_DIE_SIDES = 6;

    /**
     *
     * @return
     */
    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     *
     * @param numberOfSides
     */
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    
    /**
     * default constructor
     */
    public Dice() {
        numberOfSides = DEFAULT_DIE_SIDES;
    }
    
    //a new constructor that sets the numberOfSides field

    /**
     *
     * @param numberOfSides
     */
    public Dice (int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    /**
     *
     * @return
     */
    public Random getRandomInstance() {
        return randomInstance;
    }

    /**
     *
     * @param randomInstance
     */
    public void setRandomInstance(Random randomInstance) {
        this.randomInstance = randomInstance;
    }

    /**
     *
     * @return
     */
    public int getNumberShowing() {
        return numberShowing;
    }
    
    /**
     *
     * @param numberShowing
     */
    public void setNumberShowing(int numberShowing) {
        this.numberShowing = numberShowing;
    }

    
// Obtain a number between [0 - number of sides].

    /**
     *
     */
    public void roll(){
        int r = randomInstance.nextInt(numberOfSides);
        r +=1;
        this.numberShowing = r;

    } 

}
