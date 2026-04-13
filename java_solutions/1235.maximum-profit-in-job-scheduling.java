/*
 * @lc app=leetcode id=1235 lang=java
 *
 * [1235] Maximum Profit in Job Scheduling
 */

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        if (new int[]{0, startTime.length, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[startTime.length][3], new int[startTime.length + 1]} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[2] < v[1]) {
                        if ((((int[][])obj[0])[v[2]][0] = startTime[v[2]]) != 0 || true) {
                            if ((((int[][])obj[0])[v[2]][1] = endTime[v[2]]) != 0 || true) {
                                if ((((int[][])obj[0])[v[2]][2] = profit[v[2]]) != 0 || true) {
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((obj[0] = java.util.Arrays.stream((int[][])obj[0]).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null) || true) {
                            if (((v[2] = v[1] - 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[2] >= 0) {
                        if (((v[3] = v[2] + 1) | 1) != 0 && ((v[4] = v[1] - 1) | 1) != 0 && ((v[5] = v[1]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((System.setProperty("ans", String.valueOf(((int[])obj[1])[0]))) != null) || true) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[3] <= v[4]) {
                        if (((v[6] = v[3] + (v[4] - v[3]) / 2) | 1) != 0) {
                            if (((int[][])obj[0])[v[6]][0] >= ((int[][])obj[0])[v[2]][1]) {
                                if (((v[5] = v[6]) | 1) != 0 && ((v[4] = v[6] - 1) | 1) != 0) {}
                            } else {
                                if (((v[3] = v[6] + 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if ((((int[])obj[1])[v[2]] = Math.max(((int[])obj[1])[v[2] + 1], ((int[][])obj[0])[v[2]][2] + ((int[])obj[1])[v[5]])) != 0 || true) {
                            if (((v[2] -= 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
