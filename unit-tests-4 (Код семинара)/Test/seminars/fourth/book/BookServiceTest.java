package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;
    @BeforeEach
    void setUp(){
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }
    @Test
    void testBookServiseFindBookByID() {

        when(bookRepository.findById("1")).thenReturn(new Book("1","Book1", "Author1"));

        assertEquals(new Book("1","Book1", "Author1").getTitle(), bookService.findBookById("1").getTitle());

        //verify(bookRepository).findById("1");
    }

    @Test
    void testBookServiseFindAll() {
        ArrayList<Book> books = new ArrayList();
        Book bookOne = new Book("1", "Book1", "Author1");
        Book bookTwo = new Book("2", "Book2", "Author2");

        books.add(bookOne);
        books.add(bookTwo);

        when(bookRepository.findAll()).thenReturn(books);

        assertEquals(books,bookService.findAllBooks());


    }
}