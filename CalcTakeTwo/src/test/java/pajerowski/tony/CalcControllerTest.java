package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by anthonypajerowski on 1/16/17.
 */
public class CalcControllerTest {
    CalcController controller;

    @Before
    public void setup() {
        controller = new CalcController();
    }

    @Test
    public void doMathBinaryTest() {
        String expected = "49.0";
        controller.userInput.put("left", "7");
        controller.userInput.put("binaryOp", "^");
        controller.userInput.put("right", "2");
        controller.doMath();
        String actual = controller.userInput.get("left");
        assertEquals(expected, actual);
    }

    @Test
    public void parseInputNumberTest() throws Exception {
        String expected = "55.5";
        controller.parseInput("55.5");
        String actual = controller.userInput.get("left");
        assertEquals(expected, actual);
    }@Test

    public void parseInputBinaryOperatorTest() throws Exception {
        String expected = "+";
        controller.parseInput("+");
        String actual = controller.userInput.get("binaryOp");
        assertEquals(expected, actual);
    }

    @Test
    public void parseInputUnaryOperatorTest() throws Exception {
        String expected = "sqrt";
        controller.parseInput("sqrt");
        String actual = controller.unaryOp;
        assertEquals(expected, actual);
    }

    @Test
    public void parseInputClearTest() throws Exception {
        String expected = "0";
        controller.userInput.put("left", "6");
        controller.parseInput("clear");
        String actual = controller.userInput.get("left");
        assertEquals(expected,actual);
    }

    @Test
    public void assignInputStringTest() {
        String expected = "/";
        controller.assignInputString("/");
        String actual = controller.userInput.get("binaryOp");
        assertEquals(expected,actual);
    }

    @Test
    public void assignInputNumberTest() {
        String expected = "234245.523452345";
        controller.assignInputNumber("234245.523452345");
        String actual = controller.userInput.get(("left"));
        assertEquals(expected,actual);
    }

    @Test
    public void clearData() {
        String expected = "0";
        controller.userInput.put("left", "44");
        controller.clearData();
        String actual = controller.userInput.get("left");
        assertEquals(expected,actual);
    }

    @Test
    public void updateData() {
        String expected = "55";
        controller.userInput.put("left", "55");
        controller.updateData();
        String actual = controller.display.getScreenDisplay();
        assertEquals(expected,actual);
    }

    @Test
    public void updateMemory() {
        String expected = "0";
        controller.updateMemory("2");
        String actual = controller.userInput.get("memory");
        assertEquals(expected,actual);
    }

}



