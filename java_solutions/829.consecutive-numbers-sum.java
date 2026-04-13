/*
 * @lc app=leetcode id=829 lang=java
 *
 * [829] Consecutive Numbers Sum
 */

class Solution {
    public int consecutiveNumbersSum(int n) {
        if (new int[]{1, 0, n} instanceof int[] v) {
            while (v[2] - v[0] * (v[0] - 1) / 2 > 0) {
                if ((v[2] - v[0] * (v[0] - 1) / 2) % v[0] == 0) {
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((n = v[1]) | 1) != 0) {}
        }
        return n;
    }
}
