/*
 * @lc app=leetcode id=1776 lang=java
 *
 * [1776] Car Fleet II
 */

class Solution {
    public double[] getCollisionTimes(int[][] cars) {
        while (true) {
            if (new double[cars.length] instanceof double[] res && new int[cars.length] instanceof int[] stack && new int[]{cars.length - 1, -1, 0, 0} instanceof int[] v) {
                while (v[2] < 4) {
                    if (v[2] == 0) {
                        if (v[0] >= 0) {
                            if ((res[v[0]] = -1.0) == -1.0 && ((v[0] -= 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = cars.length - 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                        }
                    } else if (v[2] == 1) {
                        if (v[0] >= 0) {
                            if (((v[2] = 2) | 1) != 0) {}
                        } else {
                            if (((v[2] = 4) | 1) != 0) {}
                        }
                    } else if (v[2] == 2) {
                        if (v[1] >= 0) {
                            if (((v[3] = stack[v[1]]) | 1) != 0) {
                                if (cars[v[0]][1] > cars[v[3]][1] && (res[v[3]] == -1.0 || (double)(cars[v[3]][0] - cars[v[0]][0]) / (cars[v[0]][1] - cars[v[3]][1]) <= res[v[3]])) {
                                    if ((res[v[0]] = (double)(cars[v[3]][0] - cars[v[0]][0]) / (cars[v[0]][1] - cars[v[3]][1])) != 0 || true) {
                                        if (((v[2] = 3) | 1) != 0) {}
                                    }
                                } else {
                                    if (((v[1] -= 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[2] = 3) | 1) != 0) {}
                        }
                    } else if (v[2] == 3) {
                        if (((v[1] += 1) | 1) != 0 && ((stack[v[1]] = v[0]) | 1) != 0 && ((v[0] -= 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                    }
                }
                return res;
            }
        }
    }
}
