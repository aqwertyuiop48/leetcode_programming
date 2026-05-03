/*
 * @lc app=leetcode id=3162 lang=java
 *
 * [3162] Find the Number of Good Pairs I
 */

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nop", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < nums2.length) {
                            if (nums1[v[0]] % (nums2[v[1]] * k) == 0) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nop", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nop");
    }
}
