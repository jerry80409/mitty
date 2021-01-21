package max_increase_to_keep_city_skyline;

/**
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
 * We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings).
 * Height 0 is considered to be a building as well.
 *
 * At the end, the "skyline" when viewed from all four directions of the grid,
 * i.e. top, bottom, left, and right, must be the same as the skyline of the original grid.
 * A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.
 *
 * Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
 * Output: 35
 * Explanation:
 * The grid is:
 * [ [3, 0, 8, 4],
 *   [2, 4, 5, 7],
 *   [9, 2, 6, 3],
 *   [0, 3, 1, 0] ]
 *
 * gridNew = [ [8, 4, 8, 7],
 *             [7, 4, 7, 7],
 *             [9, 4, 8, 7],
 *             [3, 3, 3, 3] ]
 *
 * output 計算矩陣差,
 * 35 = 5 + 4 + 0 + 3 + 5 + 0 + 2 + 0 + 0 + 2 + 2 + 4 + 3 + 0 + 2 + 3
 */
class MaxIncreaseToKeepCitySkyline {

    static int maxIncreaseKeepingSkyline(int[][] grid) {
        // 水平最高
        int[] rowMax = new int[grid.length];
        // 垂直最高
        int[] colMax = new int[grid[0].length];

        // 走訪 arrays
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > rowMax[i]) {
                    rowMax[i] = grid[i][j];
                }
                if (grid[i][j] > colMax[j]) {
                    colMax[j] = grid[i][j];
                }
            }
        }

        // 計算樓層差
        int sum = 0;
        for (int i = 0; i < rowMax.length; i++) {
            for (int j = 0; j < colMax.length; j++) {
                int increment = Math.min(rowMax[i], colMax[j]) - grid[i][j];
                sum += increment;
            }
        }

        return sum;
    }
}
