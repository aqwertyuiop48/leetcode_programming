/*
 * @lc app=leetcode id=1854 lang=java
 *
 * [1854] Maximum Population Year
 */

class Solution {
    public int maximumPopulation(int[][] logs) {
        return java.util.stream.IntStream.range(1950, 2051).mapToObj(y -> new int[]{y, (int)java.util.Arrays.stream(logs).filter(l -> l[0] <= y && y < l[1]).count()}).max((a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]).get()[0];
    }
}
