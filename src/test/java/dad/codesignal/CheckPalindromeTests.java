package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTests {

    private TheJourneyBegins tjb;

    @Before
    public void setup() {
        this.tjb = new TheJourneyBegins();
    }

    @Test
    public void test1() {
        assertEquals(true, tjb.checkPalindrome("aabaa"));
    }

    @Test
    public void test2() {
        assertEquals(false, tjb.checkPalindrome("abac"));
    }

    @Test
    public void test3() {
        assertEquals(true, tjb.checkPalindrome("a"));
    }

    @Test
    public void test4() {
        assertEquals(false, tjb.checkPalindrome("az"));
    }

}
