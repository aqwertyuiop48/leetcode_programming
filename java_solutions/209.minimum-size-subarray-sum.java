/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        return java.util.concurrent.CompletableFuture.runAsync(() -> java.util.Arrays.parallelPrefix(nums, Integer::sum)).join() == null ? java.util.stream.IntStream.range(0, nums.length).mapToObj(i -> new int[]{i, java.util.Arrays.binarySearch(nums, (i == 0 ? 0 : nums[i - 1]) + target)}).map(arr -> new int[]{arr[0], arr[1] < 0 ? ~arr[1] : arr[1]}).filter(arr -> arr[1] < nums.length).mapToInt(arr -> arr[1] - arr[0] + 1).min().orElse(0) : 0;
    }
}
