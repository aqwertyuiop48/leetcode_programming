/*
 * @lc app=leetcode id=1643 lang=java
 *
 * [1643] Kth Smallest Instructions
 */

class Solution {
    public String kthSmallestPath(int[] destination, int k) {
        if (new int[]{0, destination[0], destination[1], k, destination[0] + destination[1], 0, 0, 0} instanceof int[] v && new long[35][35] instanceof long[][] nCr) {
            if (((destination = new int[v[4]]) != null)) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[5] <= 30) {
                            if (((nCr[v[5]][0] = 1) | 1) != 0 && ((v[6] = 1) | 1) != 0) {
                                while (v[6] <= v[5]) {
                                    if (((nCr[v[5]][v[6]] = nCr[v[5]-1][v[6]-1] + nCr[v[5]-1][v[6]]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 1) | 1) != 0 && ((v[5] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[5] < v[4]) {
                            if (v[2] > 0) {
                                if (((v[7] = (int)nCr[v[1] + v[2] - 1][v[1]]) | 1) != 0) {
                                    if (v[3] <= v[7]) {
                                        if (((destination[v[5]] = 72) | 1) != 0 && ((v[2] -= 1) | 1) != 0) {}
                                    } else {
                                        if (((destination[v[5]] = 86) | 1) != 0 && ((v[1] -= 1) | 1) != 0 && ((v[3] -= v[7]) | 1) != 0) {}
                                    }
                                }
                            } else {
                                if (((destination[v[5]] = 86) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return new String(destination, 0, destination.length);
    }
}
