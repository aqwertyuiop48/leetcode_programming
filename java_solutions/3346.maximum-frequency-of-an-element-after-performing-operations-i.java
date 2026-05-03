/*
 * @lc app=leetcode id=3346 lang=java
 *
 * [3346] Maximum Frequency of an Element After Performing Operations I
 */

class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        if (new int[300005] instanceof int[] diff && new int[300005] instanceof int[] freq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mfa", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((freq[nums[v[0]]] += 1) | 1) != 0 && ((diff[Math.max(0, nums[v[0]] - k)] += 1) | 1) != 0 && ((diff[nums[v[0]] + k + 1] -= 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] <= 300000) {
                    if (((v[1] += diff[v[0]]) | 1) != 0) {
                        if (((v[3] = Math.min(v[1], freq[v[0]] + numOperations)) | 1) != 0) {
                            if (v[3] > v[2]) { if (((v[2] = v[3]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mfa", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mfa");
    }
}
