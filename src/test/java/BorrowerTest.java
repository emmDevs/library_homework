import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book warAndPeace;
    private Book theSecretGarden;

    @Before
    public void setUp(){
        borrower = new Borrower();
        library = new Library(5);
        warAndPeace = new Book("War and Peace", "Leo Tolstoy", "Historical Fiction");
        theSecretGarden = new Book("The Secret Garden", "Frances Hodgson Burnett", "Fantasy Fiction");
    }

    @Test
    public void borrowerHasBorrowedBooks(){
        assertEquals(0, borrower.countBorrowedBooks());
    }
}
