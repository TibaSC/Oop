import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books= new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        int i= 1;
        for (Book book: books){
            System.out.println(i + ". Title: \"" + book.getTitle()
                    + "\", Author: \"" + book.getAuthor()
                    + "\", Year: " + book.getPubYear());
            i++;
        }
        i= 1;
    }

    public void findBooksByAuthor(String author){
        for (Book book: books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("Title: \"" + book.getTitle()
                        + "\", Year: " + book.getPubYear());;
            }
        }
    }

    public void borrowBook(String title){
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println(title + " has been borrowed.");
                return;
            }
        }
        System.out.println(title + " is not available.");
    }

    public void returnBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " has been returned.");
    }


}
