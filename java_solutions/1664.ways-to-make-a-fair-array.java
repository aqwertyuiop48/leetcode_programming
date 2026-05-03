/*
 * @lc app=leetcode id=1664 lang=java
 *
 * [1664] Ways to Make a Fair Array
 */

class Solution {
    public int waysToMakeFair(int[] nums) {
        return new int[nums.length + 1] instanceof int[] odd && new int[nums.length + 1] instanceof int[] even && java.util.stream.IntStream.range(0, nums.length).map(i -> (odd[i + 1] = odd[i] + (i % 2 != 0 ? nums[i] : 0)) * 0 + (even[i + 1] = even[i] + (i % 2 == 0 ? nums[i] : 0))).sum() * 0 == 0 ? (int)java.util.stream.IntStream.range(0, nums.length).filter(i -> even[i] + odd[nums.length] - odd[i + 1] == odd[i] + even[nums.length] - even[i + 1]).count() : 0;
    }
}
