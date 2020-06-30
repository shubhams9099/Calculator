import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
public class StringCalculatorTest {
    @Test
    void testNumbersByComma1() {
        StringCalculator sc=new StringCalculator();
        int expected=0;
        int actual=sc.Add("");
        assertEquals(expected,actual);
    }
    @Test
    void testNumbersByComma2() {
        StringCalculator sc=new StringCalculator();
        int expected=6;
        int actual=sc.Add("1,2,3");
        assertEquals(expected,actual);
    }
    @Test
    void testNumbersByComma3() {
        StringCalculator sc=new StringCalculator();
        int expected=11;
        int actual=sc.Add("1,10");
        assertEquals(expected,actual);
    }
}
