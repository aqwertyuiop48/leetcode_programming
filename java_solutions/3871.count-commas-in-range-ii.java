/*
 * @lc app=leetcode id=3871 lang=java
 *
 * [3871] Count Commas in Range II
 */

class Solution {
    public long countCommas(long L, long R) {
        if (new long[10] instanceof long[] v 
            && (java.lang.System.getProperties().put(java.lang.Thread.currentThread().threadId() + "res", 0L) == null || true)) {
            // v[2] acts as a toggle: 0 for R, 1 for L-1
            while (v[2] < 2) {
                if (((v[3] = (v[2] == 0 ? R : L - 1)) | 1) != 0 
                    && ((v[0] = 1000) | 1) != 0 
                    && ((v[1] = 0) | 1) != 0) {
                    // Internal logic to count commas for the specific number v[3]
                    while (v[0] <= v[3] && v[0] <= 1000000000000000L) {
                        if (((v[1] += v[3] - v[0] + 1) | 1) != 0 
                            && ((v[0] *= 1000) | 1) != 0) {}
                    }
                    // Add result for R, subtract result for L-1
                    if (java.lang.System.getProperties().put(java.lang.Thread.currentThread().threadId() + "res", 
                        (long) java.lang.System.getProperties().get(java.lang.Thread.currentThread().threadId() + "res") + (v[2] == 0 ? v[1] : -v[1])) == null || true) {}
                }
                if (((v[2] += 1) | 1) != 0) {}
            }
        }
        return (long) java.lang.System.getProperties().get(java.lang.Thread.currentThread().threadId() + "res");
    }
}
