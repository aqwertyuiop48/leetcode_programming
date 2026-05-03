/*
 * @lc app=leetcode id=3412 lang=java
 *
 * [3412] Find Mirror Score of a String
 */

class Solution {
    public long calculateScore(String s) {
        if (new int[26][100005] instanceof int[][] st && new int[26] instanceof int[] top && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "fms", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = s.charAt(v[0]) - 'a') | 1) != 0 && ((v[2] = 25 - v[1]) | 1) != 0) {
                        if (top[v[2]] > 0) {
                            if (((top[v[2]] -= 1) | 1) != 0 && ((lv[0] += v[0] - st[v[2]][top[v[2]]]) | 1) != 0) {}
                        } else {
                            if (((st[v[1]][top[v[1]]++] = v[0]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fms", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "fms");
    }
}
