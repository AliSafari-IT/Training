package guessNumber;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ali
 */
public class UserNumberBeanTest {
    
    public UserNumberBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getResponse method, of class UserNumberBean.
     */
    @Test
    public void testGetResponse() {
        System.out.println("getResponse");
        UserNumberBean instance = new UserNumberBean();
        String expResult = "";
        String result = instance.getResponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserNumber method, of class UserNumberBean.
     */
    @Test
    public void testGetUserNumber() {
        System.out.println("getUserNumber");
        UserNumberBean instance = new UserNumberBean();
        Integer expResult = null;
        Integer result = instance.getUserNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserNumber method, of class UserNumberBean.
     */
    @Test
    public void testSetUserNumber() {
        System.out.println("setUserNumber");
        Integer userNumber = null;
        UserNumberBean instance = new UserNumberBean();
        instance.setUserNumber(userNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public static void main(String[] args) {
        UserNumberBean unb = new UserNumberBean();
    }
}
