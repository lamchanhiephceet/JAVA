
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void case_1_1_2018() {
        int nDay = 1;
        int nMonth = 1;
        int nYear = 2018;
        String result = NextDayCalculator.nextDay( nDay, nMonth, nYear);
        String expected = "2/1/2018";
        assertEquals(expected, result);
    }

    @Test
    void case_31_1_2018() {
        int nDay = 31;
        int nMonth = 1;
        int nYear = 2018;
        String result = NextDayCalculator.nextDay( nDay, nMonth, nYear);
        String expected = "1/2/2018";
        assertEquals(expected, result);
    }

    @Test
    void case_30_04_2018() {
        int nDay = 30;
        int nMonth = 4;
        int nYear = 2018;
        String result = NextDayCalculator.nextDay( nDay, nMonth, nYear);
        String expected = "1/5/2018";
        assertEquals(expected, result);
    }

    @Test
    void case_28_2_2018() {
        int nDay = 28;
        int nMonth = 2;
        int nYear = 2018;
        String result = NextDayCalculator.nextDay( nDay, nMonth, nYear);
        String expected = "1/3/2018";
        assertEquals(expected, result);
    }

    @Test
    void case_29_2_2020() {
        int nDay = 29;
        int nMonth = 2;
        int nYear = 2020;
        String result = NextDayCalculator.nextDay( nDay, nMonth, nYear);
        String expected = "1/3/2020";
        assertEquals(expected, result);
    }

    @Test
    void case_31_12_2018() {
        int nDay = 31;
        int nMonth = 12;
        int nYear = 2018;
        String result = NextDayCalculator.nextDay( nDay, nMonth, nYear);
        String expected = "1/1/2019";
        assertEquals(expected, result);
    }
}