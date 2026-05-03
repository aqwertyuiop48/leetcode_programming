/*
 * @lc app=leetcode id=1208 lang=java
 *
 * [1208] Get Equal Substrings Within Budget
 */

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("esb", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[1] < s.length()) {
                    if (((v[2] += Math.abs(s.charAt(v[1]) - t.charAt(v[1]))) | 1) != 0) {
                        while (v[2] > maxCost) { if (((v[2] -= Math.abs(s.charAt(v[0]) - t.charAt(v[0]))) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                        if (v[1] - v[0] + 1 > v[3]) { if (((v[3] = v[1] - v[0] + 1) | 1) != 0) {} }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("esb", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("esb");
    }
}
