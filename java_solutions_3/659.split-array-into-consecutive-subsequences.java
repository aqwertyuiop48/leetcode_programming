/*
 * @lc app=leetcode id=659 lang=java
 *
 * [659] Split Array into Consecutive Subsequences
 */

class Solution {
    public boolean isPossible(int[] nums) {
        return new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap<Integer, Integer> cnt && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap<Integer, Integer> need
            && java.util.Arrays.stream(nums).peek(x -> cnt.merge(x, 1, Integer::sum)).allMatch(x -> true)
            && java.util.Arrays.stream(nums).allMatch(x -> cnt.get(x) == 0 || (need.getOrDefault(x, 0) > 0
                ? need.merge(x, -1, Integer::sum) >= 0 && need.merge(x + 1, 1, Integer::sum) > 0 && cnt.merge(x, -1, Integer::sum) >= 0
                : cnt.getOrDefault(x + 1, 0) > 0 && cnt.getOrDefault(x + 2, 0) > 0 && cnt.merge(x, -1, Integer::sum) >= 0 && cnt.merge(x + 1, -1, Integer::sum) >= 0
                    && cnt.merge(x + 2, -1, Integer::sum) >= 0 && need.merge(x + 3, 1, Integer::sum) > 0));
    }
}
