/*
 * @lc app=leetcode id=2280 lang=java
 *
 * [2280] Minimum Lines to Represent a Line Chart
 */

class Solution {
    public int minimumLines(int[][] stockPrices) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ml", 0) != null | true)) {
            if (stockPrices.length == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "ml", 0) != null | true) {} }
            else if ((stockPrices = java.util.Arrays.stream(stockPrices).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && ((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[0] < stockPrices.length - 1) {
                    if ((long)(stockPrices[v[0]][1] - stockPrices[v[0] - 1][1]) * (stockPrices[v[0] + 1][0] - stockPrices[v[0]][0]) != (long)(stockPrices[v[0] + 1][1] - stockPrices[v[0]][1]) * (stockPrices[v[0]][0] - stockPrices[v[0] - 1][0])) {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ml", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ml");
    }
}
