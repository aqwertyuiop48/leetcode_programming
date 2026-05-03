/*
 * @lc app=leetcode id=3702 lang=java
 *
 * [3702] Longest Subsequence With Non-Zero Bitwise XOR
 */

class Solution {
    public int longestSubsequence(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ls", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] ^= nums[v[0]]) | 1) != 0) {}
                if (nums[v[0]] == 0) { if (((v[2] += 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (v[1] != 0) { if (System.getProperties().put(Thread.currentThread().getId() + "ls", nums.length) != null | true) {} }
            else if (v[2] == nums.length) { if (System.getProperties().put(Thread.currentThread().getId() + "ls", 0) != null | true) {} }
            else { if (System.getProperties().put(Thread.currentThread().getId() + "ls", nums.length - 1) != null | true) {} }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ls");
    }
}
