package inheritance;

import inheritance.Restaurant;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RestaurantTest {

    Restaurant test;
    @Before
    public void setUp() throws Exception {
    test = new Restaurant("Taco Time", "$");
    }

    @Test
    public void testToString() {
//        System.out.println(test.toString());
        assertEquals("Restaurant Name: Taco Time\n" +
                "Star Rating: 0.00\n" +
                "Price: $", test.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant pizzaHut = new Restaurant("Pizza Hut", "$");
        Review myReview = new Review("Peter", 4, "pizza for the win!");
        pizzaHut.addReview(myReview);
        System.out.println(pizzaHut.reviews.toString());
        assertTrue(pizzaHut.reviews.contains(myReview));
        pizzaHut.addReview(myReview);
        assertTrue(pizzaHut.reviews.size()==1);

    }
}