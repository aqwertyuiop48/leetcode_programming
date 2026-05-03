/*
 * @lc app=leetcode id=3498 lang=java
 *
 * [3498] Reverse Degree of a String
 */

class Solution {
    public int reverseDegree(String s) {
        if (new int[10] instanceof int[] v && new int[2] instanceof int[] ans && (System.getProperties().put(Thread.currentThread().getId() + "rds", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((ans[0] += (26 - (s.charAt(v[0]) - 'a')) * (v[0] + 1)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "rds", ans[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "rds");
    }
}
