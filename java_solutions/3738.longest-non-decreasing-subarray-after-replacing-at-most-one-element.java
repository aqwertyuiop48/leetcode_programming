/*
 * @lc app=leetcode id=3738 lang=java
 *
 * [3738] Longest Non-Decreasing Subarray After Replacing at Most One Element
 */

class Solution {
    public int longestSubarray(int[] nums) {
        if (new int[10] instanceof int[] v && new int[nums.length] instanceof int[] left && new int[nums.length] instanceof int[] right && (System.getProperties().put(Thread.currentThread().getId() + "lnd", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((left[v[0]] = 1) | 1) != 0 && ((right[v[0]] = 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] >= nums[v[0] - 1]) { if (((left[v[0]] = left[v[0] - 1] + 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = nums.length - 2) | 1) != 0) {
                while (v[0] >= 0) {
                    if (nums[v[0]] <= nums[v[0] + 1]) { if (((right[v[0]] = right[v[0] + 1] + 1) | 1) != 0) {} }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (left[v[0]] > v[1]) { if (((v[1] = left[v[0]]) | 1) != 0) {} }
                    if (((v[2] = v[0] - 1 >= 0 ? left[v[0] - 1] : 0) | 1) != 0 && ((v[3] = v[0] + 1 < nums.length ? right[v[0] + 1] : 0) | 1) != 0) {
                        if (v[0] > 0 && v[0] < nums.length - 1 && nums[v[0] - 1] <= nums[v[0] + 1]) {
                            if (v[2] + v[3] + 1 > v[1]) { if (((v[1] = v[2] + v[3] + 1) | 1) != 0) {} }
                        } else {
                            if (Math.max(v[2] + 1, v[3] + 1) > v[1]) { if (((v[1] = Math.max(v[2] + 1, v[3] + 1)) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lnd", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lnd");
    }
}
