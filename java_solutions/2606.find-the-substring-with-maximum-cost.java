/*
 * @lc app=leetcode id=2606 lang=java
 *
 * [2606] Find the Substring With Maximum Cost
 */

class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        if (new int[26] instanceof int[] val && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < 26) { if (((val[v[0]] = v[0] + 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < chars.length()) { if (((val[chars.charAt(v[0]) - 'a'] = vals[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < s.length()) {
                        if (((v[1] = Math.max(val[s.charAt(v[0]) - 'a'], v[1] + val[s.charAt(v[0]) - 'a'])) | 1) != 0) {
                            if (v[1] > v[2]) { if (((v[2] = v[1]) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mc", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
