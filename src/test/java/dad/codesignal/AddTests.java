package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTests {

    private TheJourneyBegins tjb;

    @Before
    public void setup() {
        this.tjb = new TheJourneyBegins();
    }

    @Test
    public void test1() {
        assertEquals(3, tjb.add(1, 2));
    }

    @Test
    public void test2() {
        assertEquals(1000, tjb.add(0, 1000));
    }

    @Test
    public void test3() {
        assertEquals(-37, tjb.add(2, -39));
    }

    @Test
    public void test4() {
        assertEquals(199, tjb.add(99, 100));
    }

}
