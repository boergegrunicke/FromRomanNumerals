import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by boerg on 21.02.2017.
 */
public class NumeralsTester {

    private NumeralsConverter numeralsConverter;

    @Before
    public void init() {
        numeralsConverter = new NumeralsConverter();
    }

    @Test
    public void testOne() {
        Assert.assertEquals(1, numeralsConverter.convertFromRomanNumerals("I"));
    }

    @Test
    public void testTwo() {
        Assert.assertEquals(2, numeralsConverter.convertFromRomanNumerals("II"));
    }

    @Test
    public void testThree() {
        Assert.assertEquals(4, numeralsConverter.convertFromRomanNumerals("IV"));
    }

    @Test
    public void testFour() {
        Assert.assertEquals(5, numeralsConverter.convertFromRomanNumerals("V"));
    }

    @Test
    public void testFive() {
        Assert.assertEquals(9, numeralsConverter.convertFromRomanNumerals("IX"));
    }

    @Test
    public void testSix() {
        Assert.assertEquals(42, numeralsConverter.convertFromRomanNumerals("XLII"));
    }

    @Test
    public void testSeven() {
        Assert.assertEquals(99, numeralsConverter.convertFromRomanNumerals("XCIX"));
    }

    @Test
    public void testEight() {
        Assert.assertEquals(2013, numeralsConverter.convertFromRomanNumerals("MMXIII"));
    }
}
