/*
 * @lc app=leetcode id=2078 lang=java
 *
 * [2078] Two Furthest Houses With Different Colors
 */

class Solution {
    public int maxDistance(int[] colors) {
        return IntStream.range(0, colors.length)
            .map(i -> colors[i] != colors[colors.length - 1] ? colors.length - 1 - i : 0)
            .map(dist -> Math.max(dist, IntStream.range(0, colors.length)
                .map(j -> colors[0] != colors[j] ? j : 0)
                .max().orElse(0)))
            .max()
            .orElse(0);
    }
}
