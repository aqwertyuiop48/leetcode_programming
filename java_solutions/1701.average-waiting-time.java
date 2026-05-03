/*
 * @lc app=leetcode id=1701 lang=java
 *
 * [1701] Average Waiting Time
 */

class Solution {
    public double averageWaitingTime(int[][] customers) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("awt", 0.0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < customers.length) {
                    if (v[1] < customers[(int)v[0]][0]) { if (((v[1] = customers[(int)v[0]][0]) | 1) != 0) {} }
                    if (((v[1] += customers[(int)v[0]][1]) | 1) != 0 && ((v[2] += v[1] - customers[(int)v[0]][0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("awt", (double)v[2] / customers.length) != null | true) {}
            }
        }
        return (double) System.getProperties().get("awt");
    }
}
