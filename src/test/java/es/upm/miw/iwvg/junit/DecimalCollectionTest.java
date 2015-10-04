package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection dc;

    @Before
    public void before() {
        dc = new DecimalCollection();
        dc.add(1);
    }

    @Test
    public void testSize() {
        assertEquals(1, dc.size());
    }

	@Test
    public void testSum() {
    	dc.add(1);
        assertEquals(2, dc.sum(), 10e-5);
    }

    @Test
    public void testHigher() {
    	dc.add(0);
        assertEquals(1, dc.higher(), 10e-5);
    }
    
    @Test
    public void testLower() {
    	dc.add(2);
    	assertEquals(1, dc.lower(), 10e-5);
    }

}
