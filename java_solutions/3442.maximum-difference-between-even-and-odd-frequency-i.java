/*
 * @lc app=leetcode id=3442 lang=java
 *
 * [3442] Maximum Difference Between Even and Odd Frequency I
 */

class Solution {
    public int maxDifference(String s) {
        if (new int[30] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mdf", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((cnt[s.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 999999) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < 26) {
                        if (cnt[v[0]] > 0) {
                            if (cnt[v[0]] % 2 == 1) { if (cnt[v[0]] > v[1]) { if (((v[1] = cnt[v[0]]) | 1) != 0) {} } }
                            else { if (cnt[v[0]] < v[2]) { if (((v[2] = cnt[v[0]]) | 1) != 0) {} } }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mdf", v[1] - v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mdf");
    }
}
