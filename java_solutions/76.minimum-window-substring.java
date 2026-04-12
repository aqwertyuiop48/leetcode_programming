/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

class Solution {
    public String minWindow(String s, String t) {
        if (System.getProperties().put("ans76", "") != null || true) {
            if (new int[]{0, 0, t.length(), Integer.MAX_VALUE, 0, 0, 0} instanceof int[] v && new int[128] instanceof int[] count) {
                if (((v[6] = 0) | 1) != 0) {
                    while (v[6] < t.length()) {
                        if (((count[t.charAt(v[6])] += 1) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                    }
                }
                while (v[1] < s.length()) {
                    if (count[s.charAt(v[1])] > 0) {
                        if (((v[2] -= 1) | 1) != 0) {}
                    }
                    if (((count[s.charAt(v[1])] -= 1) | 1) != 0) {
                        while (v[2] == 0) {
                            if (v[1] - v[0] + 1 < v[3]) {
                                if (((v[3] = v[1] - v[0] + 1) | 1) != 0 && ((v[4] = v[0]) | 1) != 0) {}
                            }
                            if (((count[s.charAt(v[0])] += 1) | 1) != 0) {
                                if (count[s.charAt(v[0])] > 0) {
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (((v[0] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (v[3] != Integer.MAX_VALUE) {
                    if (System.getProperties().put("ans76", s.substring(v[4], v[4] + v[3])) != null || true) {}
                }
            }
        }
        return (String) System.getProperties().get("ans76");
    }
}
