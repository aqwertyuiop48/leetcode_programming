/*
 * @lc app=leetcode id=2785 lang=java
 *
 * [2785] Sort Vowels in a String
 */

class Solution {
    public String sortVowels(String s) {
        if (new Object[]{s.toCharArray()} instanceof Object[] o && o[0] instanceof char[] c && new int[128] instanceof int[] count && new int[10] instanceof int[] v && (System.getProperties().put("sv", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < c.length) {
                    if ("AEIOUaeiou".indexOf(c[v[0]]) != -1) { if (((count[c[v[0]]] += 1) | 1) != 0 && ((c[v[0]] = '_') | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < c.length) {
                        if (c[v[0]] == '_') {
                            while (v[1] < 128 && count[v[1]] == 0) { if (((v[1] += 1) | 1) != 0) {} }
                            if (((c[v[0]] = (char)v[1]) | 1) != 0 && ((count[v[1]] -= 1) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("sv", new String(c)) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get("sv");
    }
}
