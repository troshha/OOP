package laba8

import org.junit.Test

class CezarTest extends GroovyTestCase {
    Cezar cezar = new Cezar();
    String s="ABS";
    @Test
    void testEncrypt() {
        assertEquals(cezar.encrypt(s,3),"DEV");
    }
    @Test
    void testDecrypt() {
        assertEquals(cezar.decrypt(s,3),"XYP");
    }
}
