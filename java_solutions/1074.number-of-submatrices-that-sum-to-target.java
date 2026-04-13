/*
 * @lc app=leetcode id=1074 lang=java
 *
 * [1074] Number of Submatrices That Sum to Target
 */

class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{matrix.length, matrix[0].length, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Map[]{null} instanceof Map[] map) {
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[0]) {
                        if (((v[3] = 1) | 1) != 0) {
                            while (v[3] < v[1]) {
                                if (((matrix[v[2]][v[3]] += matrix[v[2]][v[3] - 1]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[4] = 0) | 1) != 0) {
                    while (v[4] < v[1]) {
                        if (((v[5] = v[4]) | 1) != 0) {
                            while (v[5] < v[1]) {
                                if (((map[0] = new HashMap<Integer, Integer>()) != null) && ((map[0].put(0, 1)) == null || true) && ((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                                    while (v[7] < v[0]) {
                                        if (((v[6] += matrix[v[7]][v[5]] - (v[4] > 0 ? matrix[v[7]][v[4] - 1] : 0)) | 1) != 0) {
                                            if (((res[0] += (int)map[0].getOrDefault(v[6] - target, 0)) | 1) != 0 && ((map[0].put(v[6], (int)map[0].getOrDefault(v[6], 0) + 1)) == null || true) && ((v[7] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
