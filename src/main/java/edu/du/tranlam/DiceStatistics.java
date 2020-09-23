/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.du.tranlam;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lam Tran
 */
public class DiceStatistics {
    private ArrayList<Dice>DiceArrayList = new ArrayList<Dice>();
    private ArrayList<Integer>totalArrayList = new ArrayList<Integer>(Collections.nCopies(500,0));
    private int numberOfDice;
    private int numberOfSides;
    private int numberOfRolls;
    final int DEFAULT_NUMBER_OF_DICE = 2;
            
    /**
     *
     */
    public DiceStatistics(){
        numberOfDice = DEFAULT_NUMBER_OF_DICE;
    };

    /**
     *
     * @param numOfDice
     */
    public DiceStatistics(int numOfDice){
        numberOfDice = numOfDice;
    };

    /**
     *
     * @param addInputDice
     */
    public void addDice (Dice addInputDice){
        DiceArrayList.add(addInputDice);
        numberOfSides += addInputDice.getNumberOfSides();
        
    };
    /* Contains an integer array called valueTotals to update per dice roll set and updates
     * the array list after
     */

    /**
     *
     * @param numberOfRolls
     */

    public void rollTheDice (int numberOfRolls) {
        int DiceSum;
        for (int i = 0; i < numberOfRolls; i++){
            DiceSum = 0;
            for(int j = 0; j < numberOfDice; j++){
                DiceArrayList.get(j).roll();
                DiceSum += DiceArrayList.get(j).getNumberShowing();
            }
            totalArrayList.set(DiceSum-1, totalArrayList.get(DiceSum-1)+1);
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Dice> getDiceArrayList() {
    return DiceArrayList;
}

    /**
     *
     * @param DiceArrayList
     */
    public void setDiceArrayList(ArrayList<Dice> DiceArrayList) {
    this.DiceArrayList = DiceArrayList;
}

    /**
     *
     * @return
     */
    public ArrayList<Integer> getTotalArrayList() {
        return totalArrayList;
    }

    /**
     *
     * @param totalArrayList
     */
    public void setTotalArrayList(ArrayList<Integer> totalArrayList) {
        this.totalArrayList = totalArrayList;
    }

    /**
     *
     * @return
     */
    public int getNumberOfDice() {
        return numberOfDice;
    }

    /**
     *
     * @param numberOfDice
     */
    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

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
     *
     * @return
     */
    public int getNumberOfRolls() {
        return numberOfRolls;
    }

    /**
     *
     * @param numberOfRolls
     */
    public void setNumberOfRolls(int numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
    }
}

