/*
 * @lc app=leetcode id=3345 lang=java
 *
 * [3345] Smallest Divisible Digit Product I
 */

class Solution {
    public int smallestNumber(int n, int t) {
        if (new int[2] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sddp", 0) != null | true)) {
            if (((v[0] = n) | 1) != 0) {
                while (v[0] <= n + 100) {
                    if (((v[1] = 1) | 1) != 0 && new int[]{v[0]} instanceof int[] temp) {
                        while (temp[0] > 0) { if (((v[1] *= temp[0] % 10) | 1) != 0 && ((temp[0] /= 10) | 1) != 0) {} }
                        if (v[1] % t == 0) { if (System.getProperties().put(Thread.currentThread().getId() + "sddp", v[0]) != null | true && ((v[0] = n + 100) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sddp");
    }
}
