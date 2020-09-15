package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testNoBrackets(){
        String test = "";
        boolean retVal = false;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertTrue(retVal);
    }

    @Test
    public void testOpenBracket(){
        String test = "[";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    @Test
    public void onlyBrackets(){
        String test = "[]";
        boolean retVal = false;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertTrue(retVal);
    }

    @Test
    public void testClosedBracket(){
        String test = "]";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    @Test
    public void testBracketsOrder(){
        String test = "][";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    @Test
    public void testCharsAndBrackets(){
        String test = "ab[c12]3";
        boolean retVal = false;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertTrue(retVal);
    }

    @Test
    public void testCharsAndReversedBrackets(){
        String test = "aBc]ij[";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    @Test
    public void testCharsAndOneBracket(){
        String test = "v4sj[sk";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }
}
