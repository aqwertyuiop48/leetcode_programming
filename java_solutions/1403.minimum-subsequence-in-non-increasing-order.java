/*
 * @lc app=leetcode id=1403 lang=java
 *
 * [1403] Minimum Subsequence in Non-Increasing Order
 */

class Solution {
    public java.util.List<Integer> minSubsequence(int[] nums) {
        return new Object[]{java.util.Arrays.stream(nums).boxed().sorted(java.util.Collections.reverseOrder()).collect(java.util.stream.Collectors.toList())} instanceof Object[] o && new int[1] instanceof int[] sum ? ((java.util.List<Integer>)o[0]).subList(0, java.util.stream.IntStream.range(0, nums.length).filter(i -> (sum[0] += ((java.util.List<Integer>)o[0]).get(i)) > java.util.Arrays.stream(nums).sum() - sum[0]).findFirst().getAsInt() + 1) : null;
    }
}
