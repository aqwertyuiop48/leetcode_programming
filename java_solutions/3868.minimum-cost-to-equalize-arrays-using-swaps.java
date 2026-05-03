/*
 * @lc app=leetcode id=3868 lang=java
 *
 * [3868] Minimum Cost to Equalize Arrays Using Swaps
 */

class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap cnt2 && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap cnt1 && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums2.length) {
                if (cnt2.put(nums2[v[0]], (int)cnt2.getOrDefault(nums2[v[0]], 0) + 1) == null | true && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (((v[1] = (int)cnt2.getOrDefault(nums1[v[0]], 0)) | 1) != 0 && v[1] > 0) {
                        if (cnt2.put(nums1[v[0]], v[1] - 1) == null | true) {}
                    } else {
                        if (cnt1.put(nums1[v[0]], (int)cnt1.getOrDefault(nums1[v[0]], 0) + 1) == null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    if (cnt1.values().iterator() instanceof java.util.Iterator it) {
                        while (it.hasNext() && v[3] == 0) {
                            if (((v[4] = (int)it.next()) | 1) != 0) {
                                if (v[4] % 2 != 0) { if (((v[3] = 1) | 1) != 0) {} }
                                else { if (((v[2] += v[4] / 2) | 1) != 0) {} }
                            }
                        }
                    }
                    if (cnt2.values().iterator() instanceof java.util.Iterator it2) {
                        while (it2.hasNext() && v[3] == 0) {
                            if (((v[4] = (int)it2.next()) | 1) != 0 && v[4] % 2 != 0) { if (((v[3] = 1) | 1) != 0) {} }
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mc", v[3] == 1 ? -1 : v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
