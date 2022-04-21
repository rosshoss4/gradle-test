import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class TemperatureCalculatorTest {
    @Test
    public void testToDegree(){
        TemperatureCalculator calculator = new TemperatureCalculator();
        assertEquals(36.666668f,calculator.toDegree(98),0);
    }
 
    //@Test //This test is designed to fail.  Comment it out if you want it this test to pass.
   // public void testToFahrenheit(){
     //   TemperatureCalculator calculator = new TemperatureCalculator();
       // assertEquals("Test failed for Degree to Fahrenheit",100f,calculator.toFahrenheit(100),0);
   // }
}
