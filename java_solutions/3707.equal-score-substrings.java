/*
 * @lc app=leetcode id=3707 lang=java
 *
 * [3707] Equal Score Substrings
 */

class Solution {
    public boolean scoreBalance(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sb", false) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < s.length()) { if (((v[2] += s.charAt(v[0]) - 'a' + 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length() - 1) {
                    if (((v[1] += s.charAt(v[0]) - 'a' + 1) | 1) != 0 && ((v[2] -= s.charAt(v[0]) - 'a' + 1) | 1) != 0) {
                        if (v[1] == v[2]) { if (System.getProperties().put(Thread.currentThread().getId() + "sb", true) != null | true) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "sb");
    }
}
