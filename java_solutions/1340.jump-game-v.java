/*
 * @lc app=leetcode id=1340 lang=java
 *
 * [1340] Jump Game V
 */

class Solution {
    public int maxJumps(int[] arr, int d) {
        if (new int[]{0, arr.length, d, 0, 0, 0, 0, 0, 0, 1} instanceof int[] v && new Object[]{new int[arr.length][2], new int[arr.length]} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[3] < v[1]) {
                        if ((((int[][])obj[0])[v[3]][0] = v[3]) != 0 || true) {
                            if ((((int[][])obj[0])[v[3]][1] = arr[v[3]]) != 0 || true) {
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((obj[0] = Arrays.stream((int[][])obj[0]).sorted((a, b) -> Integer.compare(a[1], b[1])).toArray(int[][]::new)) != null) || true) {
                            if (((v[3] = 0) | 1) != 0) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[3] < v[1]) {
                        if (((v[4] = ((int[][])obj[0])[v[3]][0]) | 1) != 0) {
                            if (((v[5] = ((int[][])obj[0])[v[3]][1]) | 1) != 0) {
                                if ((((int[])obj[1])[v[4]] = 1) != 0 || true) {
                                    if (((v[6] = v[4] - 1) | 1) != 0) {
                                        if (((v[0] = 2) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    } else {
                        if (((arr[0] = v[9]) | 1) != 0) {
                            if (((v[0] = 5) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[6] >= Math.max(0, v[4] - v[2])) {
                        if (v[5] <= arr[v[6]]) {
                            if (((v[6] = -1) | 1) != 0) {} 
                        } else {
                            if ((((int[])obj[1])[v[4]] = Math.max(((int[])obj[1])[v[4]], ((int[])obj[1])[v[6]] + 1)) != 0 || true) {
                                if (((v[6] -= 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[6] = v[4] + 1) | 1) != 0) {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 3) {
                    if (v[6] <= Math.min(v[1] - 1, v[4] + v[2])) {
                        if (v[5] <= arr[v[6]]) {
                            if (((v[6] = v[1] + 1) | 1) != 0) {} 
                        } else {
                            if ((((int[])obj[1])[v[4]] = Math.max(((int[])obj[1])[v[4]], ((int[])obj[1])[v[6]] + 1)) != 0 || true) {
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[9] = Math.max(v[9], ((int[])obj[1])[v[4]])) | 1) != 0) {
                            if (((v[3] += 1) | 1) != 0) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return arr[0];
    }
}
