/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author alex
 */
public class TestingTest {

    public TestingTest() {
    }
    
    
    //Tests a case of only quarters
    @Test 
    public void testOnlyQuarters() {
        int[] exp = {25,25,25};
        int[] given = {25,10,5,1};
        int[] result = Testing.makeChange(given, 75);
        assertArrayEquals(exp, result);
    }

    
    //Tests with the 50 cent piece added in
    @Test
    public void testFiftyCentPiece() {
        int[] exp = {50,25,10,5,1};
        int[] given = {1,5,10,25,50};
        int[] result = Testing.makeChange(given, 91);
        assertArrayEquals(exp, result);
    }

    
    //Tests to make sure an empty array is handled
    @Test (expected = IllegalArgumentException.class)
    public void testGetMinEmptyArray() {
        int[] array = {};
        int coinVal = 42;
        Testing.makeChange(array, coinVal);
        assertTrue("Array can't be empty", array.length != 0);
    }

    
    
    //The basic test to make sure it works with standard change
    @Test
    public void testMakeChange() {
        System.out.println("makeChange");
        int[] exp = {25,10,5,1,1};
        
        int[] given = {1,5,10,25};
        int[] result = Testing.makeChange(given, 42);
        assertArrayEquals(exp, result);
        // TODO review the generated test code and remove the default call to fail.
    }


}