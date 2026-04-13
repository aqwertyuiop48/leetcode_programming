/*
 * @lc app=leetcode id=1591 lang=java
 *
 * [1591] Strange Printer II
 */

class Solution {
    public boolean isPrintable(int[][] targetGrid) {
        return java.util.Arrays.stream(new boolean[][]{new boolean[1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new int[61] instanceof int[] top && new int[61] instanceof int[] down && new int[61] instanceof int[] left && new int[61] instanceof int[] right && new int[61] instanceof int[] inDeg && new boolean[61][61] instanceof boolean[][] adj && new int[61] instanceof int[] q && new boolean[61] instanceof boolean[] exist) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < 61) {
                            if (((top[v[1]] = 100) | 1) != 0 && ((left[v[1]] = 100) | 1) != 0 && ((down[v[1]] = -1) | 1) != 0 && ((right[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < targetGrid.length) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < targetGrid[0].length) {
                                    if (((v[3] = targetGrid[v[1]][v[2]]) | 1) != 0 && ((exist[v[3]] = true) | true) && ((top[v[3]] = Math.min(top[v[3]], v[1]))) != -100 && ((down[v[3]] = Math.max(down[v[3]], v[1]))) != -100 && ((left[v[3]] = Math.min(left[v[3]], v[2]))) != -100 && ((right[v[3]] = Math.max(right[v[3]], v[2]))) != -100 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[1] < 61) {
                            if (exist[v[1]]) {
                                if (((v[2] = top[v[1]]) | 1) != 0) {
                                    while (v[2] <= down[v[1]]) {
                                        if (((v[3] = left[v[1]]) | 1) != 0) {
                                            while (v[3] <= right[v[1]]) {
                                                if (targetGrid[v[2]][v[3]] != v[1] && !adj[targetGrid[v[2]][v[3]]][v[1]]) {
                                                    if (((adj[targetGrid[v[2]][v[3]]][v[1]] = true) | true) && ((inDeg[v[1]] += 1) | 1) != 0) {}
                                                }
                                                if (((v[3] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[1] < 61) {
                            if (exist[v[1]] && inDeg[v[1]] == 0) {
                                if (((q[v[6]] = v[1]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                            }
                            if (exist[v[1]]) {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    } else if (v[0] == 4) {
                        if (v[5] < v[6]) {
                            if (((v[1] = q[v[5]]) | 1) != 0 && ((v[5] += 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] < 61) {
                                    if (adj[v[1]][v[2]]) {
                                        if (((inDeg[v[2]] -= 1) == 0) && ((q[v[6]] = v[2]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((res[0] = (v[6] == v[4])) | true) && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
