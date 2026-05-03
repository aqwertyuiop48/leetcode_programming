/*
 * @lc app=leetcode id=2311 lang=java
 *
 * [2311] Longest Binary Subsequence Less Than or Equal to K
 */

class Solution {
    public int longestSubsequence(String s, int k) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("lbs", 0) != null | true)) {
            if (((v[0] = s.length() - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[0] = 0L) | 1) != 0 && ((lv[1] = 1L) | 1) != 0) {
                while (v[0] >= 0) {
                    if (s.charAt(v[0]) == '0') { if (((v[1] += 1) | 1) != 0) {} }
                    else { if (lv[0] + lv[1] <= k) { if (((lv[0] += lv[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (lv[1] <= k) { if (((lv[1] *= 2) | 1) != 0) {} }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put("lbs", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("lbs");
    }
}
