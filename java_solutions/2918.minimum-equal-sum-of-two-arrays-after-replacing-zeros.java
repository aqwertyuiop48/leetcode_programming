/*
 * @lc app=leetcode id=2918 lang=java
 *
 * [2918] Minimum Equal Sum of Two Arrays After Replacing Zeros
 */

class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", -1L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums1.length) {
                if (((v[1] += nums1[(int)v[0]]) | 1) != 0 && nums1[(int)v[0]] == 0) { if (((v[2] += 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums2.length) {
                    if (((v[3] += nums2[(int)v[0]]) | 1) != 0 && nums2[(int)v[0]] == 0) { if (((v[4] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[2] == 0 && v[1] < v[3] + v[4]) { if (System.getProperties().put(Thread.currentThread().getId() + "ms", -1L) != null | true) {} }
                else if (v[4] == 0 && v[3] < v[1] + v[2]) { if (System.getProperties().put(Thread.currentThread().getId() + "ms", -1L) != null | true) {} }
                else { if (System.getProperties().put(Thread.currentThread().getId() + "ms", Math.max(v[1] + v[2], v[3] + v[4])) != null | true) {} }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
