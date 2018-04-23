package laba4;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewtoneTest {
    private Random rnd = new Random();
    private double x;
    private double eps = 0.001;
    private final int maxCount = 100;

    public NewtoneTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        x = rnd.nextDouble() * 26 + 25;
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sqrtNewtonTest01() {
        double r1 = Newtone.sqrtNewton(x, eps, maxCount);
        double r2 = Math.sqrt(x);
        assertTrue(Math.abs(r2 - r1) < eps);
    }

    @Test
    public void sqrtNewtonTest02() {
        double r1 = Newtone.sqrtNewton(x, eps, maxCount);
        double r2 = Math.sqrt(x);
        assertTrue(Math.abs(r2 - r1) < eps);
    }

    @Test
    public void sqrtNewtonTest03() {
        double r1 = Newtone.sqrtNewton(x, eps, maxCount);
        double r2 = Math.sqrt(x);
        assertTrue(Math.abs(r2 - r1) < eps);
    }
}