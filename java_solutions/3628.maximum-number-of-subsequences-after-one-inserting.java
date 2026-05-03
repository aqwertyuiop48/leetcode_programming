/*
 * @lc app=leetcode id=3628 lang=java
 *
 * [3628] Maximum Number of Subsequences After One Inserting
 */

class Solution {
    public long numOfSubsequences(String s) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", 0L) != null | true) && ((v[0] = s.length() - 1) | 1) != 0) {
            while (v[0] >= 0) {
                if (s.charAt((int)v[0]) == 'T') { if (((v[1] += 1) | 1) != 0) {} }
                else if (s.charAt((int)v[0]) == 'C') { if (((v[2] += v[1]) | 1) != 0) {} }
                if (((v[0] -= 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0 && ((v[6] = v[1]) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt((int)v[0]) == 'T') { if (((v[6] -= 1) | 1) != 0 && ((v[5] += v[4]) | 1) != 0) {} }
                    else if (s.charAt((int)v[0]) == 'C') { if (((v[4] += v[3]) | 1) != 0) {} }
                    else if (s.charAt((int)v[0]) == 'L') { if (((v[3] += 1) | 1) != 0) {} }
                    if (v[3] * v[6] > v[7]) { if (((v[7] = v[3] * v[6]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ms", v[5] + Math.max(v[2], Math.max(v[4], v[7]))) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
