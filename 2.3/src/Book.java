public class Book {
    private String title;
    private String author;
    private int pubYear;
    private double rating;
    private String review;

    public Book(String title, String author, int pubYear){
        this.title= title;
        this.author= author;
        this.pubYear= pubYear;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }
    public void setRating(double rating){
         this.rating = rating;
    }
    public void addReview(String review){
        this.review= review;
    }
}
