package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Business test = new Business("test", 5.0);
    Review testReview = new Review("Peter", 4, "I love it!", test);
    @Test
    public void testToString() {
        assertEquals("AUTHOR: Peter STAR RATING: 4 REVIEW: I love it!", testReview.toString());

    }


}