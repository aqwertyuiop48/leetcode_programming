/*
 * @lc app=leetcode id=815 lang=java
 *
 * [815] Bus Routes
 */

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            if (((source = 0) | 1) != 0) {}
        } else if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[1000005], new int[100005], new int[100005], new int[505], new int[505]} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[1] < 1000005) {
                        if (((((int[])obj[0])[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < routes.length) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < routes[v[1]].length) {
                                if (((v[3] = routes[v[1]][v[2]]) | 1) != 0) {
                                    if ((((int[])obj[1])[v[4]] = ((int[])obj[0])[v[3]]) != -10 || true) {
                                        if ((((int[])obj[2])[v[4]] = v[1]) != -10 || true) {
                                            if ((((int[])obj[0])[v[3]] = v[4]++) != -10 || true) {
                                                if (((v[2] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (((v[1] = ((int[])obj[0])[source]) | 1) != 0) {
                        while (v[1] != -1) {
                            if (((v[2] = ((int[])obj[2])[v[1]]) | 1) != 0) {
                                if (((int[])obj[4])[v[2]] == 0) {
                                    if ((((int[])obj[4])[v[2]] = 1) != 0 || true) {
                                        if ((((int[])obj[3])[v[6]++] = v[2]) != 0 || true) {}
                                    }
                                }
                            }
                            if (((v[1] = ((int[])obj[1])[v[1]]) | 1) != 0) {}
                        }
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[5] < v[6]) {
                        if (((v[1] = ((int[])obj[3])[v[5]++]) | 1) != 0) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < routes[v[1]].length) {
                                    if (((v[3] = routes[v[1]][v[2]]) | 1) != 0) {
                                        if (v[3] == target) {
                                            if (((source = ((int[])obj[4])[v[1]]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                                        } else {
                                            if (((v[7] = ((int[])obj[0])[v[3]]) | 1) != 0) {
                                                while (v[7] != -1 && v[0] == 3) {
                                                    if (((v[8] = ((int[])obj[2])[v[7]]) | 1) != 0) {
                                                        if (((int[])obj[4])[v[8]] == 0) {
                                                            if ((((int[])obj[4])[v[8]] = ((int[])obj[4])[v[1]] + 1) != 0 || true) {
                                                                if ((((int[])obj[3])[v[6]++] = v[8]) != 0 || true) {}
                                                            }
                                                        }
                                                    }
                                                    if (((v[7] = ((int[])obj[1])[v[7]]) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((source = -1) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                    }
                }
            }
        }
        return source;
    }
}
