package laba6

import org.junit.Test

class BookTest extends GroovyTestCase {
    Book bookTest = new Book("Книга","Автор",2000);
    @Test
    void testToString() {
        assertEquals("Book Title:Книга Author:Автор Year:2000",bookTest.toString());
    }
}
