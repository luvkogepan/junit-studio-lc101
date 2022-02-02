package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
//balanced brackets returns true
    @Test
    public void onlyBracketsReturnedTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
//balanced brackets with non bracket characters before brackets returns true
    @Test
    public void balancedBracketsWithNonBracketCharactersBeforeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]"));
    }
//balanced brackets with non bracket characters after brackets returns true
    @Test
    public void balancedBracketsWithNonBracketCharactersAfterBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
//balanced brackets with non bracket characters inside brackets returns true
    @Test
    public void balancedBracketsWithNonBracketCharactersInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
//balanced brackets with non bracket characters inside and outside brackets returns true
    @Test
    public void balancedBracketsWithNonBracketCharactersInsideAndOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[LaunchCode]Code"));
    }
//one left bracket returns false
    @Test
    public void oneLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
//one right bracket returns false
    @Test
    public void oneRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
//two brackets with reversed order balanced brackets returns false
    @Test
    public void twoBracketsWithReverseOrderBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
//two brackets with reversed order balanced brackets and non bracket characters returns false
    @Test
    public void twoBracketsWithReverseOrderBalancedBracketsAndNonBracketCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]LaunchCode[Code"));
    }
//uneven number of brackets returns false
    @Test
    public void unevenNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
//empty string returns true
    @Test
    public void emptyStringReturnsTrueForBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
//two pair of balanced brackets returns true
    @Test
    public void twoPairOfBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
//two pair of nested balanced brackets returns true
    @Test
    public void twoPairOfNestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
}
