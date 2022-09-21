package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdjacentElementsProductTests {

    private TheJourneyBegins tjb;

    @Before
    public void setup() {
        this.tjb = new TheJourneyBegins();
    }

    @Test
    public void test1() {
        assertEquals(21, tjb.adjacentElementsProduct(new int[] { 3, 6, -2, -5, 7, 3 }));
    }

    @Test
    public void test2() {
        assertEquals(2, tjb.adjacentElementsProduct(new int[] { -1, -2 }));
    }

    @Test
    public void test3() {
        assertEquals(6, tjb.adjacentElementsProduct(new int[] { 5, 1, 2, 3, 1, 4 }));
    }

    @Test
    public void test4() {
        assertEquals(6, tjb.adjacentElementsProduct(new int[] { 1, 2, 3, 0 }));
    }

}
