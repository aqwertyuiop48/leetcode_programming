/*
 * @lc app=leetcode id=1345 lang=java
 *
 * [1345] Jump Game IV
 */

class Solution {
    public int minJumps(int[] arr) {
        if (new int[]{0, arr.length, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[arr.length][2], new int[arr.length], new int[arr.length], new boolean[arr.length], new int[50005]} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[2] < v[1]) {
                        if ((((int[][])obj[0])[v[2]][0] = arr[v[2]]) != 0 || true) {
                            if ((((int[][])obj[0])[v[2]][1] = v[2]) != 0 || true) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((obj[0] = Arrays.stream((int[][])obj[0]).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null) || true) {
                            if (((v[2] = 0) | 1) != 0) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[2] < v[1]) {
                        if (v[2] == 0 || ((int[][])obj[0])[v[2]][0] != ((int[][])obj[0])[v[2] - 1][0]) {
                            if (((v[3] = v[2]) | 1) != 0) {}
                        }
                        if ((((int[])obj[1])[((int[][])obj[0])[v[2]][1]] = v[3]) != 0 || true) {
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    } else {
                        if ((((int[])obj[4])[v[5]++] = 0) == 0) {
                            if ((((boolean[])obj[3])[0] = true) || true) {
                                if ((((int[])obj[2])[0] = 0) == 0) {
                                    if (((v[0] = 2) | 1) != 0) {}
                                }
                            }
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[4] < v[5]) {
                        if (((v[6] = ((int[])obj[4])[v[4]++]) | 1) != 0) {
                            if (v[6] == v[1] - 1) {
                                if (((arr[0] = ((int[])obj[2])[v[6]]) | 1) != 0) {
                                    if (((v[0] = 10) | 1) != 0) {}
                                }
                            } else {
                                if (((v[7] = v[6] + 1) | 1) != 0 && v[7] < v[1] && !((boolean[])obj[3])[v[7]]) {
                                    if ((((boolean[])obj[3])[v[7]] = true) || true) {
                                        if ((((int[])obj[2])[v[7]] = ((int[])obj[2])[v[6]] + 1) != 0 || true) {
                                            if ((((int[])obj[4])[v[5]++] = v[7]) != 0 || true) {}
                                        }
                                    }
                                }
                                if (((v[7] = v[6] - 1) | 1) != 0 && v[7] >= 0 && !((boolean[])obj[3])[v[7]]) {
                                    if ((((boolean[])obj[3])[v[7]] = true) || true) {
                                        if ((((int[])obj[2])[v[7]] = ((int[])obj[2])[v[6]] + 1) != 0 || true) {
                                            if ((((int[])obj[4])[v[5]++] = v[7]) != 0 || true) {}
                                        }
                                    }
                                }
                                if (((v[8] = ((int[])obj[1])[v[6]]) | 1) != 0 && v[8] != -1 && ((int[][])obj[0])[v[8]][1] != -1) {
                                    if (((v[10] = v[8]) | 1) != 0) {
                                        if (((v[0] = 3) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    } else {
                        if (((v[0] = 10) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[8] < v[1] && ((int[][])obj[0])[v[8]][0] == arr[v[6]]) {
                        if (((v[9] = ((int[][])obj[0])[v[8]][1]) | 1) != 0 && !((boolean[])obj[3])[v[9]]) {
                            if ((((boolean[])obj[3])[v[9]] = true) || true) {
                                if ((((int[])obj[2])[v[9]] = ((int[])obj[2])[v[6]] + 1) != 0 || true) {
                                    if ((((int[])obj[4])[v[5]++] = v[9]) != 0 || true) {}
                                }
                            }
                        }
                        if (((v[8] += 1) | 1) != 0) {}
                    } else {
                        if ((((int[][])obj[0])[v[10]][1] = -1) != 0 || true) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return arr[0];
    }
}
