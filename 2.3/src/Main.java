public class Main {
    public static void main(String[] args){
        Library library= new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        book1.setRating(4.5);
        book2.setRating(5.0);
        book3.setRating(3.5);

        book1.addReview("Very interesting");
        book2.addReview("Very useful");
        book2.addReview("I recommend it");
        book3.addReview("Good story");

        System.out.println("Library Catalog:");
        library.displayBooks();
        
        System.out.println("\nBooks by Author \\\"Jane Doe\\\":");
        library.findBooksByAuthor("Jane Doe");

        System.out.println();
        library.borrowBook("Introduction to Java Programming");
        System.out.println();
        library.displayBooks();

        System.out.println();
        library.returnBook(book1);
        System.out.println();
        library.displayBooks();

        System.out.println("\n"+library.isBookAvailable("Introduction to Java Programming"));

        System.out.println("\nAverage rating: " + library.getAverageBookRating());
        Book mostReviewed = library.getMostReviewedBook();
        System.out.println("\nMost reviewed book: " + mostReviewed.getTitle());
    }
}
