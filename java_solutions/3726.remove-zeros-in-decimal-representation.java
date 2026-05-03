/*
 * @lc app=leetcode id=3726 lang=java
 *
 * [3726] Remove Zeros in Decimal Representation
 */

class Solution {
    public long removeZeros(long n) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "rz", 0L) != null | true)) {
            if (((v[0] = n) | 1) != 0 && ((v[1] = 1L) | 1) != 0) {
                while (v[0] > 0) {
                    if (v[0] % 10 != 0) {
                        if (((v[2] += (v[0] % 10) * v[1]) | 1) != 0 && ((v[1] *= 10L) | 1) != 0) {}
                    }
                    if (((v[0] /= 10L) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "rz", v[2]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "rz");
    }
}
