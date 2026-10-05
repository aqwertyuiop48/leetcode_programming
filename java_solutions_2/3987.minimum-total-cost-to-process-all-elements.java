/*
 * @lc app=leetcode id=3987 lang=java
 *
 * [3987] Minimum Total Cost to Process All Elements
 */

class Solution {
public int minimumCost(int[] nums, int k) {
    return (int) LongStream.of(Arrays.stream(nums).asLongStream().sum()).map(s -> s / k - (s % k == 0 ? 1 : 0)).map(t -> (t % 1_000_000_007L) * ((t + 1) % 1_000_000_007L) / 2 % 1_000_000_007L).sum();
}
}
