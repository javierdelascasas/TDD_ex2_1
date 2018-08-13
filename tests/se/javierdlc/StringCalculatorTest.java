package se.javierdlc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
    private StringCalculator sut;

    @Before
    public void setup() {
        sut = new StringCalculator();
    }

    @Test
    public void whenStringPassedToAddIsEmptyShouldReturnZero() {
        int result = sut.add("");
        Assert.assertEquals("Should return zero when string passed to add method is empty.", result, 0);
    }

    @Test
    public void whenStringPassedToAddHasOneComaTwoShouldReturnThree() {
        int result = sut.add("1,2");
        Assert.assertEquals("Should return 3 when string passed to add method is \"1,2\".", result, 3);
    }

    @Test
    public void whenStringPassToAddHasOneNewLineBreakTwoComaThreeShouldReturnSix() {
        int result = sut.add("1\n2,3");
        Assert.assertEquals("Should return 6 when string passed to add method is \"1\n2,3\".", result, 6);
    }
}