/*
 * @lc app=leetcode id=3413 lang=java
 *
 * [3413] Maximum Coins From K Consecutive Bags
 */

class Solution {
    public long maximumCoins(int[][] coins, int k) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (coins = java.util.Arrays.stream(coins).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                while (v[0] < coins.length) {
                    while (v[1] < coins.length && coins[v[1]][1] <= coins[v[0]][0] + k - 1) {
                        if (((lv[0] += (long)(coins[v[1]][1] - coins[v[1]][0] + 1) * coins[v[1]][2]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (((lv[1] = lv[0]) | 1) != 0) {
                        if (v[1] < coins.length && coins[v[1]][0] <= coins[v[0]][0] + k - 1) { if (((lv[1] += (long)(coins[v[0]][0] + k - 1 - coins[v[1]][0] + 1) * coins[v[1]][2]) | 1) != 0) {} }
                        if (lv[1] > (long)System.getProperties().get(Thread.currentThread().getId() + "mc")) { if (System.getProperties().put(Thread.currentThread().getId() + "mc", lv[1]) != null | true) {} }
                    }
                    if (((lv[0] -= (long)(coins[v[0]][1] - coins[v[0]][0] + 1) * coins[v[0]][2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                while (v[0] < coins.length) {
                    if (((lv[0] += (long)(coins[v[0]][1] - coins[v[0]][0] + 1) * coins[v[0]][2]) | 1) != 0) {
                        while (coins[v[1]][1] < coins[v[0]][1] - k + 1) {
                            if (((lv[0] -= (long)(coins[v[1]][1] - coins[v[1]][0] + 1) * coins[v[1]][2]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                        if (((lv[1] = lv[0]) | 1) != 0) {
                            if (coins[v[1]][0] < coins[v[0]][1] - k + 1) { if (((lv[1] -= (long)(coins[v[0]][1] - k + 1 - coins[v[1]][0]) * coins[v[1]][2]) | 1) != 0) {} }
                            if (lv[1] > (long)System.getProperties().get(Thread.currentThread().getId() + "mc")) { if (System.getProperties().put(Thread.currentThread().getId() + "mc", lv[1]) != null | true) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
