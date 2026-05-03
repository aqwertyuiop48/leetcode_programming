/*
 * @lc app=leetcode id=2541 lang=java
 *
 * [2541] Minimum Operations to Make Array Equal II
 */

class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", -1L) != null | true) && ((v[0] = 0) | 1) != 0) {
            if (k == 0) {
                if (((v[4] = 0) | 1) != 0) {
                    while (v[0] < nums1.length && v[4] == 0) { if (nums1[(int)v[0]] != nums2[(int)v[0]]) { if (((v[4] = 1) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mo", v[4] == 0 ? 0L : -1L) != null | true) {}
                }
            } else {
                if (((v[4] = 0) | 1) != 0) {
                    while (v[0] < nums1.length && v[4] == 0) {
                        if (((v[1] = nums1[(int)v[0]] - nums2[(int)v[0]]) | 1) != 0) {
                            if (v[1] % k != 0) { if (((v[4] = 1) | 1) != 0) {} }
                            else if (v[1] > 0) { if (((v[2] += v[1] / k) | 1) != 0) {} }
                            else { if (((v[3] -= v[1] / k) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (v[4] == 0 && v[2] == v[3]) { if (System.getProperties().put(Thread.currentThread().getId() + "mo", v[2]) != null | true) {} }
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
