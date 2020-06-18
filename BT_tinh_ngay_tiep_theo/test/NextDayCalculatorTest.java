import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDay() {
        int nDay = 1;
        int nMonth = 1;
        int nYear = 2018;
    }

    @Test
    void testNextDay() {
        int nDay = 31;
        int nMonth = 1;
        int nYear = 2018;
    }

    @Test
    void testNextDay1() {
        int nDay = 30;
        int nMonth = 4;
        int nYear = 2018;
    }

    @Test
    void testNextDay2() {
        int nDay = 28;
        int nMonth = 2;
        int nYear = 2018;
    }

    @Test
    void testNextDay3() {
        int nDay = 29;
        int nMonth = 2;
        int nYear = 2020;
    }

    @Test
    void testNextDay4() {
        int nDay = 31;
        int nMonth = 12;
        int nYear = 2018;
    }
}