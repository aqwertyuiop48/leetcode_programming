/*
 * @lc app=leetcode id=2730 lang=java
 *
 * [2730] Find the Longest Semi-Repetitive Substring
 */

class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("lsrs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (v[0] > 0 && s.charAt(v[0]) == s.charAt(v[0] - 1)) { if (((v[2] += 1) | 1) != 0) {} }
                    while (v[2] > 1) {
                        if (v[1] < s.length() - 1 && s.charAt(v[1]) == s.charAt(v[1] + 1)) { if (((v[2] -= 1) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (v[0] - v[1] + 1 > v[3]) { if (((v[3] = v[0] - v[1] + 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("lsrs", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("lsrs");
    }
}
