/*
 * @lc app=leetcode id=2673 lang=java
 *
 * [2673] Make Costs of Paths Equal in a Binary Tree
 */

class Solution {
    public int minIncrements(int n, int[] cost) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mi", 0) != null | true) && ((v[0] = n / 2 - 1) | 1) != 0) {
            while (v[0] >= 0) {
                if (((v[1] += Math.abs(cost[v[0] * 2 + 1] - cost[v[0] * 2 + 2])) | 1) != 0 && ((cost[v[0]] += Math.max(cost[v[0] * 2 + 1], cost[v[0] * 2 + 2])) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mi", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mi");
    }
}
