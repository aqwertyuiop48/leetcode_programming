/*
 * @lc app=leetcode id=3164 lang=java
 *
 * [3164] Find the Number of Good Pairs II
 */

class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        if (new int[1000005] instanceof int[] cnt && new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nop2", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums2.length) {
                    if ((long)nums2[v[0]] * k <= 1000000) { if (((cnt[nums2[v[0]] * k] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums1.length) {
                        if (((v[1] = 1) | 1) != 0) {
                            while (v[1] * v[1] <= nums1[v[0]]) {
                                if (nums1[v[0]] % v[1] == 0) {
                                    if (((lv[0] += cnt[v[1]]) | 1) != 0) {}
                                    if (v[1] * v[1] != nums1[v[0]]) { if (((lv[0] += cnt[nums1[v[0]] / v[1]]) | 1) != 0) {} }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "nop2", lv[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "nop2");
    }
}
