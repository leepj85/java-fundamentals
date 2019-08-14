package inheritance;

public class Review {

    //Instance variables
    String author;
    int starRating;
    String review;
    Business business;
    String movie;


    //Constructor
    public Review(String author, int starRating, String review, Business business) {
        this.author = author;
        this.starRating = starRating;
        this.review = review;
        this.business = business;
    }

    public Review(String author, int starRating, String review, Business business, String movie) {
        this.author = author;
        this.starRating = starRating;
        this.review = review;
        this.business = business;
        this.movie = movie;
    }

    //Instance methods
    public String toString() {
        return String.format("AUTHOR: %s STAR RATING: %d REVIEW: %s", this.author, this.starRating, this.review);
    }
}

