/*
 * @lc app=leetcode id=1923 lang=java
 *
 * [1923] Longest Common Subpath
 */

class Solution {
    public int longestCommonSubpath(int n, int[][] a) {
        if (new long[]{0, a.length, n, n + 1, (long)Math.pow(10, 3 * (int)Math.log10(n + 1) - 3) + 100007, 0, 0, 0, 0, 0, 0, 0} instanceof long[] v && new long[a.length][] instanceof long[][] b && new long[100005] instanceof long[] pow && new Object[]{null, null} instanceof Object[] sets) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[5] < v[1]) {
                        if (((v[2] = Math.max(v[2], a[(int)v[5]].length)) | 1) != 0 && ((b[(int)v[5]] = new long[a[(int)v[5]].length + 1]) != null) && ((v[6] = 0) | 1) != 0) {
                            while (v[6] < a[(int)v[5]].length) {
                                if (((b[(int)v[5]][(int)v[6] + 1] = (b[(int)v[5]][(int)v[6]] * v[3] % v[4] + a[(int)v[5]][(int)v[6]]) % v[4]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((pow[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[6] < v[2]) {
                        if (((pow[(int)v[6] + 1] = pow[(int)v[6]] * v[3] % v[4]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0 && ((v[8] = v[2]) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[7] < v[8]) {
                        if (((v[9] = (v[7] + v[8] + 1) >>> 1) | 1) != 0 && ((sets[0] = new HashSet<Long>()) != null) && ((sets[1] = new HashSet<Long>()) != null) && ((v[6] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((a[0][0] = (int)v[7]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[6] <= b[0].length - 1 - v[9]) {
                        if ((((Set<Long>)sets[0]).add((b[0][(int)(v[6] + v[9])] - b[0][(int)v[6]] * pow[(int)v[9]] % v[4] + v[4]) % v[4]) || true) && ((v[6] += 1) | 1) != 0) {}
                    } else {
                        if (((v[5] = 1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (v[5] < v[1]) {
                        if (((v[10] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    } else {
                        if (((v[7] = v[9]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 5) {
                    if (v[6] <= b[(int)v[5]].length - 1 - v[9]) {
                        if (((v[11] = (b[(int)v[5]][(int)(v[6] + v[9])] - b[(int)v[5]][(int)v[6]] * pow[(int)v[9]] % v[4] + v[4]) % v[4]) | 1) != 0) {
                            if (((Set<Long>)sets[0]).contains(v[11])) {
                                if ((((Set<Long>)sets[1]).add(v[11]) || true) && ((v[10] = 1) | 1) != 0) {}
                            }
                            if (((v[6] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 6) | 1) != 0) {}
                    }
                } else if (v[0] == 6) {
                    if (v[10] == 0) {
                        if (((v[8] = v[9] - 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((sets[0] = new HashSet<Long>((Set<Long>)sets[1])) != null) && ((sets[1] = new HashSet<Long>()) != null) && ((v[5] += 1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                }
            }
        }
        return a.length > 0 ? a[0][0] : 0;
    }
}
