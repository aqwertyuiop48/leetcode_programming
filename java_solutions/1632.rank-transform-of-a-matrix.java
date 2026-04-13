/*
 * @lc app=leetcode id=1632 lang=java
 *
 * [1632] Rank Transform of a Matrix
 */

class Solution {
    public int[][] matrixRankTransform(int[][] matrix) {
        return Arrays.stream(new int[][][]{new int[matrix.length][matrix[0].length]}).peek(res -> {
            if (new Object[]{new int[matrix.length * matrix[0].length][3]} instanceof Object[] st && new int[]{matrix.length, matrix[0].length, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new int[matrix.length + matrix[0].length] instanceof int[] p && new int[matrix.length + matrix[0].length] instanceof int[] maxGroup && new int[matrix.length] instanceof int[] maxRow && new int[matrix[0].length] instanceof int[] maxCol) {
                while (v[2] < 10) {
                    if (v[2] == 0) {
                        if (v[3] < v[0]) {
                            if (((v[4] = 0) | 1) != 0) {
                                while (v[4] < v[1]) {
                                    if (((((int[][])st[0])[v[5]][0] = matrix[v[3]][v[4]]) | 1) != 0 && ((((int[][])st[0])[v[5]][1] = v[3]) | 1) != 0 && ((((int[][])st[0])[v[5]][2] = v[4]) | 1) != 0 && ((v[5] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        } else {
                            if (((st[0] = Arrays.stream((int[][])st[0]).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null) && ((v[2] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {}
                        }
                    } else if (v[2] == 1) {
                        if (v[3] < v[5]) {
                            if (((v[4] = v[3]) | 1) != 0) {
                                while (v[4] < v[5] && ((int[][])st[0])[v[4]][0] == ((int[][])st[0])[v[3]][0]) {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                if (((v[6] = v[3]) | 1) != 0) {
                                    while (v[6] < v[4]) {
                                        if (((p[((int[][])st[0])[v[6]][1]] = ((int[][])st[0])[v[6]][1]) | 1) != 0 && ((p[((int[][])st[0])[v[6]][2] + v[0]] = ((int[][])st[0])[v[6]][2] + v[0]) | 1) != 0 && ((maxGroup[((int[][])st[0])[v[6]][1]] = maxRow[((int[][])st[0])[v[6]][1]]) | 1) != 0 && ((maxGroup[((int[][])st[0])[v[6]][2] + v[0]] = maxCol[((int[][])st[0])[v[6]][2]]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[6] = v[3]) | 1) != 0) {
                                    while (v[6] < v[4]) {
                                        if (((v[7] = ((int[][])st[0])[v[6]][1]) | 1) != 0 && ((v[8] = ((int[][])st[0])[v[6]][2] + v[0]) | 1) != 0) {
                                            while (p[v[7]] != v[7]) { if (((p[v[7]] = p[p[v[7]]]) | 1) != 0 && ((v[7] = p[v[7]]) | 1) != 0) {} }
                                            while (p[v[8]] != v[8]) { if (((p[v[8]] = p[p[v[8]]]) | 1) != 0 && ((v[8] = p[v[8]]) | 1) != 0) {} }
                                            if (v[7] != v[8]) {
                                                if (((p[v[7]] = v[8]) | 1) != 0 && ((maxGroup[v[8]] = Math.max(maxGroup[v[8]], maxGroup[v[7]])) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[6] = v[3]) | 1) != 0) {
                                    while (v[6] < v[4]) {
                                        if (((v[7] = ((int[][])st[0])[v[6]][1]) | 1) != 0) {
                                            while (p[v[7]] != v[7]) { if (((p[v[7]] = p[p[v[7]]]) | 1) != 0 && ((v[7] = p[v[7]]) | 1) != 0) {} }
                                            if (((v[8] = maxGroup[v[7]] + 1) | 1) != 0 && ((res[((int[][])st[0])[v[6]][1]][((int[][])st[0])[v[6]][2]] = v[8]) | 1) != 0 && ((maxRow[((int[][])st[0])[v[6]][1]] = v[8]) | 1) != 0 && ((maxCol[((int[][])st[0])[v[6]][2]] = v[8]) | 1) != 0) {}
                                        }
                                        if (((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[3] = v[4]) | 1) != 0) {}
                            }
                        } else {
                            if (((v[2] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null);
    }
}
