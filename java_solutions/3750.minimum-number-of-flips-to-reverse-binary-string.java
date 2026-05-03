/*
 * @lc app=leetcode id=3750 lang=java
 *
 * [3750] Minimum Number of Flips to Reverse Binary String
 */

class Solution {
    public int minimumFlips(int n) {
        if (new Object[]{Integer.toBinaryString(n)} instanceof Object[] o && o[0] instanceof String s && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnf2", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length() / 2) {
                    if (s.charAt(v[0]) != s.charAt(s.length() - 1 - v[0])) { if (((v[1] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mnf2", v[1] * 2) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mnf2");
    }
}
