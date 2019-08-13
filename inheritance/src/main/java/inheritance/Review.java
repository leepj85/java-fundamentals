package inheritance;

public class Review {

    //Instance variables
    String author;
    int starRating;
    String review;


    //Constructor
    public Review(String author, int starRating, String review) {
        this.author = author;
        this.starRating = starRating;
        this.review = review;
    }

    //Instance methods
    public String toString() {
        return String.format("Author: %s Star Rating: %d\nReview: %s", this.author, this.starRating, this.review);
    }

//    public String anotherString() {
//        return "Review{" +
//                "description='" + this.review + '\'' +
//                ", author='" + this.author + '\'' +
//                ", stars=" + this.starRating +
//                '}';
//    }
}

