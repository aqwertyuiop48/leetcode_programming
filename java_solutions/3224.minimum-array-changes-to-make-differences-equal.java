/*
 * @lc app=leetcode id=3224 lang=java
 *
 * [3224] Minimum Array Changes to Make Differences Equal
 */

class Solution {
    public int minChanges(int[] nums, int k) {
        if (new int[k + 2] instanceof int[] cntDiff && new int[k + 2] instanceof int[] cntMax && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mac", 999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = nums.length / 2) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((v[2] = Math.abs(nums[v[0]] - nums[nums.length - 1 - v[0]])) | 1) != 0 && ((v[3] = Math.max(Math.max(nums[v[0]], nums[nums.length - 1 - v[0]]), Math.max(k - nums[v[0]], k - nums[nums.length - 1 - v[0]]))) | 1) != 0) {
                        if (((cntDiff[v[2]] += 1) | 1) != 0 && ((cntMax[v[3]] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= k) {
                    if (((cntMax[v[0]] += cntMax[v[0] - 1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[4] = 999999) | 1) != 0) {
                while (v[0] <= k) {
                    if (((v[5] = v[1] - cntDiff[v[0]] + (v[0] > 0 ? cntMax[v[0] - 1] : 0)) | 1) != 0) {
                        if (v[5] < v[4]) { if (((v[4] = v[5]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mac", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mac");
    }
}
