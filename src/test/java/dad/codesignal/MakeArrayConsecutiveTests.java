package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeArrayConsecutiveTests {

    private TheJourneyBegins tjb;

    @Before
    public void setup() {
        this.tjb = new TheJourneyBegins();
    }

    @Test
    public void test1() {
        assertEquals(3, tjb.makeArrayConsecutive(new int[] { 6, 2, 3, 8 }));
    }

    @Test
    public void test2() {
        assertEquals(2, tjb.makeArrayConsecutive(new int[] { 0, 3 }));
    }

    @Test
    public void test3() {
        assertEquals(0, tjb.makeArrayConsecutive(new int[] { 5, 4, 6 }));
    }

    @Test
    public void test4() {
        assertEquals(2, tjb.makeArrayConsecutive(new int[] { 6, 3 }));
    }

}
