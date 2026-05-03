/*
 * @lc app=leetcode id=3823 lang=java
 *
 * [3823] Reverse Letters Then Special Characters in a String
 */

class Solution {
    public String reverseByType(String s) {
        if (new Object[]{s.toCharArray(), new char[s.length()], new char[s.length()]} instanceof Object[] o && o[0] instanceof char[] c && o[1] instanceof char[] let && o[2] instanceof char[] spec && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rls2", s) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < c.length) {
                    if ((c[v[0]] >= 'a' && c[v[0]] <= 'z') || (c[v[0]] >= 'A' && c[v[0]] <= 'Z')) { if (((let[v[1]++] = c[v[0]]) | 1) != 0) {} }
                    else { if (((spec[v[2]++] = c[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < c.length) {
                        if ((c[v[0]] >= 'a' && c[v[0]] <= 'z') || (c[v[0]] >= 'A' && c[v[0]] <= 'Z')) { if (((c[v[0]] = let[--v[1]]) | 1) != 0) {} }
                        else { if (((c[v[0]] = spec[--v[2]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "rls2", new String(c)) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "rls2");
    }
}
