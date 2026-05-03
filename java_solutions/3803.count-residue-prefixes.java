/*
 * @lc app=leetcode id=3803 lang=java
 *
 * [3803] Count Residue Prefixes
 */

class Solution {
    public int residuePrefixes(String s) {
        if (new int[10] instanceof int[] v && new boolean[26] instanceof boolean[] seen && (System.getProperties().put(Thread.currentThread().getId() + "crp", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (!seen[s.charAt(v[0]) - 'a']) {
                    if (((seen[s.charAt(v[0]) - 'a'] = true) | true) && ((v[1] += 1) | 1) != 0) {}
                }
                if (v[1] == (v[0] + 1) % 3) {
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "crp", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "crp");
    }
}
