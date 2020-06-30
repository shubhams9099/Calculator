import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
public class StringCalculatorTest {
    @Test
    void testNumbersByComma1() {
        StringCalculator sc=new StringCalculator();
        int expected=16;
        int actual=sc.Add("//;\n11;2;3");
        assertEquals(expected,actual);
    }
    @Test
    void testNumbersByComma2() {
        StringCalculator sc=new StringCalculator();
        int expected=46;
        int actual=sc.Add("//;\n11;2;33");
        assertEquals(expected,actual);
    }
}
