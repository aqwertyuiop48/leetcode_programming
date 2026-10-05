/*
 * @lc app=leetcode id=4067 lang=java
 *
 * [4067] Longest Subarray With Restricted Pair Sums
 */

class Solution {
    public int maxSubarray(int[] nums) {
        return java.util.stream.IntStream.range(0, nums.length).collect(() -> new int[504], (st, i) -> java.util.Optional.of(nums[i]).filter(x -> (st[501] = java.util.stream.IntStream.range(st[501], i + 1).filter(l -> l == i || !java.util.stream.IntStream.rangeClosed(1, 500).anyMatch(d -> st[d] > 0 && ((x - d >= 0 && x - d <= 500 && (x - d == d ? st[d] >= 2 : st[x - d] > 0)) || (x + d <= 500 && st[x + d] > 0))) || (st[nums[l]]--) * 0 != 0).findFirst().orElse(st[501])) >= 0).ifPresent(v -> st[502] = Math.max(st[502], i - (st[nums[i]]++ * 0 + st[501]) + 1)), (a, b) -> {})[502];
    }
}
