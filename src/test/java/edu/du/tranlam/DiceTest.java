package edu.du.tranlam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lam Tran
 */
public class DiceTest {
    
    /**
     *
     */
    public DiceTest() {
    }
    
     /**
     * Test of roll method, of class Dice.
     */
    @Test
    public void testDefaultDiceRoll() {
        Dice dice = new Dice();
        dice.roll();
        boolean result = ((dice.getNumberShowing() >= 0) && (dice.getNumberShowing() <= dice.getNumberOfSides()));
        assertTrue(result);
    }
    
    /**
     * Test of roll method, of class Dice.
     */
    @Test
    public void testInputDiceRoll() {
        Dice dice = new Dice(7);
        dice.roll();
        boolean result= ((dice.getNumberShowing() >= 0) && (dice.getNumberShowing() <= dice.getNumberOfSides()));
        assertTrue(result);
    }
}
