/*
 * @lc app=leetcode id=3819 lang=java
 *
 * [3819] Rotate Non Negative Elements
 */

class Solution {
    public int[] rotateElements(int[] nums, int k) {
        if (new int[nums.length] instanceof int[] a && new int[10] instanceof int[] v) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] >= 0) { if (((a[v[1]++] = nums[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] > 0 && ((v[2] = k % v[1]) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (nums[v[0]] >= 0) { if (((nums[v[0]] = a[(v[3]++ + v[2]) % v[1]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return nums;
    }
}
