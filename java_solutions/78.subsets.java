/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

class Solution {
    public java.util.List<java.util.List<Integer>> subsets(int[] nums) {
        return java.util.stream.IntStream.range(0, 1 << nums.length).mapToObj(i -> java.util.stream.IntStream.range(0, nums.length).filter(j -> (i & (1 << j)) != 0).mapToObj(j -> nums[j]).collect(java.util.stream.Collectors.toList())).collect(java.util.stream.Collectors.toList());
    }
}
