/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.du.tranlam;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Lam Tran
 */
public class DiceStatisticsTest {
    Dice testDiceOne = new Dice(2);
    Dice testDiceTwo = new Dice(4);
    
    /**
     *
     */
    public DiceStatisticsTest() {
    }
    
    /**
     * Test of addDice method, of class DiceStatistics.
     */
    @Test
    public void testAddDice() {
        System.out.println("addDice");
        DiceStatistics instance = new DiceStatistics(); // default since two dice testing
        instance.addDice(testDiceOne);
        int result = 2;
        assertEquals(result, instance.getNumberOfSides());
        instance.addDice(testDiceTwo);
        result = 6;
        assertEquals(result, instance.getNumberOfSides());
    }

    /**
     * Test of rollTheDice method, of class DiceStatistics.
     */
    @Test
    public void testRollTheDice() {
        System.out.println("rollTheDice");
        int numberOfRolls = 1000;
        DiceStatistics instance = new DiceStatistics(); //default since two dice testing
        instance.addDice(testDiceOne);
        instance.addDice(testDiceTwo);
        instance.rollTheDice(numberOfRolls);
        int result = 0;
        for(int i = 0; i < instance.getNumberOfSides(); i++) {
            result += instance.getTotalArrayList().get(i); // add up totals from arraylist to check 1000 dice rolls
        }
        assertEquals(result, numberOfRolls); // testing if roll outputs total 1000 rolls
    }
}
