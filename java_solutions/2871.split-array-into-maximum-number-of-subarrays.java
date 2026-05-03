/*
 * @lc app=leetcode id=2871 lang=java
 *
 * [2871] Split Array Into Maximum Number of Subarrays
 */

class Solution {
    public int maxSubarrays(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", 1) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = -1) | 1) != 0) {
            while (v[0] < nums.length) { if (((v[1] &= nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (v[1] == 0) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[3] &= nums[v[0]]) | 1) != 0 && v[3] == 0) { if (((v[2] += 1) | 1) != 0 && ((v[3] = -1) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "ms", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
