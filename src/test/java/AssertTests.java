import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTests {

    MyMath myMath = new MyMath();


    @Before
    public void before(){
        System.out.println("Running on before....");
    }

    @After
    public void after(){
        System.out.println("Running of after...");
    }

    @Test
    public void test(){

        assertEquals(1, 1);

        assertTrue(true);

        assertFalse(false);

        assertArrayEquals(new int[] {1,3}, new int[] {1,3});

    }


}