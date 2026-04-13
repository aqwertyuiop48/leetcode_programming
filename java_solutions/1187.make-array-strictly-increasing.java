/*
 * @lc app=leetcode id=1187 lang=java
 *
 * [1187] Make Array Strictly Increasing
 */

class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        if (new int[]{0, arr1.length, 0, 0, 0, 0} instanceof int[] v && new Object[]{Arrays.stream(arr2).sorted().distinct().toArray(), null} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (((v[2] = Math.min(v[1], ((int[])obj[0]).length)) | 1) != 0) {
                        if (((obj[1] = new int[v[1]][v[2] + 1]) != null) || true) {
                            if (((v[3] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[3] < v[1]) {
                        if (((v[4] = 0) | 1) != 0) {
                            while (v[4] <= v[2]) {
                                if (((((int[][])obj[1])[v[3]][v[4]] = 2000000000) | 1) != 0) {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((((int[][])obj[1])[0][0] = arr1[0]) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] < v[1]) {
                        if (arr1[v[3]] <= arr1[v[3] - 1]) {
                            if (((v[3] = v[1]) | 1) != 0) {}
                        } else {
                            if (((((int[][])obj[1])[v[3]][0] = arr1[v[3]]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[4] = 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[4] <= v[2]) {
                        if (((((int[][])obj[1])[0][v[4]] = Math.min(arr1[0], ((int[])obj[0])[0])) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[3] = 1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (v[3] < v[1]) {
                        if (((v[4] = 1) | 1) != 0) {
                            while (v[4] <= Math.min(v[3] + 1, v[2])) {
                                if (arr1[v[3]] > ((int[][])obj[1])[v[3] - 1][v[4]]) {
                                    if (((((int[][])obj[1])[v[3]][v[4]] = arr1[v[3]]) | 1) != 0) {}
                                }
                                if (((int[][])obj[1])[v[3] - 1][v[4] - 1] != 2000000000) {
                                    if (((v[5] = Arrays.binarySearch((int[])obj[0], ((int[][])obj[1])[v[3] - 1][v[4] - 1] + 1)) | 1) != 0) {
                                        if (v[5] < 0) {
                                            if (((v[5] = ~v[5]) | 1) != 0) {}
                                        }
                                        if (v[5] < ((int[])obj[0]).length) {
                                            if (((((int[][])obj[1])[v[3]][v[4]] = Math.min(((int[][])obj[1])[v[3]][v[4]], ((int[])obj[0])[v[5]])) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((arr1[0] = -1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                            while (v[4] <= v[2]) {
                                if (((int[][])obj[1])[v[1] - 1][v[4]] != 2000000000) {
                                    if (((arr1[0] = v[4]) | 1) != 0 && ((v[4] = v[2] + 1) | 1) != 0) {}
                                }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                            if (((v[0] = 5) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return arr1[0];
    }
}
