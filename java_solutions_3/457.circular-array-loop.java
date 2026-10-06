/*
 * @lc app=leetcode id=457 lang=java
 *
 * [457] Circular Array Loop
 */

class Solution {
    public boolean circularArrayLoop(int[] nums) {
        return ((java.util.function.IntUnaryOperator) j -> ((j + nums[j]) % nums.length + nums.length) % nums.length) instanceof java.util.function.IntUnaryOperator nx
            && java.util.stream.IntStream.range(0, nums.length).anyMatch(i -> nx.applyAsInt(i) != i
                && java.util.stream.IntStream.iterate(i, nx).skip(1).limit(nums.length).takeWhile(j -> nums[j] * nums[i] > 0).anyMatch(j -> j == i));
    }
}
