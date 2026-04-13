/*
 * @lc app=leetcode id=1051 lang=java
 *
 * [1051] Height Checker
 */

class Solution {
    public int heightChecker(int[] heights) {
        return Optional.of(Arrays.stream(heights).sorted().toArray()).map(sorted -> (int) IntStream.range(0, heights.length).filter(i -> heights[i] != sorted[i]).count()).get();
    }
}
