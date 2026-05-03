/*
 * @lc app=leetcode id=2419 lang=java
 *
 * [2419] Longest Subarray With Maximum Bitwise AND
 */

class Solution {
    public int longestSubarray(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lsba", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == v[1]) { if (((v[2] += 1) | 1) != 0) {} }
                    else { if (((v[2] = 0) | 1) != 0) {} }
                    if (v[2] > v[3]) { if (((v[3] = v[2]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lsba", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lsba");
    }
}
