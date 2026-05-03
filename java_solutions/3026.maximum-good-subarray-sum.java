/*
 * @lc app=leetcode id=3026 lang=java
 *
 * [3026] Maximum Good Subarray Sum
 */

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (new int[262144] instanceof int[] keys && new long[262144] instanceof long[] minP && new int[262144] instanceof int[] occ && new int[10] instanceof int[] v && new long[10] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mgs", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0L) | 1) != 0 && ((lv[1] = -999999999999999L) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((lv[2] = lv[0]) | 1) != 0 && ((lv[0] += v[1]) | 1) != 0) {
                        if (((v[2] = (int)((v[1] * 2654435761L) & 262143)) | 1) != 0) {
                            while (occ[v[2]] == 1 && keys[v[2]] != v[1]) { if (((v[2] = (v[2] + 1) & 262143) | 1) != 0) {} }
                            if (occ[v[2]] == 0 || minP[v[2]] > lv[2]) {
                                if (((keys[v[2]] = v[1]) | 1) != 0 && ((minP[v[2]] = lv[2]) | 1) != 0 && ((occ[v[2]] = 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] = v[1] - k) | 1) != 0 && ((v[4] = (int)((v[3] * 2654435761L) & 262143)) | 1) != 0) {
                            while (occ[v[4]] == 1 && keys[v[4]] != v[3]) { if (((v[4] = (v[4] + 1) & 262143) | 1) != 0) {} }
                            if (occ[v[4]] == 1) {
                                if (lv[0] - minP[v[4]] > lv[1]) { if (((lv[1] = lv[0] - minP[v[4]]) | 1) != 0 && ((v[7] = 1) | 1) != 0) {} }
                            }
                        }
                        if (((v[3] = v[1] + k) | 1) != 0 && ((v[4] = (int)((v[3] * 2654435761L) & 262143)) | 1) != 0) {
                            while (occ[v[4]] == 1 && keys[v[4]] != v[3]) { if (((v[4] = (v[4] + 1) & 262143) | 1) != 0) {} }
                            if (occ[v[4]] == 1) {
                                if (lv[0] - minP[v[4]] > lv[1]) { if (((lv[1] = lv[0] - minP[v[4]]) | 1) != 0 && ((v[7] = 1) | 1) != 0) {} }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mgs", v[7] == 1 ? lv[1] : 0L) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mgs");
    }
}
