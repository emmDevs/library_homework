import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book warAndPeace;
    private Book theSecretGarden;

    @Before
    public void setUp(){
        library = new Library(1);
        warAndPeace = new Book("War and Peace", "Leo Tolstoy", "Historical Fiction");
        theSecretGarden = new Book("The Secret Garden", "Frances Hodgson Burnett", "Fantasy Fiction");
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibraryEnoughSpace(){
        library.addBook(warAndPeace);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void addBookToLibraryNotEnoughSpace(){
        library.addBook(warAndPeace);
        library.addBook(theSecretGarden);
        assertEquals(1, library.countBooks());
    }
}
