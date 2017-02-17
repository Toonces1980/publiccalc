package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 1/16/17.
 */
public class CalcUnaryTest {
    CalcUnary unary;

    @Before
    public void setup() {
        unary = new CalcUnary();
    }

    @Test
    public void unaryMathPowerTwoTest() {
        String expected = "4.0";
        String actual = unary.unaryMath("2", "^2");
        assertEquals(expected, actual);
    }


    @Test
    public void unaryMathSquarRootTest(){
        String expected = "2.0";
        String actual = unary.unaryMath("4","sqrt");
        assertEquals(expected,actual);
    }

    @Test
    public void unaryMathInvertSignTest(){
        String expected = "-10.0";
        String actual = unary.unaryMath("10","+/-");
        assertEquals(expected,actual);
    }

    @Test
    public void unaryMathInverseNumberTest(){
        String expected = "100.0";
        String actual = unary.unaryMath(".01","1/x");
        assertEquals(expected,actual);
    }
//
//    @Test
//    public void unaryMathSinRadiansTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathCosRadiansTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathTanRadiansTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathSinDegreesTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathCosDegreesTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathTanDegreesTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathInverseSinRadiansTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathInverseCosRadiansTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void unaryMathInverseTanRadiansTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//    @Test
//    public void unaryMathInverseSinDegreesTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//    @Test
//    public void unaryMathInverseCosDegreesTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
//    @Test
//    public void unaryMathInverseTanDegreesTest(){
//        String expected = ;
//        String actual = ;
//        assertEquals(expected,actual);
//    }
    @Test
    public void unaryMathLogTest(){
        String expected = "2.0";
        String actual = unary.unaryMath("100","log");
        assertEquals(expected,actual);
    }
    @Test
    public void unaryMathPITest(){
        String expected = Double.toString(Math.PI);
        String actual = unary.unaryMath("234234234","PI");
        assertEquals(expected,actual);
    }
}












