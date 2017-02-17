package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 1/16/17.
 */
public class CalcBinaryTest {
    CalcBinary binary;

    @Before
    public void setup() {
        binary = new CalcBinary();
    }

    @Test
    public void binaryMathAddTest() {
        String expected = "9.0";
        String actual = binary.binaryMath("5","+","4");
        assertEquals("I expect the result of 5 + 4 to be 9", expected,actual);
    }

    @Test
    public void binaryMathSubtractTest() {
        String expected = "1.0";
        String actual = binary.binaryMath("5","-","4");
        assertEquals("I expect the result of 5 + 4 to be 1", expected,actual);
    }

    @Test
    public void binaryMathMultiplyTest() {
        String expected = "20.0";
        String actual = binary.binaryMath("5","*","4");
        assertEquals("I expect the result of 5 * 4 to be 20", expected,actual);
    }

    @Test
    public void binaryMathDivideTest() {
        String expected = "3.0";
        String actual = binary.binaryMath("12","/","4");
        assertEquals("I expect the result of 12 / 4 to be 3", expected,actual);
    }

    @Test
    public void binaryMathPowerTest() {
        String expected = "8.0";
        String actual = binary.binaryMath("2","^","3");
        assertEquals("I expect the result of 2 ^ 3 to be 8", expected,actual);
    }
}
