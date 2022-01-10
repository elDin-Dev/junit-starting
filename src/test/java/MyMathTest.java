import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    public void sum_with_three_numbers(){

        int result = myMath.sum(new int[] {1,2,3});

        assertEquals(6, result);
    }


     @Test
    public void sum_with_one_number(){

        int result = myMath.sum(new int[] {5});

        assertEquals(5, result);
     }
}