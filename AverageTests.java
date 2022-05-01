import static org.junit.Assert.*;

import org.junit.Test;

public class AverageTests {
    @Test
    public void test2() {
        int[] testArray = {1,2,3};
        Average test = new Average();
        assertEquals(1, test.getAverage(testArray));
    }
}
