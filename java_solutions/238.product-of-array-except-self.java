/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        return Optional.of(new int[nums.length]) .map(res -> IntStream.of(1) .peek(p -> Arrays.fill(res, 1)) .peek(p -> IntStream.range(0, nums.length) .reduce(1, (pref, i) -> (res[i] *= pref) * 0 + pref * nums[i])) .peek(s -> IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1) .reduce(1, (suff, i) -> (res[i] *= suff) * 0 + suff * nums[i])) .mapToObj(v -> res) .findFirst() .get()) .get();
    }
}
