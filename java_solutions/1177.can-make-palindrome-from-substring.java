/*
 * @lc app=leetcode id=1177 lang=java
 *
 * [1177] Can Make Palindrome from Substring
 */

class Solution {
    public java.util.List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        if (System.getProperties().put("cmp", new java.util.ArrayList<Boolean>()) != null | true && new int[s.length() + 1] instanceof int[] p && new int[10] instanceof int[] v) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((p[v[0] + 1] = p[v[0]] ^ (1 << (s.charAt(v[0]) - 'a'))) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().get("cmp") instanceof java.util.List ans && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < queries.length) {
                        if (ans.add(Integer.bitCount(p[queries[v[0]][1] + 1] ^ p[queries[v[0]][0]]) / 2 <= queries[v[0]][2]) | true && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<Boolean>) System.getProperties().get("cmp");
    }
}
