package leetcode75.tests;

import leetcode75.problem1431;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class problem1431Test {

    @Test
    void kidsWithCandies() {
        assertTrue(problem1431.kidsWithCandies(new int[]{2,3,5,1,3},3).equals(new ArrayList<>(Arrays.asList(true,true,true,false,true))));
        assertTrue(problem1431.kidsWithCandies(new int[]{4,2,1,1,2},1).equals(new ArrayList<>(Arrays.asList(true, false, false, false, false))));
        assertTrue(problem1431.kidsWithCandies(new int[]{12,1,12},5).equals(new ArrayList<>(Arrays.asList(true,false,true))));
    }
}