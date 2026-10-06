/*
 * @lc app=leetcode id=713 lang=java
 *
 * [713] Subarray Product Less Than K
 */

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return new int[]{0, 1} instanceof int[] s
            ? java.util.stream.IntStream.range(0, nums.length).map(r -> (s[1] *= nums[r]) < 0 ? 0
                : java.util.stream.Stream.of(0).peek(z -> {
                    while (s[1] >= k && s[0] <= r && (s[1] /= nums[s[0]++]) >= 0) {}
                }).anyMatch(z -> true) ? r - s[0] + 1 : 0).sum()
            : 0;
    }
}
