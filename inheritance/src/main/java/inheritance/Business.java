package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Business {
    private String name;
    private double starRating;
    private List<Review> reviews;

    public Business(String name, double starRating) {
        this.name = name;
        this.starRating = starRating;
        this.reviews = new LinkedList<>();
    }

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

    public String getName() {
        return this.name;
    }

    public double getStarRating() {
        return this.starRating;
    }

    public List getReviews() {
        return this.reviews;
    }
    public String toString() {
        return String.format("NAME: %s STAR RATING: %.2f", this.name, this.starRating);
    }

}
