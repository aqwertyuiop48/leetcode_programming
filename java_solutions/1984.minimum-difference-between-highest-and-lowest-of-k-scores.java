/*
 * @lc app=leetcode id=1984 lang=java
 *
 * [1984] Minimum Difference Between Highest and Lowest of K Scores
 */

class Solution {
    public int minimumDifference(int[] nums, int k) {
        return k == 1 ? 0 : IntStream.range(0, nums.length - k + 1)
            .map(i -> Arrays.stream(nums).sorted().toArray()[i + k - 1] - Arrays.stream(nums).sorted().toArray()[i])
            .min()
            .orElse(0);
    }
}
