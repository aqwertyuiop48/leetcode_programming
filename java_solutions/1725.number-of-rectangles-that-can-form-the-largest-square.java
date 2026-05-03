/*
 * @lc app=leetcode id=1725 lang=java
 *
 * [1725] Number Of Rectangles That Can Form The Largest Square
 */

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        return java.util.Arrays.stream(rectangles).mapToInt(r -> Math.min(r[0], r[1])).boxed().collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.TreeMap::new, java.util.stream.Collectors.counting())).lastEntry().getValue().intValue();
    }
}
