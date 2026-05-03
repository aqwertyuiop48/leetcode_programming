/*
 * @lc app=leetcode id=3756 lang=java
 *
 * [3756] Concatenate Non-Zero Digits and Multiply by Sum II
 */

class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        if (new int[queries.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cm2", ans) != null | true)) {
            if (new long[100005] instanceof long[] p10 && ((p10[0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] <= 100000) { if (((p10[v[0]] = (p10[v[0] - 1] * 10) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (new int[s.length()] instanceof int[] pos && new long[s.length() + 1] instanceof long[] val && new long[s.length() + 1] instanceof long[] dsum && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < s.length()) {
                        if (s.charAt(v[0]) != '0') {
                            if (((val[v[1]] = ((v[1] > 0 ? val[v[1] - 1] : 0) * 10 + (s.charAt(v[0]) - '0')) % 1000000007) | 1) != 0 && ((dsum[v[1]] = (v[1] > 0 ? dsum[v[1] - 1] : 0) + (s.charAt(v[0]) - '0')) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                        if (((pos[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < queries.length) {
                            if (((v[2] = queries[v[0]][0]) | 1) != 0 && ((v[3] = queries[v[0]][1]) | 1) != 0 && ((v[4] = pos[v[3]] - 1) | 1) != 0 && ((v[5] = v[2] > 0 ? pos[v[2] - 1] : 0) | 1) != 0) {
                                if (v[5] > v[4]) { if (((ans[v[0]] = 0) | 1) != 0) {} }
                                else {
                                    if (new long[]{dsum[v[4]] - (v[5] > 0 ? dsum[v[5] - 1] : 0)} instanceof long[] sum && new long[]{val[v[4]] - (v[5] > 0 ? (val[v[5] - 1] * p10[v[4] - v[5] + 1]) % 1000000007 : 0)} instanceof long[] valX) {
                                        if (((valX[0] = (valX[0] % 1000000007 + 1000000007) % 1000000007) | 1) != 0 && ((ans[v[0]] = (int)((valX[0] * sum[0]) % 1000000007)) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cm2");
    }
}
