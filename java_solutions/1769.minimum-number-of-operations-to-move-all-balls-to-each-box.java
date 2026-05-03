/*
 * @lc app=leetcode id=1769 lang=java
 *
 * [1769] Minimum Number of Operations to Move All Balls to Each Box
 */

class Solution {
    public int[] minOperations(String boxes) {
        if (new int[boxes.length()] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("mno", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < boxes.length()) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < boxes.length()) {
                            if (boxes.charAt(v[1]) == '1') { if (((ans[v[0]] += Math.abs(v[1] - v[0])) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("mno");
    }
}
