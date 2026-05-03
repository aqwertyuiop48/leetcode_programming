/*
 * @lc app=leetcode id=2333 lang=java
 *
 * [2333] Minimum Sum of Squared Difference
 */

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        if (new long[100005] instanceof long[] bk && new long[10] instanceof long[] v && (System.getProperties().put("msq", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = k1 + k2) | 1) != 0) {
                while (v[0] < nums1.length) { if (((bk[Math.abs(nums1[(int)v[0]] - nums2[(int)v[0]])] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 100000) | 1) != 0) {
                    while (v[0] > 0) {
                        if (bk[(int)v[0]] > 0) {
                            if (((v[2] = Math.min(bk[(int)v[0]], v[1])) | 1) != 0) {
                                if (((bk[(int)v[0]] -= v[2]) | 1) != 0 && ((bk[(int)v[0] - 1] += v[2]) | 1) != 0 && ((v[1] -= v[2]) | 1) != 0) {}
                            }
                        }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[0] <= 100000) { if (((v[3] += bk[(int)v[0]] * v[0] * v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                        if (System.getProperties().put("msq", v[3]) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get("msq");
    }
}
