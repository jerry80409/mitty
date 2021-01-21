package max_increase_to_keep_city_skyline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxIncreaseToKeepCitySkylineTest {

    @Test
    void test1() {
        int[][] grid = new int[][]{
            {3, 0},
            {2, 4}
        };
        int act = MaxIncreaseToKeepCitySkyline.maxIncreaseKeepingSkyline(grid);

        assertEquals(4, act);
    }

    @Test
    void test2() {
        int[][] grid = new int[][]{
            {3, 0, 8, 4},
            {2, 4, 5, 7},
            {9, 2, 6, 3},
            {0, 3, 1, 0}
        };
        int act = MaxIncreaseToKeepCitySkyline.maxIncreaseKeepingSkyline(grid);

        assertEquals(35, act);
    }
}