/*
 * @lc app=leetcode id=3751 lang=java
 *
 * [3751] Total Waviness of Numbers in Range I
 */

class Solution {
    public int totalWaviness(int num1, int num2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tw", 0) != null | true) && ((v[0] = num1) | 1) != 0) {
            while (v[0] <= num2) {
                if (((v[1] = v[0]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    if (new int[15] instanceof int[] d) {
                        while (v[1] > 0) { if (((d[v[2]++] = v[1] % 10) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {} }
                        if (((v[3] = 1) | 1) != 0) {
                            while (v[3] < v[2] - 1) {
                                if ((d[v[3]] > d[v[3] - 1] && d[v[3]] > d[v[3] + 1]) || (d[v[3]] < d[v[3] - 1] && d[v[3]] < d[v[3] + 1])) {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "tw", v[4]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "tw");
    }
}
