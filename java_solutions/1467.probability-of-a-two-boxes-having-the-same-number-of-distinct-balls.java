/*
 * @lc app=leetcode id=1467 lang=java
 *
 * [1467] Probability of a Two Boxes Having The Same Number of Distinct Balls
 */

class Solution {
    public double getProbability(int[] balls) {
        if (new int[]{0, balls.length, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new double[50][50], new double[balls.length + 1][25][17], new double[balls.length + 1][25]} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[3] < v[1]) {
                        if (((v[2] += balls[v[3]]) | 1) != 0 && ((v[4] = Math.max(v[4], balls[v[3]])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[5] = v[2] / 2) | 1) != 0 && ((v[6] = Math.max(v[4], v[2])) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[3] <= v[6]) {
                        if ((((double[][])obj[0])[v[3]][0] = 1) != 0 || true) {
                            if (((v[7] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else {
                        if (((((double[][][])obj[1])[v[1]][0][v[1]] = 1) != 0 || true) && ((((double[][])obj[2])[v[1]][0] = 1) != 0 || true) && ((v[3] = v[1] - 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[7] <= v[3]) {
                        if ((((double[][])obj[0])[v[3]][v[7]] = ((double[][])obj[0])[v[3] - 1][v[7] - 1] + ((double[][])obj[0])[v[3] - 1][v[7]]) != 0 || true) {
                            if (((v[7] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[3] >= 0) {
                        if (((v[7] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", String.valueOf(((double[][][])obj[1])[0][v[5]][v[1]] / ((double[][])obj[2])[0][v[5]])) != null || true) {
                            if (((v[0] = 10) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 4) {
                    if (v[7] <= v[5]) {
                        if (((v[8] = 0) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    } else {
                        if (((v[3] -= 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 5) {
                    if (v[8] <= Math.min(balls[v[3]], v[7])) {
                        if ((((double[][])obj[2])[v[3]][v[7]] += ((double[][])obj[0])[balls[v[3]]][v[8]] * ((double[][])obj[2])[v[3] + 1][v[7] - v[8]]) != 0 || true) {
                            if (((v[9] = 0) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                        }
                    } else {
                        if (((v[7] += 1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 6) {
                    if (v[9] <= 2 * v[1]) {
                        if (((v[10] = v[9] + (v[8] == balls[v[3]] ? 1 : (v[8] == 0 ? -1 : 0))) | 1) != 0) {
                            if (v[10] >= 0 && v[10] <= 2 * v[1]) {
                                if ((((double[][][])obj[1])[v[3]][v[7]][v[10]] += ((double[][])obj[0])[balls[v[3]]][v[8]] * ((double[][][])obj[1])[v[3] + 1][v[7] - v[8]][v[9]]) != 0 || true) {}
                            }
                        }
                        if (((v[9] += 1) | 1) != 0) {}
                    } else {
                        if (((v[8] += 1) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    }
                }
            }
        }
        return Double.parseDouble(System.getProperty("ans", "0.0"));
    }
}
