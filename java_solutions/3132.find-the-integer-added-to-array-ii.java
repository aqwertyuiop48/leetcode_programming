/*
 * @lc app=leetcode id=3132 lang=java
 *
 * [3132] Find the Integer Added to Array II
 */

class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mia", 999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < nums1.length) {
                            if (nums1[v[0]] > nums1[v[1]]) { if (((v[2] = nums1[v[0]]) | 1) != 0 && ((nums1[v[0]] = nums1[v[1]]) | 1) != 0 && ((nums1[v[1]] = v[2]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums2.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < nums2.length) {
                            if (nums2[v[0]] > nums2[v[1]]) { if (((v[2] = nums2[v[0]]) | 1) != 0 && ((nums2[v[0]] = nums2[v[1]]) | 1) != 0 && ((nums2[v[1]] = v[2]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < nums1.length) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0 && ((v[5] = -999999) | 1) != 0) {
                                while (v[2] < nums1.length && v[4] == 1) {
                                    if (v[2] != v[0] && v[2] != v[1]) {
                                        if (v[5] == -999999) { if (((v[5] = nums2[v[3]] - nums1[v[2]]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} }
                                        else if (nums2[v[3]] - nums1[v[2]] != v[5]) { if (((v[4] = 0) | 1) != 0) {} }
                                        else { if (((v[3] += 1) | 1) != 0) {} }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (v[4] == 1 && v[5] < (int)System.getProperties().get(Thread.currentThread().getId() + "mia")) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "mia", v[5]) != null | true) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mia");
    }
}
