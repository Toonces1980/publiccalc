package pajerowski.tony;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 1/14/17.
 */
public class CalcDisplayTest {
    CalcDisplay display;

    @Before
    public void setup() {
        display = new CalcDisplay();
    }

    @Test
    public void setDisplayTest() {
        String expected = "5";
        display.setScreenDisplay("5");
        String actual = display.getScreenDisplay();
        assertEquals("Display is expected to be set to '5'", expected,actual);
    }

    @Test
    public void getScreenDisplayTest() {
        String expected = "0";
        String actual = display.getScreenDisplay();
        assertEquals("Display is expected to return '0'", expected, actual);
    }
}
