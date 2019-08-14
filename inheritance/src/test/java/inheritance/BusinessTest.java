package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BusinessTest {

    Business business;
    Restaurant restaurant;
    Shop shop;
    Theater theater;
    @Before
    public void setUp() throws Exception {
        business = new Business("business", 2.5);
        restaurant = new Restaurant("Taco Time", "$");
        shop = new Shop("Best Buy", "$$$", "Electronics store" );
        theater = new Theater("Theater", 3.7);
    }

    @Test
    public void testToString() {
        assertEquals("NAME: business STAR RATING: 2.50", business.toString());
        assertEquals("NAME: Taco Time STAR RATING: 0.00 PRICE: $", restaurant.toString());
        assertEquals("NAME: Best Buy STAR RATING: 0.00 PRICE: $$$ DESCRIPTION: Electronics store", shop.toString());
        assertEquals("NAME: Theater STAR RATING: 3.70", theater.toString());
    }

    @Test
    public void testAddReview() {
        Business pizzaHut = new Restaurant("Pizza Hut", "$");
        Review myReview = new Review("Peter", 4, "pizza for the win!", pizzaHut);
        pizzaHut.addReview(myReview);
//        System.out.println(pizzaHut.getReviews().toString());
        assertTrue(pizzaHut.getReviews().contains(myReview));
        pizzaHut.addReview(myReview);
        assertTrue(pizzaHut.getReviews().size()==1);

        Review shopReview = new Review("Peter", 5, "I like electronics", shop);
        shop.addReview(shopReview);
        assertTrue(shop.getReviews().contains(shopReview));

        theater.addMovie("Lion King");
        theater.addMovie("Terminator 2");
        theater.addMovie("Another Movie");
        assertTrue(theater.getMovieList().size() == 3);
        theater.removeMovie("Terminator 2");
        assertTrue(theater.getMovieList().size() == 2);
        Review theaterReview = new Review("Peter", 2, "this theater is ghetto", theater);
        theater.addReview(theaterReview);
        List ofReviews = theater.getReviews();
//        System.out.println(theater.getReviews().toString());
        assertEquals("AUTHOR: Peter STAR RATING: 2 REVIEW: this theater is ghetto", ofReviews.get(0).toString());

        Review movieReview = new Review("Peter", 4, "what an awesome experience", theater, "Lion King");
        theater.addReview(movieReview);
        assertTrue(theater.getReviews().size() == 2);
    }


}