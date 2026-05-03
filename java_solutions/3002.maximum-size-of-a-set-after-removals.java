/*
 * @lc app=leetcode id=3002 lang=java
 *
 * [3002] Maximum Size of a Set After Removals
 */

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        if (new java.util.HashSet() instanceof java.util.HashSet s1 && new java.util.HashSet() instanceof java.util.HashSet s2 && new java.util.HashSet() instanceof java.util.HashSet common && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mss", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (s1.add(nums1[v[0]]) | true) {}
                    if (s2.add(nums2[v[0]]) | true) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums1.length) {
                        if (s1.contains(nums1[v[0]]) && s2.contains(nums1[v[0]])) {
                            if (common.add(nums1[v[0]]) | true) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[1] = s1.size() - common.size()) | 1) != 0 && ((v[2] = s2.size() - common.size()) | 1) != 0 && ((v[3] = Math.min(nums1.length / 2, v[1])) | 1) != 0 && ((v[4] = Math.min(nums1.length / 2, v[2])) | 1) != 0) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "mss", Math.min(nums1.length, v[3] + v[4] + common.size())) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mss");
    }
}
