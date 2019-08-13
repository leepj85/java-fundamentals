package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Review testReview = new Review("Peter", 4, "I love it!");
    @Test
    public void testToString() {
        assertEquals("Author: Peter Star Rating: 4\n" +
                "Review: I love it!", testReview.toString());

    }


}