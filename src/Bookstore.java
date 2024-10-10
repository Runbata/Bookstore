
import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> books;

    public Bookstore(){
        books=new ArrayList<>();
    }

    public Bookstore(List<Book> books) { this.books = books; }

    public List<Book> getBooks(List<Book> books){
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void buyBook(Client client,Book book){
        System.out.println("Клиент" + client.getName() + "си купи" + book.getTitle());
        client.getBoughtBooks().add(book);
    }
}
