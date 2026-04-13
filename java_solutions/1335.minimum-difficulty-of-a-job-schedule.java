/*
 * @lc app=leetcode id=1335 lang=java
 *
 * [1335] Minimum Difficulty of a Job Schedule
 */

class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if (new int[]{0, jobDifficulty.length, d, 1, 1, 1, 0} instanceof int[] v && new int[d + 1][jobDifficulty.length + 1] instanceof int[][] F) {
            if (v[2] > v[1]) {
                if (((jobDifficulty[0] = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
            } else {
                while (v[0] < 99) {
                    if (v[0] == 0) {
                        if (v[3] <= v[1]) {
                            if (((F[1][v[3]] = Math.max(F[1][v[3] - 1], jobDifficulty[v[3] - 1])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        } else {
                            if (((v[3] = 2) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[3] <= v[2]) {
                            if (((v[4] = v[3]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        } else {
                            if (((jobDifficulty[0] = F[v[2]][v[1]]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[4] <= v[1]) {
                            if (((F[v[3]][v[4]] = 1000000) | 1) != 0 && ((v[5] = v[4]) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        } else {
                            if (((v[3] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[5] >= v[3]) {
                            if (((v[6] = Math.max(v[6], jobDifficulty[v[5] - 1])) | 1) != 0 && ((F[v[3]][v[4]] = Math.min(F[v[3]][v[4]], F[v[3] - 1][v[5] - 1] + v[6])) | 1) != 0 && ((v[5] -= 1) | 1) != 0) {}
                        } else {
                            if (((v[4] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return jobDifficulty[0];
    }
}
