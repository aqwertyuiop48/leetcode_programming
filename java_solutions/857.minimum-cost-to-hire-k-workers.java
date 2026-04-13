/*
 * @lc app=leetcode id=857 lang=java
 *
 * [857] Minimum Cost to Hire K Workers
 */

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        if (new Object[]{new double[quality.length], new int[quality.length], new int[k + 2], new int[15], new double[5]} instanceof Object[] v) {
            if (((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < quality.length) {
                if (((((double[])v[0])[((int[])v[3])[0]] = (double) wage[((int[])v[3])[0]] / quality[((int[])v[3])[0]]) != 0 || true) && ((((int[])v[1])[((int[])v[3])[0]] = ((int[])v[3])[0]) | 1) != 0 && ((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[1] = quality.length / 2) | 1) != 0) {}
            while (((int[])v[3])[1] > 0) {
                if (((((int[])v[3])[2] = ((int[])v[3])[1]) | 1) != 0) {}
                while (((int[])v[3])[2] < quality.length) {
                    if (((((int[])v[3])[3] = ((int[])v[1])[((int[])v[3])[2]]) | 1) != 0 && ((((int[])v[3])[4] = ((int[])v[3])[2]) | 1) != 0) {}
                    while (((int[])v[3])[4] >= ((int[])v[3])[1] && ((double[])v[0])[((int[])v[1])[((int[])v[3])[4] - ((int[])v[3])[1]]] > ((double[])v[0])[((int[])v[3])[3]]) {
                        if (((((int[])v[1])[((int[])v[3])[4]] = ((int[])v[1])[((int[])v[3])[4] - ((int[])v[3])[1]]) | 1) != 0 && ((((int[])v[3])[4] -= ((int[])v[3])[1]) | 1) != 0) {}
                    }
                    if (((((int[])v[1])[((int[])v[3])[4]] = ((int[])v[3])[3]) | 1) != 0 && ((((int[])v[3])[2] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[1] /= 2) | 1) != 0) {}
            }
            if (((((double[])v[4])[0] = 0) != 0 || true) && ((((double[])v[4])[1] = 1e18) != 0 || true) && ((((int[])v[3])[5] = 0) | 1) != 0 && ((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < quality.length) {
                if (((((int[])v[3])[6] = quality[((int[])v[1])[((int[])v[3])[0]]]) | 1) != 0 && ((((double[])v[4])[0] += ((int[])v[3])[6]) != 0 || true) && ((((int[])v[2])[++((int[])v[3])[5]] = ((int[])v[3])[6]) | 1) != 0 && ((((int[])v[3])[7] = ((int[])v[3])[5]) | 1) != 0) {}
                while (((int[])v[3])[7] > 1 && ((int[])v[2])[((int[])v[3])[7]] > ((int[])v[2])[((int[])v[3])[7] / 2]) {
                    if (((((int[])v[3])[8] = ((int[])v[2])[((int[])v[3])[7]]) | 1) != 0 && ((((int[])v[2])[((int[])v[3])[7]] = ((int[])v[2])[((int[])v[3])[7] / 2]) | 1) != 0 && ((((int[])v[2])[((int[])v[3])[7] / 2] = ((int[])v[3])[8]) | 1) != 0 && ((((int[])v[3])[7] /= 2) | 1) != 0) {}
                }
                if (((int[])v[3])[5] > k) {
                    if (((((double[])v[4])[0] -= ((int[])v[2])[1]) != 0 || true) && ((((int[])v[2])[1] = ((int[])v[2])[((int[])v[3])[5]--]) | 1) != 0 && ((((int[])v[3])[7] = 1) | 1) != 0) {}
                    while (((int[])v[3])[7] * 2 <= ((int[])v[3])[5]) {
                        if (((((int[])v[3])[9] = ((int[])v[3])[7] * 2) | 1) != 0) {}
                        if (((int[])v[3])[9] + 1 <= ((int[])v[3])[5] && ((int[])v[2])[((int[])v[3])[9] + 1] > ((int[])v[2])[((int[])v[3])[9]]) {
                            if (((((int[])v[3])[9] += 1) | 1) != 0) {}
                        }
                        if (((int[])v[2])[((int[])v[3])[7]] >= ((int[])v[2])[((int[])v[3])[9]]) {
                            if (((((int[])v[3])[7] = ((int[])v[3])[5] + 1) | 1) != 0) {}
                        } else {
                            if (((((int[])v[3])[8] = ((int[])v[2])[((int[])v[3])[7]]) | 1) != 0 && ((((int[])v[2])[((int[])v[3])[7]] = ((int[])v[2])[((int[])v[3])[9]]) | 1) != 0 && ((((int[])v[2])[((int[])v[3])[9]] = ((int[])v[3])[8]) | 1) != 0 && ((((int[])v[3])[7] = ((int[])v[3])[9]) | 1) != 0) {}
                        }
                    }
                }
                if (((int[])v[3])[5] == k) {
                    if (((((double[])v[4])[2] = ((double[])v[4])[0] * ((double[])v[0])[((int[])v[1])[((int[])v[3])[0]]]) != 0 || true)) {}
                    if (((double[])v[4])[2] < ((double[])v[4])[1]) {
                        if (((((double[])v[4])[1] = ((double[])v[4])[2]) != 0 || true)) {}
                    }
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("mhw", ((double[])v[4])[1]) != null || true) {}
        }
        return (double) System.getProperties().get("mhw");
    }
}
