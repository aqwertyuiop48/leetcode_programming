/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

class Solution {
    public int lengthOfLIS(int[] nums) { return java.util.Arrays.stream(nums).boxed().reduce(new java.util.ArrayList<Integer>(), (l, x) -> java.util.Optional.of(java.util.Collections.binarySearch(l, x)).map(i -> i < 0 ? ~i : i).map(i -> (i == l.size() ? l.add(x) : l.set(i, x) != null) ? l : l).get(), (a, b) -> a).size(); }
}
