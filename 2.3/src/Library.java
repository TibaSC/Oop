import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books= new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    int i= 1;
    public void displayBooks(){
        for (Book book: books){
            System.out.println(i + ". Title: \"" + book.getTitle()
                    + "\", Author: \"" + book.getAuthor()
                    + "\", Year: " + book.getPubYear());
            i++;
        }
    }

    public void findBooksByAuthor(String author){
        for (Book book: books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("Title: \"" + book.getTitle()
                        + "\", Year: " + book.getPubYear());;
            }
        }
    }

}
