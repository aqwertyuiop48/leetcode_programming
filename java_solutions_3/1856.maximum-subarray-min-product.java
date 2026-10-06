/*
 * @lc app=leetcode id=1856 lang=java
 *
 * [1856] Maximum Subarray Min-Product
 */

class Solution {
    public int maxSumMinProduct(int[] nums) {
        return new long[nums.length + 1] instanceof long[] pre && java.util.stream.IntStream.range(0, nums.length).peek(i -> pre[i + 1] = pre[i] + nums[i]).allMatch(x -> true)
            && new int[nums.length] instanceof int[] L && new int[nums.length] instanceof int[] R
            && new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> s1 && new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> s2
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> {
                while (!s1.isEmpty() && nums[s1.peekFirst()] >= nums[i] && s1.pollFirst() != null) {}
                if ((L[i] = s1.isEmpty() ? -1 : s1.peekFirst()) > -2 && s1.offerFirst(i)) {}
            }).allMatch(x -> true)
            && java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).peek(i -> {
                while (!s2.isEmpty() && nums[s2.peekFirst()] >= nums[i] && s2.pollFirst() != null) {}
                if ((R[i] = s2.isEmpty() ? nums.length : s2.peekFirst()) > -2 && s2.offerFirst(i)) {}
            }).allMatch(x -> true)
            ? (int) (java.util.stream.IntStream.range(0, nums.length).mapToLong(i -> (long) nums[i] * (pre[R[i]] - pre[L[i] + 1])).max().getAsLong() % 1000000007L) : 0;
    }
}
