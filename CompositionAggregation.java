import java.util.ArrayList;
import java.util.List;

public class CompositionAggregation {
    public static void main(String[] args) {

        Library lib=new Library();

        Book book1= new Book("Harry Potter","James");
        Book book2 = new Book("You can do it","Herih");

        lib.addBook(book1);
        lib.addBook(book2);

        lib.display();
    }
}

class Book{
    String title;
    String author;
    Book(String title,String author){
        this.author=author;
        this.title=title;
    }
    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }
}

class Library{
    List<Book> books;
    Library(){
        books=new ArrayList<Book>();
    }
    void addBook(Book book){
        books.add(book);
    }
    void display(){
        for (Book book : books) {
            book.display();
        }
    }
}
