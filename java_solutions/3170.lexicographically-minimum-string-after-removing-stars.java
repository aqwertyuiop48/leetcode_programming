/*
 * @lc app=leetcode id=3170 lang=java
 *
 * [3170] Lexicographically Minimum String After Removing Stars
 */

class Solution {
    public String clearStars(String s) {
        if (new int[26][100005] instanceof int[][] stacks && new int[26] instanceof int[] tops && new Object[]{s.toCharArray()} instanceof Object[] o && o[0] instanceof char[] c && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cs", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < c.length) {
                    if (c[v[0]] == '*') {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < 26) {
                                if (tops[v[1]] > 0) { if (((c[stacks[v[1]][--tops[v[1]]]] = '*') | 1) != 0 && ((v[1] = 26) | 1) != 0) {} }
                                else { if (((v[1] += 1) | 1) != 0) {} }
                            }
                        }
                    } else {
                        if (((stacks[c[v[0]] - 'a'][tops[c[v[0]] - 'a']++] = v[0]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < c.length) {
                        if (c[v[0]] != '*') { if (((c[v[2]++] = c[v[0]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "cs", new String(c, 0, v[2])) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "cs");
    }
}
