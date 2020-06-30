import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
public class StringCalculatorTest {
    @Test
    void testNumbersByComma1() {
        StringCalculator sc=new StringCalculator();
        int expected=10;
        int actual=sc.Add("1\n2,3\n4");
        assertEquals(expected,actual);
    }
    @Test
    void testNumbersByComma2() {
        StringCalculator sc=new StringCalculator();
        int expected=58;
        int actual=sc.Add("11\n,3,44");
        assertEquals(expected,actual);
    }
}
