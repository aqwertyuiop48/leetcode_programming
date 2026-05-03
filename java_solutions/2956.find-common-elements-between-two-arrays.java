/*
 * @lc app=leetcode id=2956 lang=java
 *
 * [2956] Find Common Elements Between Two Arrays
 */

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        if (new int[2] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fiv", ans) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums1.length) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] < nums2.length) { if (nums1[v[0]] == nums2[v[1]]) { if (((v[2] = 1) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} }
                    if (v[2] == 1) { if (((ans[0] += 1) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums2.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < nums1.length) { if (nums2[v[0]] == nums1[v[1]]) { if (((v[2] = 1) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} }
                        if (v[2] == 1) { if (((ans[1] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "fiv");
    }
}
