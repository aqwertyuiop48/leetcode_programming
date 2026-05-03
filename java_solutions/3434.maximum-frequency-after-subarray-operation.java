/*
 * @lc app=leetcode id=3434 lang=java
 *
 * [3434] Maximum Frequency After Subarray Operation
 */

class Solution {
    public int maxFrequency(int[] nums, int k) {
        if (new int[60] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mfa", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == k) { if (((v[1] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 1) | 1) != 0) {
                    while (v[0] <= 50) {
                        if (v[0] != k) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[2] < nums.length) {
                                    if (nums[v[2]] == v[0]) { if (((v[3] += 1) | 1) != 0) {} }
                                    else if (nums[v[2]] == k) { if (((v[3] -= 1) | 1) != 0) {} }
                                    if (v[3] < 0) { if (((v[3] = 0) | 1) != 0) {} }
                                    if (v[3] > v[4]) { if (((v[4] = v[3]) | 1) != 0) {} }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (v[4] > v[5]) { if (((v[5] = v[4]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mfa", v[1] + v[5]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mfa");
    }
}
