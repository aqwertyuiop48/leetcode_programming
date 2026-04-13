/*
 * @lc app=leetcode id=2176 lang=java
 *
 * [2176] Count Equal and Divisible Pairs in an Array
 */

class Solution {
    public int countPairs(int[] nums, int k) {
        return (int) IntStream.range(0, nums.length)
            .flatMap(i -> IntStream.range(i + 1, nums.length)
                .filter(j -> nums[i] == nums[j] && (i * j) % k == 0))
            .count();
    }
}
