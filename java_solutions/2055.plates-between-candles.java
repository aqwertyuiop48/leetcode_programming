/*
 * @lc app=leetcode id=2055 lang=java
 *
 * [2055] Plates Between Candles
 */

class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "pbc", new int[0]) != null | true) && new int[s.length()] instanceof int[] pSum && new int[s.length()] instanceof int[] lC && new int[s.length()] instanceof int[] rC) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == '*') { if (((v[1] += 1) | 1) != 0) {} }
                    else { if (((v[2] = v[0]) | 1) != 0) {} }
                    if (((pSum[v[0]] = v[1]) | 1) != 0 && ((lC[v[0]] = v[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = s.length() - 1) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                    while (v[0] >= 0) {
                        if (s.charAt(v[0]) == '|') { if (((v[2] = v[0]) | 1) != 0) {} }
                        if (((rC[v[0]] = v[2]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                    }
                    if (new int[queries.length] instanceof int[] ans && ((v[0] = 0) | 1) != 0) {
                        while (v[0] < queries.length) {
                            if (((v[3] = rC[queries[v[0]][0]]) | 1) != 0 && ((v[4] = lC[queries[v[0]][1]]) | 1) != 0) {
                                if (v[3] != -1 && v[4] != -1 && v[3] < v[4]) {
                                    if (((ans[v[0]] = pSum[v[4]] - pSum[v[3]]) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "pbc", ans) != null | true) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "pbc");
    }
}
