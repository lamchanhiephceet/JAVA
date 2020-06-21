import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void fizzBuzz() {
        int n = 15;
        String result = FizzBuzzTranslate.fizzBuzz(n);
        String expected = "FizzBuzz";
        assertEquals(result, expected);
    }

    @Test
    void Fizz() {
        int n = 12;
        String result = FizzBuzzTranslate.fizzBuzz(n);
        String expected = "Fizz";
        assertEquals(result, expected);
    }

    @Test
    void Buzz() {
        int n = 25;
        String result = FizzBuzzTranslate.fizzBuzz(n);
        String expected = "Buzz";
        assertEquals(result, expected);
    }

    @Test
    void non_FizzBuzz() {
        int n = 22;
        String result = FizzBuzzTranslate.fizzBuzz(n);
        String expected = n+ "khong chia het cho ca 3 & 5";
        assertEquals(result, expected);
    }
}