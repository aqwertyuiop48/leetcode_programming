/*
 * @lc app=leetcode id=1392 lang=java
 *
 * [1392] Longest Happy Prefix
 */

class Solution {
    public String longestPrefix(String s) {
        if (s.length() < 2) {
            if (((s = "") != null) || true) {}
        } else if (new int[]{0, 1, 0, 0} instanceof int[] v && new int[s.length()] instanceof int[] lps) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[1] < s.length()) {
                        if (s.charAt(v[1]) == s.charAt(v[2])) {
                            if (((lps[v[1]] = v[2] + 1) | 1) != 0 && ((v[2] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else if (v[2] > 0) {
                            if (((v[2] = lps[v[2] - 1]) | 1) != 0) {}
                        } else {
                            if (((lps[v[1]] = 0) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((s = s.substring(0, lps[s.length() - 1])) != null) || true) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return s;
    }
}
