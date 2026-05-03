/*
 * @lc app=leetcode id=1781 lang=java
 *
 * [1781] Sum of Beauty of All Substrings
 */

class Solution {
    public int beautySum(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("sbs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (new int[26] instanceof int[] c && ((v[1] = v[0]) | 1) != 0) {
                        while (v[1] < s.length()) {
                            if (((c[s.charAt(v[1]) - 'a'] += 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1000) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < 26) {
                                    if (c[v[4]] > 0) {
                                        if (c[v[4]] > v[2]) { if (((v[2] = c[v[4]]) | 1) != 0) {} }
                                        if (c[v[4]] < v[3]) { if (((v[3] = c[v[4]]) | 1) != 0) {} }
                                    }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                if (((v[5] += v[2] - v[3]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("sbs", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("sbs");
    }
}
