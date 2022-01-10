import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Before
    public void before(){
        System.out.println("Running on before...." + this.getClass());
    }

    @After
    public void after(){
        System.out.println("Running of after..." + this.getClass());
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Running before class" );
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Running after class" );
    }


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