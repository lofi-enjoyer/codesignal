package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeAreaTests {

    private TheJourneyBegins tjb;

    @Before
    public void setup() {
        this.tjb = new TheJourneyBegins();
    }

    @Test
    public void test1() {
        assertEquals(5, tjb.shapeArea(2));
    }

    @Test
    public void test2() {
        assertEquals(13, tjb.shapeArea(3));
    }

    @Test
    public void test3() {
        assertEquals(1, tjb.shapeArea(1));
    }

    @Test
    public void test4() {
        assertEquals(41, tjb.shapeArea(5));
    }

}
