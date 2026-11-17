import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int pubYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();


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
    public double getRating() {
        return rating;
    }
    public void addReview(String review){
        reviews.add(review);
    }
    public int getReviewCount() {
        return reviews.size();
    }
}
