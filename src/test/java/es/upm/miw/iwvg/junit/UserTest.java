package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User u;

    @Before
    public void before() {
    	u = new User(23, "lewis", "carroll");
    }

    @Test
    public void testFormat() {
        assertEquals("Lewis Carroll", u.fullName());
    }

	@Test
    public void testInitials() {
        assertEquals("L.", u.initials());
    }

	@Test
    public void testGetName() {
        assertEquals("Lewis", u.getName());
    }

	@Test
    public void testGetFamilyName() {
        assertEquals("Carroll", u.getFamilyName());
    }
	
	@Test
    public void testNameGenFormat() {
        assertEquals("Mr./Mrs. Carroll", u.nameGenFormat());
    }

	@Test
    public void testGetNumber() {
        assertEquals(23, u.getNumber());
    }

}
