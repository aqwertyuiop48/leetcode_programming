/*
 * @lc app=leetcode id=1388 lang=java
 *
 * [1388] Pizza With 3n Slices
 */

class Solution {
    public int maxSizeSlices(int[] slices) {
        if (new int[]{0, slices.length, slices.length / 3, 1, 1, 0, 0, 0} instanceof int[] v && new Object[]{new int[slices.length + 1][slices.length / 3 + 1], new int[slices.length + 1][slices.length / 3 + 1]} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) { 
                    if (v[3] < v[1]) {
                        if (((v[4] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (((v[3] = 2) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[4] <= v[2]) {
                        if (((((int[][])obj[0])[v[3]][v[4]] = Math.max(((int[][])obj[0])[v[3] - 1][v[4]], (v[3] >= 2 ? ((int[][])obj[0])[v[3] - 2][v[4] - 1] : 0) + slices[v[3] - 1])) | 1) != 0) {
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) { 
                    if (v[3] <= v[1]) {
                        if (((v[4] = 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((slices[0] = Math.max(((int[][])obj[0])[v[1] - 1][v[2]], ((int[][])obj[1])[v[1]][v[2]])) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[4] <= v[2]) {
                        if (((((int[][])obj[1])[v[3]][v[4]] = Math.max(((int[][])obj[1])[v[3] - 1][v[4]], (v[3] >= 3 ? ((int[][])obj[1])[v[3] - 2][v[4] - 1] : 0) + slices[v[3] - 1])) | 1) != 0) {
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return slices[0];
    }
}
