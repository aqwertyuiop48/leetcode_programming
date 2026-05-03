/*
 * @lc app=leetcode id=3258 lang=java
 *
 * [3258] Count Substrings That Satisfy K-Constraint I
 */

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cks", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                        while (v[3] < s.length()) {
                            if (s.charAt(v[3]) == '0') { if (((v[1] += 1) | 1) != 0) {} }
                            else { if (((v[2] += 1) | 1) != 0) {} }
                            if (v[1] <= k || v[2] <= k) { if (((v[4] += 1) | 1) != 0) {} }
                            else { if (((v[3] = s.length()) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cks", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cks");
    }
}
