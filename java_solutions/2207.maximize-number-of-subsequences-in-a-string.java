/*
 * @lc app=leetcode id=2207 lang=java
 *
 * [2207] Maximize Number of Subsequences in a String
 */

class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("mns", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0 && ((lv[1] = 0) | 1) != 0 && ((lv[2] = 0) | 1) != 0) {
                while (v[0] < text.length()) {
                    if (text.charAt(v[0]) == pattern.charAt(1)) {
                        if (((lv[2] += lv[0]) | 1) != 0 && ((lv[1] += 1) | 1) != 0) {}
                    }
                    if (text.charAt(v[0]) == pattern.charAt(0)) {
                        if (((lv[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mns", lv[2] + Math.max(lv[0], lv[1])) != null | true) {}
            }
        }
        return (long) System.getProperties().get("mns");
    }
}
