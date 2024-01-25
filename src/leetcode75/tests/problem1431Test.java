package leetcode75.tests;

import leetcode75.problem1768;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem1431Test {

    @Test
    void kidsWithCandies() {
        assertTrue(problem1431.kidsWithCandies([2,3,5,1,3]) == [true,true,true,false,true]);
        assertTrue(problem1431.kidsWithCandies([4,2,1,1,2]) == [true,false,false,false,false]);
        assertTrue(problem1431.kidsWithCandies([12,1,12]) == [true,false,true]);
    }
}