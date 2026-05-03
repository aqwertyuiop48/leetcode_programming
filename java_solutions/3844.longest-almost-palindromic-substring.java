/*
 * @lc app=leetcode id=3844 lang=java
 *
 * [3844] Longest Almost-Palindromic Substring
 */

class Solution {
    public int almostPalindromic(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lap", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] <= 1) {
                        if (((v[2] = v[0]) | 1) != 0 && ((v[3] = v[0] + v[1]) | 1) != 0) {
                            while (v[2] >= 0 && v[3] < s.length() && s.charAt(v[2]) == s.charAt(v[3])) { if (((v[2] -= 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} }
                            if (((v[4] = v[2] - 1) | 1) != 0 && ((v[5] = v[3]) | 1) != 0 && ((v[6] = v[2]) | 1) != 0 && ((v[7] = v[3] + 1) | 1) != 0) {
                                while (v[4] >= 0 && v[5] < s.length() && s.charAt(v[4]) == s.charAt(v[5])) { if (((v[4] -= 1) | 1) != 0 && ((v[5] += 1) | 1) != 0) {} }
                                while (v[6] >= 0 && v[7] < s.length() && s.charAt(v[6]) == s.charAt(v[7])) { if (((v[6] -= 1) | 1) != 0 && ((v[7] += 1) | 1) != 0) {} }
                                if (((v[8] = Math.min(s.length(), Math.max(v[5] - v[4] - 1, v[7] - v[6] - 1))) | 1) != 0 && v[8] > (int)System.getProperties().get(Thread.currentThread().getId() + "lap")) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "lap", v[8]) != null | true) {}
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lap");
    }
}
