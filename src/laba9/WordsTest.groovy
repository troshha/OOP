package laba9

import org.junit.Test

class WordsTest extends GroovyTestCase {
    Words word1 = new Words();
    char s="a";
    char c="A";
    @Test
    void testIsLetter() {
        assertEquals(word1.isLetter(s),true);

    }
    @Test
    void testToLower() {
        assertEquals(word1.toLower(c),"a");
    }
}
