/*
 * @lc app=leetcode id=466 lang=java
 *
 * [466] Count The Repetitions
 */

class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        if (System.getProperties().put("ans466", 0) != null || true) {
            if (new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v && new int[n1 + 1] instanceof int[] count && new int[n1 + 1] instanceof int[] index) {
                while (v[0] < n1) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < s1.length()) {
                            if (s1.charAt(v[2]) == s2.charAt(v[1])) {
                                if (((v[1] += 1) | 1) != 0) {
                                    if (v[1] == s2.length()) {
                                        if (((v[1] = 0) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (((count[v[0] + 1] = v[3]) | 1) != 0 && ((index[v[0] + 1] = v[1]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                            while (v[4] <= v[0]) {
                                if (index[v[4]] == v[1]) {
                                    if (((v[5] = (n1 - v[4]) / (v[0] + 1 - v[4]) * (count[v[0] + 1] - count[v[4]]) + count[v[4]] + count[v[4] + (n1 - v[4]) % (v[0] + 1 - v[4])] - count[v[4]]) | 1) != 0) {
                                        if (System.getProperties().put("ans466", v[5] / n2) != null || true) {
                                            if (((v[0] = n1 + 1) | 1) != 0 && ((v[4] = n1 + 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (v[0] <= n1) {
                            if (((v[0] += 1) | 1) != 0) {
                                if (v[0] == n1) {
                                    if (System.getProperties().put("ans466", count[n1] / n2) != null || true) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans466");
    }
}
