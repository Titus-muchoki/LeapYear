import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeepYearTest {
    @Test
   public void runLeepYear_forNumberDivisibleBy4_True() {
        LeepYear leepYear = new LeepYear();
        assertEquals(true, leepYear.runLeapYear(2012));
    }
    @Test
   public void runLeepYear_forNumberDivisibleBy4_False() {
        LeepYear leepYear = new LeepYear();
        assertEquals(false, leepYear.runLeapYear(1999));
    }

    @Test
   public void runLeepYear_forMultipleOf400_true() {
        LeepYear leepYear = new LeepYear();
        assertEquals(true, leepYear.runLeapYear(2000));
    }

    @Test
   public void runLeepYear_forMultipleOf100_False() {
        LeepYear leepYear = new LeepYear();
        assertEquals(false, leepYear.runLeapYear(1900));
    }
}