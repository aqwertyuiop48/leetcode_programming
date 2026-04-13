/*
 * @lc app=leetcode id=1232 lang=java
 *
 * [1232] Check If It Is a Straight Line
 */

class Solution {
    public boolean checkStraightLine(int[][] co) {
        return IntStream.range(0, co.length - 2)
            .allMatch(i -> (co[i + 1][1] - co[i][1]) * (co[i + 2][0] - co[i + 1][0]) == (co[i + 2][1] - co[i + 1][1]) * (co[i + 1][0] - co[i][0]));
    }
}
