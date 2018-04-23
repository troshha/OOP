package laba5

import org.junit.Test

class ParallelogramTest extends GroovyTestCase {
    Parallelogram parallelogramtest1 = new Parallelogram(7,7,7);
    Parallelogram parallelogramtest2 = new Parallelogram(8,8,8);
    @Test
    void testPerimetr() {
        assertEquals(10,5,parallelogramtest1.perimetr());
    }
    @Test
    void testArea() {
        assertEquals(11,8,parallelogramtest2.area());
    }
    @Test
    void testEquals() {
        assertEquals(false,parallelogramtest1.equals(parallelogramtest2));
    }
}
