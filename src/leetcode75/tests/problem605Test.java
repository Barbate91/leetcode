package leetcode75.tests;

import org.junit.jupiter.api.Test;
import leetcode75.problem605;

import static org.junit.jupiter.api.Assertions.*;

public class problem605Test {

    @Test
    public void canPlaceFlowers() {
        assertTrue(problem605.canPlaceFlowers([1,0,0,0,1],1) == true);
        assertTrue(problem605.canPlaceFlowers([1,0,0,0,1],2) == false);
    }
}