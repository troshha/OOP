package laba6

import org.junit.Test

class ManualTest extends GroovyTestCase{
    Manual manualtest = new Manual("Підручник","Автор2",2008);
    @Test
    void testToString() {
        assertEquals("Manual Title: Підручник Author:Автор2 Year:2008",manualtest.toString());
    }
}
