/*
 * @lc app=leetcode id=1493 lang=java
 *
 * [1493] Longest Subarray of 1's After Deleting One Element
 */

class Solution {
    public int longestSubarray(int[] nums) {
        return java.util.Optional.of(new int[4]) // left, zeroes, max, right
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(nums.length, 0)).removeIf(dummy -> 
                ((s[1] += nums[s[3]] == 0 ? 1 : 0) >= 0 && (s[1] > 1 ? (s[1] -= nums[s[0]++] == 0 ? 1 : 0) >= 0 : true) && (s[2] = Math.max(s[2], s[3] - s[0])) >= 0 && (s[3]++ >= 0) && false)
            ) || true)
            .map(s -> s[2] == nums.length ? s[2] - 1 : s[2])
            .get();
    }
}
