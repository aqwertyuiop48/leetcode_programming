/*
 * @lc app=leetcode id=479 lang=java
 *
 * [479] Largest Palindrome Product
 */

class Solution {
    public int largestPalindrome(int n) {
        if (System.getProperties().put("ans479", 0) != null || true) {
            if (new long[]{0, (long)Math.pow(10, n) - 1, (long)Math.pow(10, n - 1), 0, 0, 0} instanceof long[] v && n > 1) {
                if (((v[3] = v[1]) | 1) != 0) {
                    while (v[3] >= v[2]) {
                        if (((v[4] = Long.parseLong(v[3] + new StringBuilder().append(v[3]).reverse().toString())) | 1) != 0 && ((v[5] = v[1]) | 1) != 0) {
                            while (v[5] * v[5] >= v[4]) {
                                if (v[4] % v[5] == 0) {
                                    if (System.getProperties().put("ans479", (int)(v[4] % 1337)) != null || true) {
                                        if (((v[3] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {}
                                    }
                                }
                                if (((v[5] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] -= 1) | 1) != 0) {}
                    }
                }
            }
        }
        return n == 1 ? 9 : (int) System.getProperties().get("ans479");
    }
}
