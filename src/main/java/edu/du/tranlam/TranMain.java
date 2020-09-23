/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.du.tranlam;
import java.util.ArrayList;

/**
 *
 * @author Lam Tran
 */
public class TranMain {    
    static int[] valueArray;
    static int[] valueTotals;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        //rollOneDice();
        //rollTwoDice();
        //rollManyDice();
        
    }
    
    /**
     *
     */
    public static void rollOneDice() {
        final int DICE_ONE_SIDE = 7;
        Dice diceInstance = new Dice(DICE_ONE_SIDE);
        int ROLLS = 10000;
        valueArray = new int[DICE_ONE_SIDE];
        
        
        for (int i = 0; i < ROLLS; i++){
            diceInstance.roll();
            valueArray[diceInstance.getNumberShowing()-1]++;
        }

        System.out.println("The number of times each value on the dice was rolled:");
        for(int i = 0; i < DICE_ONE_SIDE; i++){
           System.out.println("Number of " + (i+1) + "'s = " + valueArray[i] + " times"); 
        }
    }
    
    /**
     *
     */
    public static void rollTwoDice() {
        Dice diceOne = new Dice();
        final int NUMBER_OF_SIDES_DICE_TWO = 4;
        Dice diceTwo = new Dice (NUMBER_OF_SIDES_DICE_TWO);
        valueTotals = new int[6+NUMBER_OF_SIDES_DICE_TWO];
        final int ROLLS = 100000;
        
        for (int i=0; i<ROLLS;i++){
        diceOne.roll();
        diceTwo.roll();
        valueTotals[(diceOne.getNumberShowing() + diceTwo.getNumberShowing())-1]++;
        }
        
        System.out.println("The number of times each value on the two dice was rolled:");
        for(int i = 0; i < 6 + NUMBER_OF_SIDES_DICE_TWO; i++){
            System.out.println("Number of " + (i+1) + "'s = " + valueTotals[i] + " times"); 
        }
    }
    
    /**
     *
     */
    public static void rollManyDice(){
        final int NUMBER_OF_DICE_ROLLING = 3;
        final int ROLLING_TIMES = 10000;
        DiceStatistics rollManyDice = new DiceStatistics (NUMBER_OF_DICE_ROLLING);
        final int NUMBER_OF_SIDES_DICE_ONE = 9;
        final int NUMBER_OF_SIDES_DICE_TWO = 6;
        final int NUMBER_OF_SIDES_DICE_THREE = 3;
        Dice diceOne = new Dice(NUMBER_OF_SIDES_DICE_ONE);
        Dice diceTwo = new Dice(NUMBER_OF_SIDES_DICE_TWO);
        Dice diceThree = new Dice(NUMBER_OF_SIDES_DICE_THREE);
       
       //Calling addDice method from statistic instance
        rollManyDice.addDice(diceOne);
        rollManyDice.addDice(diceTwo);
        rollManyDice.addDice(diceThree);
        rollManyDice.rollTheDice(ROLLING_TIMES);
        System.out.println("Printing rollManyDice results :");
        for(int i = 0; i < rollManyDice.getNumberOfSides(); i++){
            System.out.println("Sum of Dice = " + (i+1) + " was rolled " + (rollManyDice.getTotalArrayList().get(i)) + " times which is " + String.format("%.2f",((double)rollManyDice.getTotalArrayList().get(i)*100/(double)ROLLING_TIMES)) + " % of rolls");
       }
    }
}