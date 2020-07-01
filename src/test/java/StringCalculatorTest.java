import org.junit.jupiter.api.*;

import javax.swing.*;

import static org.junit.Assert.*;
public class StringCalculatorTest {
    @Test
    void testNumbersByComma1() {
        StringCalculator sc=new StringCalculator();
        int expected=6;
        int actual=sc.Add("//[**][@@]\\n1@@2**3");
        assertEquals(expected,actual);
    }
    @Test
    void testNumbersByComma2() {
        StringCalculator sc=new StringCalculator();
        int expected=32;
        int actual=sc.Add("//[;;][@@@]\\n1001;;30@@@2");
        System.out.println("Method is called: "+sc.GetCalledCount()+" times.");
        assertEquals(expected,actual);

    }
}
