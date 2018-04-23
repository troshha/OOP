package laba4

import org.junit.Test

class FactorialTest extends GroovyTestCase {
    private Factorial factorialtest = new Factorial();
    @Test
    public void testFact01()
    {
        assertEquals(new BigInteger("1"),factorialtest.fact(new BigInteger("0")));
    }
    @Test
    public void testFact02()
    {
        assertEquals(new BigInteger("6"),factorialtest.fact(new BigInteger("3")));
    }

}
