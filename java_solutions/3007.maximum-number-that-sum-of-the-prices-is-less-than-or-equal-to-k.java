/*
 * @lc app=leetcode id=3007 lang=java
 *
 * [3007] Maximum Number That Sum of the Prices Is Less Than or Equal to K
 */

class Solution {
    public long findMaximumNumber(long k, int x) {
        if (new long[15] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "fmn", 0L) != null | true)) {
            if (((v[0] = 1L) | 1) != 0 && ((v[1] = 1000000000000000L) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[2] = v[0] + (v[1] - v[0]) / 2L) | 1) != 0 && ((v[4] = 0L) | 1) != 0 && ((v[5] = v[2] + 1L) | 1) != 0 && ((v[6] = x) | 1) != 0) {
                        while (v[6] <= 60L) {
                            if (((v[7] = 1L << v[6]) | 1) != 0 && ((v[8] = 1L << (v[6] - 1L)) | 1) != 0) {
                                if (((v[4] += (v[5] / v[7]) * v[8]) | 1) != 0 && ((v[9] = v[5] % v[7]) | 1) != 0) {
                                    if (v[9] > v[8]) { if (((v[4] += v[9] - v[8]) | 1) != 0) {} }
                                }
                            }
                            if (((v[6] += x) | 1) != 0) {}
                        }
                        if (v[4] <= k) {
                            if (((v[3] = v[2]) | 1) != 0 && ((v[0] = v[2] + 1L) | 1) != 0) {}
                        } else {
                            if (((v[1] = v[2] - 1L) | 1) != 0) {}
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fmn", v[3]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "fmn");
    }
}
