/*
 * @lc app=leetcode id=164 lang=java
 *
 * [164] Maximum Gap
 */

class Solution {
    public int maximumGap(int[] nums) {
        return Optional.of(Arrays.stream(nums).sorted().toArray()).map(sorted -> IntStream.range(0, sorted.length - 1).map(i -> sorted[i + 1] - sorted[i]).max().orElse(0)).get();
    }
}
