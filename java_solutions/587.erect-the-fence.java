/*
 * @lc app=leetcode id=587 lang=java
 *
 * [587] Erect the Fence
 */

class Solution {
    public int[][] outerTrees(int[][] trees) {
        if (new int[]{0, trees.length, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{Arrays.stream(trees).sorted((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]).toArray(int[][]::new), new int[trees.length * 2][2], new int[trees.length * 2][2]} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] <= 1) {
                        if (((v[0] = 4) | 1) != 0 && ((v[8] = v[1]) | 1) != 0) {
                            while (v[4] < v[1]) {
                                if (((((int[][])obj[2])[v[4]] = ((int[][])obj[0])[v[4]]) != null || true) && ((v[4] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[3] < v[1]) {
                        while (v[2] >= 2 && (((int[][])obj[1])[v[2]-1][0] - ((int[][])obj[1])[v[2]-2][0]) * (((int[][])obj[0])[v[3]][1] - ((int[][])obj[1])[v[2]-1][1]) - (((int[][])obj[1])[v[2]-1][1] - ((int[][])obj[1])[v[2]-2][1]) * (((int[][])obj[0])[v[3]][0] - ((int[][])obj[1])[v[2]-1][0]) < 0) {
                            if (((v[2] -= 1) | 1) != 0) {}
                        }
                        if (((((int[][])obj[1])[v[2]++] = ((int[][])obj[0])[v[3]]) != null || true) && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[4] = v[2] + 1) | 1) != 0 && ((v[3] = v[1] - 2) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] >= 0) {
                        while (v[2] >= v[4] && (((int[][])obj[1])[v[2]-1][0] - ((int[][])obj[1])[v[2]-2][0]) * (((int[][])obj[0])[v[3]][1] - ((int[][])obj[1])[v[2]-1][1]) - (((int[][])obj[1])[v[2]-1][1] - ((int[][])obj[1])[v[2]-2][1]) * (((int[][])obj[0])[v[3]][0] - ((int[][])obj[1])[v[2]-1][0]) < 0) {
                            if (((v[2] -= 1) | 1) != 0) {}
                        }
                        if (((((int[][])obj[1])[v[2]++] = ((int[][])obj[0])[v[3]]) != null || true) && ((v[3] -= 1) | 1) != 0) {}
                    } else {
                        if (((v[2] -= 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[5] < v[2]) {
                        if (((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                            while (v[6] < v[8]) {
                                if (((int[][])obj[1])[v[5]][0] == ((int[][])obj[2])[v[6]][0] && ((int[][])obj[1])[v[5]][1] == ((int[][])obj[2])[v[6]][1]) {
                                    if (((v[7] = 1) | 1) != 0) {}
                                }
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                            if (v[7] == 0) {
                                if (((((int[][])obj[2])[v[8]++] = ((int[][])obj[1])[v[5]]) != null || true) && ((v[5] += 1) | 1) != 0) {}
                            } else {
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 4) | 1) != 0) {}
                    }
                }
            }
            if (((trees = Arrays.copyOfRange((int[][])obj[2], 0, v[8])) != null) || true) {}
        }
        return trees;
    }
}
