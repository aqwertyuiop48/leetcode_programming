/*
 * @lc app=leetcode id=2390 lang=java
 *
 * [2390] Removing Stars From a String
 */

class Solution {
    public String removeStars(String s) {
        if (new char[s.length()] instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rs", "") != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (s.charAt(v[0]) == '*') { if (((v[1] -= 1) | 1) != 0) {} }
                else { if (((c[v[1]++] = s.charAt(v[0])) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "rs", new String(c, 0, v[1])) != null | true) {}
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "rs");
    }
}
