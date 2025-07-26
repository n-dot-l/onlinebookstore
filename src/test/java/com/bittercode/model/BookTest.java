package com.bittercode.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void testBookConstructorAndGetters() {
        Book book = new Book("123", "The Lord of the Rings", "J.R.R. Tolkien", 25.99, 10);
        assertEquals("123", book.getBarcode());
        assertEquals("The Lord of the Rings", book.getName());
        assertEquals("J.R.R. Tolkien", book.getAuthor());
        assertEquals(25.99, book.getPrice());
        assertEquals(10, book.getQuantity());
    }

    @Test
    public void testBookSetters() {
        Book book = new Book();
        book.setBarcode("456");
        book.setName("The Hobbit");
        book.setAuthor("J.R.R. Tolkien");
        book.setPrice(15.99);
        book.setQuantity(5);

        assertEquals("456", book.getBarcode());
        assertEquals("The Hobbit", book.getName());
        assertEquals("J.R.R. Tolkien", book.getAuthor());
        assertEquals(15.99, book.getPrice());
        assertEquals(5, book.getQuantity());
    }
}