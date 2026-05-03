/*
 * @lc app=leetcode id=3044 lang=java
 *
 * [3044] Most Frequent Prime
 */

class Solution {
    public int mostFrequentPrime(int[][] mat) {
        if (new int[262144] instanceof int[] keys && new int[262144] instanceof int[] cnt && new int[20] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mfp", -1) != null | true)) {
            if (new Object[]{new int[][]{{0,1},{1,0},{0,-1},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}}} instanceof Object[] o && o[0] instanceof int[][] dirs && ((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = -1) | 1) != 0) {
                while (v[0] < mat.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < mat[0].length) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 8) {
                                    if (((v[6] = v[0] + dirs[v[2]][0]) | 1) != 0 && ((v[7] = v[1] + dirs[v[2]][1]) | 1) != 0 && ((v[3] = mat[v[0]][v[1]]) | 1) != 0) {
                                        while (v[6] >= 0 && v[6] < mat.length && v[7] >= 0 && v[7] < mat[0].length) {
                                            if (((v[3] = v[3] * 10 + mat[v[6]][v[7]]) | 1) != 0) {
                                                if (v[3] > 10 && ((v[8] = 2) | 1) != 0 && ((v[9] = 1) | 1) != 0) {
                                                    while (v[8] * v[8] <= v[3] && v[9] == 1) {
                                                        if (v[3] % v[8] == 0) { if (((v[9] = 0) | 1) != 0) {} }
                                                        if (((v[8] += 1) | 1) != 0) {}
                                                    }
                                                    if (v[9] == 1) {
                                                        if (((v[10] = (int)((v[3] * 2654435761L) & 262143)) | 1) != 0) {
                                                            while (cnt[(int)v[10]] > 0 && keys[(int)v[10]] != v[3]) { if (((v[10] = (v[10] + 1) & 262143) | 1) != 0) {} }
                                                            if (((keys[(int)v[10]] = v[3]) | 1) != 0 && ((cnt[(int)v[10]] += 1) | 1) != 0) {
                                                                if (cnt[(int)v[10]] > v[4] || (cnt[(int)v[10]] == v[4] && v[3] > v[5])) { if (((v[4] = cnt[(int)v[10]]) | 1) != 0 && ((v[5] = v[3]) | 1) != 0) {} }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (((v[6] += dirs[v[2]][0]) | 1) != 0 && ((v[7] += dirs[v[2]][1]) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mfp", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mfp");
    }
}
