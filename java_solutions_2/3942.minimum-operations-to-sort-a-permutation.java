/*
 * @lc app=leetcode id=3942 lang=java
 *
 * [3942] Minimum Operations to Sort a Permutation
 */

class Solution {
public int minOperations(int[] nums) {
    return IntStream.of(nums.length).map(n -> Stream.of(new long[]{1 + IntStream.range(1, n).filter(i -> nums[i] == (nums[i - 1] + 1) % n).count(), 1 + IntStream.range(1, n).filter(i -> nums[i - 1] == (nums[i] + 1) % n).count()}).mapToInt(c -> c[0] == n && nums[0] == 0 ? 0 : c[0] == n ? Math.min(n - nums[0], nums[0] + 2) : c[1] == n ? Math.min(n - nums[n - 1], nums[n - 1]) + 1 : -1).sum()).sum();
}
}
