/*
 * @lc app=leetcode id=2516 lang=java
 *
 * [2516] Take K of Each Character From Left and Right
 */

class Solution {
    public int takeCharacters(String s, int k) {
        if (new int[10] instanceof int[] v && new int[3] instanceof int[] f && (System.getProperties().put("tk", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) { if (((f[s.charAt(v[0]++) - 'a'] += 1) | 1) != 0) {} }
                if (f[0] >= k && f[1] >= k && f[2] >= k) {
                    if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < s.length()) {
                            if (((f[s.charAt(v[1]) - 'a'] -= 1) | 1) != 0) {}
                            while (f[0] < k || f[1] < k || f[2] < k) { if (((f[s.charAt(v[0]++) - 'a'] += 1) | 1) != 0) {} }
                            if (v[1] - v[0] + 1 > v[2]) { if (((v[2] = v[1] - v[0] + 1) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put("tk", s.length() - v[2]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("tk");
    }
}
