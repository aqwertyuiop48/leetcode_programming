/*
 * @lc app=leetcode id=1453 lang=java
 *
 * [1453] Maximum Number of Darts Inside of a Circular Dartboard
 */

class Solution {
    public int numPoints(int[][] darts, int r) {
        if (new int[]{0, 0, 0, 0, darts.length, 1, 0, 0} instanceof int[] v && new double[]{0, 0, 0, 0, 0, 0, 0} instanceof double[] d) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] < v[4]) {
                        if (((v[2] = v[1] + 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", String.valueOf(v[5])) != null || true) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[2] < v[4]) {
                        if ((d[0] = Math.sqrt(Math.pow(darts[v[1]][0] - darts[v[2]][0], 2) + Math.pow(darts[v[1]][1] - darts[v[2]][1], 2))) != -1.0) {
                            if (d[0] <= 2 * r) {
                                if ((d[1] = (darts[v[1]][0] + darts[v[2]][0]) / 2.0) != -100000.0 && (d[2] = (darts[v[1]][1] + darts[v[2]][1]) / 2.0) != -100000.0) {
                                    if ((d[3] = Math.sqrt(r * r - d[0] * d[0] / 4.0) * (darts[v[2]][1] - darts[v[1]][1]) / d[0]) != -100000.0 && (d[4] = Math.sqrt(r * r - d[0] * d[0] / 4.0) * (darts[v[2]][0] - darts[v[1]][0]) / d[0]) != -100000.0) {
                                        if (((v[6] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                    }
                                }
                            } else {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[6] < 2) {
                        if ((d[5] = d[1] + (v[6] == 0 ? d[3] : -d[3])) != -100000.0 && (d[6] = d[2] - (v[6] == 0 ? d[4] : -d[4])) != -100000.0 && ((v[7] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[3] < v[4]) {
                        if (Math.sqrt(Math.pow(d[5] - darts[v[3]][0], 2) + Math.pow(d[6] - darts[v[3]][1], 2)) <= r + 1e-6) {
                            if (((v[7] += 1) | 1) != 0) {}
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[5] = Math.max(v[5], v[7])) | 1) != 0 && ((v[6] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "1"));
    }
}
