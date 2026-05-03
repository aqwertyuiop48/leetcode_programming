/*
 * @lc app=leetcode id=2401 lang=java
 *
 * [2401] Longest Nice Subarray
 */

class Solution {
    public int longestNiceSubarray(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ln", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                while ((v[1] & nums[v[0]]) != 0) { if (((v[1] ^= nums[v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                if (((v[1] |= nums[v[0]]) | 1) != 0 && v[0] - v[2] + 1 > v[3]) { if (((v[3] = v[0] - v[2] + 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ln", v[3]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ln");
    }
}
