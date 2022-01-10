import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTests {

    MyMath myMath = new MyMath();

    @Test
    public void test(){

        assertEquals(1, 1);

        assertTrue(true);

        assertFalse(false);

        assertArrayEquals(new int[] {1,3}, new int[] {1,3});

    }


}