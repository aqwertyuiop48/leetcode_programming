/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */

class Solution {
    public int maximumProduct(int[] nums) {
        return Optional.of(Arrays.stream(nums).sorted().toArray()).map(s -> Math.max(s[s.length - 1] * s[s.length - 2] * s[s.length - 3], s[s.length - 1] * s[0] * s[1])).get();
    }
}
