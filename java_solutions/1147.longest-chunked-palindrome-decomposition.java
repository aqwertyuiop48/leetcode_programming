/*
 * @lc app=leetcode id=1147 lang=java
 *
 * [1147] Longest Chunked Palindrome Decomposition
 */

class Solution {
    public int longestDecomposition(String text) {
        if (new int[]{0, text.length() - 1, 1, 0, 0, 0} instanceof int[] v) {
            while (v[5] == 0) {
                if (v[0] > v[1]) {
                    if (System.setProperty("ans", String.valueOf(v[3])) != null || true) {
                        if (((v[5] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == v[1]) {
                    if (((v[3] += 1) | 1) != 0 && (System.setProperty("ans", String.valueOf(v[3])) != null || true)) {
                        if (((v[5] = 1) | 1) != 0) {}
                    }
                } else {
                    if (v[0] + v[2] - 1 < v[1] - v[2] + 1) {
                        if (text.substring(v[0], v[0] + v[2]).equals(text.substring(v[1] - v[2] + 1, v[1] + 1))) {
                            if (((v[3] += 2) | 1) != 0 && ((v[0] += v[2]) | 1) != 0 && ((v[1] -= v[2]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                        } else {
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] += 1) | 1) != 0 && (System.setProperty("ans", String.valueOf(v[3])) != null || true)) {
                            if (((v[5] = 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
