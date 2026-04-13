/*
 * @lc app=leetcode id=879 lang=java
 *
 * [879] Profitable Schemes
 */

class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        if (new Object[]{new int[minProfit + 1][n + 1], new int[10]} instanceof Object[] v) {
            if (((((int[][])v[0])[0][0] = 1) | 1) != 0 && ((((int[])v[1])[0] = 0) | 1) != 0) {}
            while (((int[])v[1])[0] < group.length) {
                if (((((int[])v[1])[1] = minProfit) | 1) != 0) {}
                while (((int[])v[1])[1] >= 0) {
                    if (((((int[])v[1])[2] = n - group[((int[])v[1])[0]]) | 1) != 0) {}
                    while (((int[])v[1])[2] >= 0) {
                        if (((((int[])v[1])[3] = Math.min(minProfit, ((int[])v[1])[1] + profit[((int[])v[1])[0]])) | 1) != 0) {}
                        if (((((int[][])v[0])[((int[])v[1])[3]][((int[])v[1])[2] + group[((int[])v[1])[0]]] = (((int[][])v[0])[((int[])v[1])[3]][((int[])v[1])[2] + group[((int[])v[1])[0]]] + ((int[][])v[0])[((int[])v[1])[1]][((int[])v[1])[2]]) % 1000000007) | 1) != 0) {}
                        if (((((int[])v[1])[2] -= 1) | 1) != 0) {}
                    }
                    if (((((int[])v[1])[1] -= 1) | 1) != 0) {}
                }
                if (((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[1])[0] = 0) | 1) != 0 && ((((int[])v[1])[4] = 0) | 1) != 0) {}
            while (((int[])v[1])[0] <= n) {
                if (((((int[])v[1])[4] = (((int[])v[1])[4] + ((int[][])v[0])[minProfit][((int[])v[1])[0]]) % 1000000007) | 1) != 0 && ((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("ps", ((int[])v[1])[4]) != null || true) {}
        }
        return (int) System.getProperties().get("ps");
    }
}
