/**
 * Created by saoprb on 12/3/2016.
 */

import org.junit.*;

import static org.hamcrest.core.Is.is;

public class SumOfIntegersTest {

    private SumOfIntegers classToTest = null;

    @Before
    public void beforeTest() {
        classToTest = new SumOfIntegers();
    }

    @Test
    public void nullParameterTest() {
        try {
            classToTest.printSumOfIntegers(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertThat(
                    "Null parameter throws an exception",
                    "Parameter integerToSumUp cannot be null.",
                    is(ex.getMessage()));
        }
    }

    @Test
    public void numberFiveTest() {
        Integer testSum = classToTest.sumOfIntegers(new Integer(5));
        Assert.assertThat(
                "Sum total of integer 5 is 10",
                new Integer(10),
                is(testSum));
        Assert.assertTrue(new Integer(10).equals(testSum));
    }

    @Test
    public void outOfIntegerRangeTest() {
        try {
            classToTest.printSumOfIntegers(new Integer(Integer.MAX_VALUE));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
