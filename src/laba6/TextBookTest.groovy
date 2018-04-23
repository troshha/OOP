package laba6

import org.junit.Test

class TextBookTest extends GroovyTestCase {
    TextBook textBooktest = new TextBook("Посібник","Автор3",2010);
    @Test
    void testToString() {
        assertEquals("TextBook Title: Посібник Author:Автор3 Year:2010",textBooktest.toString());
    }
}
