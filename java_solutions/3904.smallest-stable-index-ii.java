/*
 * @lc app=leetcode id=3904 lang=java
 *
 * [3904] Smallest Stable Index II
 */

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (new int[10] instanceof int[] v && new int[nums.length] instanceof int[] sufMin && (System.getProperties().put(Thread.currentThread().getId() + "ssi2", -1) != null | true) && ((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0) {
            while (v[0] >= 0) {
                if (nums[v[0]] < v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                if (((sufMin[v[0]] = v[1]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -2000000000) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length && v[2] == 0) {
                    if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                    if (v[1] - sufMin[v[0]] <= k) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "ssi2", v[0]) != null | true && ((v[2] = 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ssi2");
    }
}
