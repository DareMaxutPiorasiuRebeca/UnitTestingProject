import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class IsPositiveTest {
    @Test
    public void testCheckIfNumberIsPositive()
    {
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIfNumberIsPositive(6);
        Assertions.assertTrue(result);

    }
    @Test
    public void testCheckIfNumberIsNegative(){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIfNumberIsPositive(-78);
        Assertions.assertFalse(result);
    }


    @ParameterizedTest
    @ValueSource (ints = {3,6,8,9,12})
    public void testIsPositiveParameterizedTest (int number){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIfNumberIsPositive(number);
        Assertions.assertTrue(result);

    }
}
