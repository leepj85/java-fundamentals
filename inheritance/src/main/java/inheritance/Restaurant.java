package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    //Instance variables
    String name;
    double starRating;
    String price;
    List<Review> reviews;

    //Constructor
    public Restaurant(String name, String price) {
        this.name = name;
        this.starRating = 0;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    //Instance methods
    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            updateStarRating();
        }
    }

    private void updateStarRating() {
        int total = 0;
        for (Review review: reviews) {
            total += review.starRating;
        }
    }

    public String toString() {
        String output = String.format("Restaurant Name: %s\nStar Rating: %.2f\nPrice: %s",
                this.name, this.starRating, this.price);
        return output;
    }
}
