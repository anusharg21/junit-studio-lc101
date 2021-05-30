package test;

import main.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void curlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[]}"));
    }
    @Test
    public void oneLeftBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void oneRightBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void doubleNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void stringInsideBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[string]"));
    }
    @Test
    public void twoNestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
    @Test
    public void threeNestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][][]]"));
    }
    @Test
    public void fourNestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][][][]]"));
    }
    @Test
    public void twoNestedCurlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[][]}"));
    }
}

