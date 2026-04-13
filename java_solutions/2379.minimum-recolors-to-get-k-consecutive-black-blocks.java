/*
 * @lc app=leetcode id=2379 lang=java
 *
 * [2379] Minimum Recolors to Get K Consecutive Black Blocks
 */

class Solution {
    public int minimumRecolors(String blocks, int k) {
        return IntStream.rangeClosed(0, blocks.length() - k)
            .map(i -> (int) blocks.substring(i, i + k).chars().filter(c -> c == 'W').count())
            .min()
            .orElse(0);
    }
}
