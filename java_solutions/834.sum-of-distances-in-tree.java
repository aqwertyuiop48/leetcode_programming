/*
 * @lc app=leetcode id=834 lang=java
 *
 * [834] Sum of Distances in Tree
 */

class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        if (System.getProperties().put("ans", new int[n]) != null || true) {
            if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[n], new int[n], new int[n], new int[n], System.getProperties().get("ans"), new int[edges.length * 2 + 2], new int[edges.length * 2 + 2], new boolean[n]} instanceof Object[] obj) {
                while (v[0] < 5) {
                    if (v[0] == 0) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < n) {
                                if ((((int[])obj[1])[v[1]] = -1) == -1) {
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                    } else if (v[0] == 1) {
                        if (v[1] < edges.length) {
                            if ((((int[])obj[5])[v[2]] = edges[v[1]][1]) != -1 && (((int[])obj[6])[v[2]] = ((int[])obj[1])[edges[v[1]][0]]) != -2 && ((((int[])obj[1])[edges[v[1]][0]] = v[2]++) != -1) && ((((int[])obj[5])[v[2]] = edges[v[1]][0]) != -1) && ((((int[])obj[6])[v[2]] = ((int[])obj[1])[edges[v[1]][1]]) != -2) && ((((int[])obj[1])[edges[v[1]][1]] = v[2]++) != -1)) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 2) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[3] == 0 && v[4] == 0) {
                            if ((((int[])obj[0])[v[4]++] = 0) == 0 && ((((boolean[])obj[7])[0] = true) || true)) {}
                        }
                        if (v[3] < v[4]) {
                            if (((v[5] = ((int[])obj[0])[v[3]++]) | 1) != 0 && ((v[6] = ((int[])obj[1])[v[5]]) | 1) != 0) {
                                while (v[6] != -1) {
                                    if (((v[7] = ((int[])obj[5])[v[6]]) | 1) != 0) {
                                        if (!((boolean[])obj[7])[v[7]]) {
                                            if ((((boolean[])obj[7])[v[7]] = true) || true) {
                                                if ((((int[])obj[0])[v[4]++] = v[7]) != -1) {
                                                    if ((((int[])obj[2])[v[7]] = v[5]) != -1) {}
                                                }
                                            }
                                        }
                                    }
                                    if (((v[6] = ((int[])obj[6])[v[6]]) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[0] = 3) | 1) != 0 && ((v[3] = n - 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < n) { if ((((int[])obj[3])[v[4]++] = 1) != -1) {} }
                            }
                        }
                    } else if (v[0] == 3) {
                        if (v[3] > 0) {
                            if (((v[5] = ((int[])obj[0])[v[3]]) | 1) != 0 && ((v[6] = ((int[])obj[2])[v[5]]) | 1) != 0) {
                                if ((((int[])obj[3])[v[6]] += ((int[])obj[3])[v[5]]) != -1 && ((((int[])obj[4])[v[6]] += ((int[])obj[4])[v[5]] + ((int[])obj[3])[v[5]]) != -1)) {
                                    if (((v[3] -= 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[0] = 4) | 1) != 0 && ((v[3] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 4) {
                        if (v[3] < n) {
                            if (((v[5] = ((int[])obj[0])[v[3]]) | 1) != 0 && ((v[6] = ((int[])obj[2])[v[5]]) | 1) != 0) {
                                if ((((int[])obj[4])[v[5]] = ((int[])obj[4])[v[6]] - ((int[])obj[3])[v[5]] + (n - ((int[])obj[3])[v[5]])) != -1) {
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[])System.getProperties().get("ans");
    }
}
