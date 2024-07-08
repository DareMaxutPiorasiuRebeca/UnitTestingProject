import org.junit.jupiter.api.Assertions;

public class isPositiveTest {
    public void testCheckIfNumberIsPositive()
    {
        isPositive isPositive = new isPositive();
        boolean result = isPositive.checkIfNumberIsPositive(6);
        Assertions.assertTrue(result);

    }
}
