/*
 * @lc app=leetcode id=2734 lang=java
 *
 * [2734] Lexicographically Smallest String After Substring Operation
 */

class Solution {
    public String smallestString(String s) {
        if (new Object[]{s.toCharArray()} instanceof Object[] o && o[0] instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put("sss", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < c.length && c[v[0]] == 'a') { if (((v[0] += 1) | 1) != 0) {} }
                if (v[0] == c.length) { if (((c[c.length - 1] = 'z') | 1) != 0) {} }
                else {
                    while (v[0] < c.length && c[v[0]] != 'a') { if (((c[v[0]] = (char)(c[v[0]] - 1)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
                if (System.getProperties().put("sss", new String(c)) != null | true) {}
            }
        }
        return (String) System.getProperties().get("sss");
    }
}
