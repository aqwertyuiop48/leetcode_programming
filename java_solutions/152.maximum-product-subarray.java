/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

class Solution {
    public int maxProduct(int[] nums) {
        return (int) java.util.stream.IntStream.range(0, nums.length) .boxed() .reduce(new double[]{Integer.MIN_VALUE, 1, 1}, (acc, i) -> new double[]{ Math.max(acc[0], Math.max(acc[1] = (acc[1] == 0 ? 1 : acc[1]) * nums[i], acc[2] = (acc[2] == 0 ? 1 : acc[2]) * nums[nums.length - 1 - i])), acc[1], acc[2] }, (a, b) -> a)[0];
    }
}
