/*
 * @lc app=leetcode id=3917 lang=java
 *
 * [3917] Count Indices With Opposite Parity
 */

class Solution {
  public int[] countOppositeParity(int[] nums) {
    return java.util.stream.IntStream.range(0, nums.length)
        .map(i -> (int) java.util.stream.IntStream.range(i + 1, nums.length)
            .filter(j -> (nums[i] & 1) != (nums[j] & 1))
            .count())
        .toArray();
  }
}
