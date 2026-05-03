/*
 * @lc app=leetcode id=3131 lang=java
 *
 * [3131] Find the Integer Added to Array I
 */

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "aia", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = nums1[0]) | 1) != 0 && ((v[2] = nums2[0]) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (nums1[v[0]] < v[1]) { if (((v[1] = nums1[v[0]]) | 1) != 0) {} }
                    if (nums2[v[0]] < v[2]) { if (((v[2] = nums2[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "aia", v[2] - v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "aia");
    }
}
