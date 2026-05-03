/*
 * @lc app=leetcode id=3095 lang=java
 *
 * [3095] Shortest Subarray With OR at Least K I
 */

class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msl", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 999999) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                        while (v[3] < nums.length) {
                            if (((v[2] |= nums[v[3]]) | 1) != 0) {
                                if (v[2] >= k) {
                                    if (v[3] - v[0] + 1 < v[1]) { if (((v[1] = v[3] - v[0] + 1) | 1) != 0) {} }
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "msl", v[1] == 999999 ? -1 : v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msl");
    }
}
