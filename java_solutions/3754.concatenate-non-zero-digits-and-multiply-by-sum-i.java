/*
 * @lc app=leetcode id=3754 lang=java
 *
 * [3754] Concatenate Non-Zero Digits and Multiply by Sum I
 */

class Solution {
    public long sumAndMultiply(long n) {
        // We use a long array to store state: 
        // v[0]=n, v[1]=multiplier, v[2]=digit, v[3]=concatenated result, v[4]=sum of digits
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "cm_long", 0L) != null | true) && ((v[0] = n) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
            while (v[0] > 0) {
                if (((v[2] = v[0] % 10) | 1) != 0 && v[2] > 0) {
                    // Update concatenated digits (v[3]) and sum of digits (v[4])
                    if (((v[3] += v[2] * v[1]) | 1) != 0 && ((v[4] += v[2]) | 1) != 0 && ((v[1] *= 10) | 1) != 0) {}
                }
                if (((v[0] /= 10) | 1) != 0) {}
            }
            // Store the product of (concatenated non-zero digits) * (sum of non-zero digits)
            if (System.getProperties().put(Thread.currentThread().getId() + "cm_long", (long)(v[3] * v[4])) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "cm_long");
    }
}
