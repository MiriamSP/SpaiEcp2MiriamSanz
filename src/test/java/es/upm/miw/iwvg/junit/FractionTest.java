package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction f;

    @Before
    public void before() {
    	f = new Fraction(4, 2);
    }

    @Test
    public void testDecimal() {
        assertEquals(2, f.decimal(), 10e-5);
    }

	@Test
    public void testGetNumerator() {
        assertEquals(4, f.getNumerator());
    }

	@Test
    public void testGetDenominator() {
        assertEquals(2, f.getDenominator());
    }

}
