/*
 * @lc app=leetcode id=3223 lang=java
 *
 * [3223] Minimum Length of String After Operations
 */

class Solution {
    public int minimumLength(String s) {
        if (new int[26] instanceof int[] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mlos", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((cnt[s.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < 26) {
                        if (cnt[v[0]] > 0) {
                            if (cnt[v[0]] % 2 == 1) { if (((v[1] += 1) | 1) != 0) {} }
                            else { if (((v[1] += 2) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mlos", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mlos");
    }
}
