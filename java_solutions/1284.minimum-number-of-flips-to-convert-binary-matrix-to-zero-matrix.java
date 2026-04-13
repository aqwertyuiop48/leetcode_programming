/*
 * @lc app=leetcode id=1284 lang=java
 *
 * [1284] Minimum Number of Flips to Convert Binary Matrix to Zero Matrix
 */

class Solution {
    public int minFlips(int[][] mat) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{mat.length, mat[0].length, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new int[512] instanceof int[] dist && new int[1000] instanceof int[] q) {
                while (v[2] < v[0]) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < v[1]) {
                            if (mat[v[2]][v[3]] == 1) {
                                if (((v[4] |= (1 << (v[2] * v[1] + v[3]))) | 1) != 0) {}
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] < 512) {
                        if (((dist[v[2]] = 9999) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((dist[v[4]] = 0) | 1) != 0 && ((q[0] = v[4]) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0 && ((res[0] = -1) | 1) != 0) {
                    while (v[5] < v[6] && res[0] == -1) {
                        if (((v[7] = q[v[5]]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {
                            if (v[7] == 0) {
                                if (((res[0] = dist[v[7]]) | 1) != 0) {}
                            } else {
                                if (((v[8] = 0) | 1) != 0) {
                                    while (v[8] < v[0] * v[1]) {
                                        if (((v[2] = v[8] / v[1]) | 1) != 0 && ((v[3] = v[8] % v[1]) | 1) != 0 && ((v[4] = v[7] ^ (1 << v[8])) | 1) != 0) {
                                            if (v[2] > 0) { if (((v[4] ^= (1 << ((v[2] - 1) * v[1] + v[3]))) | 1) != 0) {} }
                                            if (v[2] < v[0] - 1) { if (((v[4] ^= (1 << ((v[2] + 1) * v[1] + v[3]))) | 1) != 0) {} }
                                            if (v[3] > 0) { if (((v[4] ^= (1 << (v[2] * v[1] + v[3] - 1))) | 1) != 0) {} }
                                            if (v[3] < v[1] - 1) { if (((v[4] ^= (1 << (v[2] * v[1] + v[3] + 1))) | 1) != 0) {} }
                                            if (dist[v[4]] == 9999) {
                                                if (((dist[v[4]] = dist[v[7]] + 1) | 1) != 0 && ((q[v[6]] = v[4]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[8] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
