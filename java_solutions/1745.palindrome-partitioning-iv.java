/*
 * @lc app=leetcode id=1745 lang=java
 *
 * [1745] Palindrome Partitioning IV
 */

class Solution {
    public boolean checkPartitioning(String s) {
        if (new int[]{0, s.length() - 1, 0, 1, 1, 0} instanceof int[] v && new boolean[s.length()][s.length()] instanceof boolean[][] isP) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[1] >= 0) {
                        if (((v[2] = v[1]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[2] < s.length()) {
                        if (v[1] == v[2] || (s.charAt(v[1]) == s.charAt(v[2]) && (v[2] - v[1] <= 2 || isP[v[1] + 1][v[2] - 1]))) {
                            if ((isP[v[1]][v[2]] = true) || true) {}
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] < s.length() - 1) {
                        if (((v[4] = v[3]) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[4] < s.length() - 1) {
                        if (isP[0][v[3] - 1] && isP[v[3]][v[4]] && isP[v[4] + 1][s.length() - 1]) {
                            if (((v[5] = 1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                        } else {
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (((s = v[5] == 1 ? "true" : "false") != null) && ((v[0] = 5) | 1) != 0) {}
                }
            }
        }
        return Boolean.parseBoolean(s);
    }
}
