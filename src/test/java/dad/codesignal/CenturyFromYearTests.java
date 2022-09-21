package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CenturyFromYearTests {

    private TheJourneyBegins tjb;

    @Before
    public void setup() {
        this.tjb = new TheJourneyBegins();
    }

    @Test
    public void test1() {
        assertEquals(20, tjb.centuryFromYear(1905));
    }

    @Test
    public void test2() {
        assertEquals(17, tjb.centuryFromYear(1700));
    }

    @Test
    public void test3() {
        assertEquals(20, tjb.centuryFromYear(1998));
    }

    @Test
    public void test4() {
        assertEquals(20, tjb.centuryFromYear(2000));
    }

}
