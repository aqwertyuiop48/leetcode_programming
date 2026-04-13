/*
 * @lc app=leetcode id=564 lang=java
 *
 * [564] Find the Closest Palindrome
 */

class Solution {
    public String nearestPalindromic(String n) {
        if (new long[]{0, Long.parseLong(n), (long)Math.pow(10, n.length()-1) - 1, (long)Math.pow(10, n.length()) + 1, Long.parseLong(n.substring(0, (n.length()+1)/2)), 0, 0, 0, 0} instanceof long[] v && new long[5] instanceof long[] c) {
            if (((c[0] = v[2]) | 1) != 0 && ((c[1] = v[3]) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                while (v[5] < 3) {
                    if (((v[6] = v[4] + v[5] - 1) | 1) != 0 && ((v[7] = v[6]) | 1) != 0) {
                        if (n.length() % 2 != 0) {
                            if (((v[7] /= 10) | 1) != 0) {}
                        }
                        while (v[7] > 0) {
                            if (((v[6] = v[6] * 10 + v[7] % 10) | 1) != 0 && ((v[7] /= 10) | 1) != 0) {}
                        }
                        if (((c[(int)v[5] + 2] = v[6]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {}
                    }
                }
                if (((v[5] = 0) | 1) != 0 && ((v[6] = -1) | 1) != 0) {
                    while (v[5] < 5) {
                        if (c[(int)v[5]] != v[1]) {
                            if (v[6] == -1 || Math.abs(c[(int)v[5]] - v[1]) < Math.abs(v[6] - v[1]) || (Math.abs(c[(int)v[5]] - v[1]) == Math.abs(v[6] - v[1]) && c[(int)v[5]] < v[6])) {
                                if (((v[6] = c[(int)v[5]]) | 1) != 0) {}
                            }
                        }
                        if (((v[5] += 1) | 1) != 0) {}
                    }
                }
            }
            if (((n = String.valueOf(v[6])) != null) || true) {}
        }
        return n;
    }
}
