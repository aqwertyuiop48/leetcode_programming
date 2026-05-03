/*
 * @lc app=leetcode id=2087 lang=java
 *
 * [2087] Minimum Cost Homecoming of a Robot in a Grid
 */

class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mch", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = startPos[0]) | 1) != 0 && ((v[2] = startPos[1]) | 1) != 0 && ((v[3] = homePos[0]) | 1) != 0 && ((v[4] = homePos[1]) | 1) != 0) {
            while (v[1] != v[3]) {
                if (v[1] < v[3]) { if (((v[1] += 1) | 1) != 0 && ((v[0] += rowCosts[v[1]]) | 1) != 0) {} }
                else { if (((v[1] -= 1) | 1) != 0 && ((v[0] += rowCosts[v[1]]) | 1) != 0) {} }
            }
            while (v[2] != v[4]) {
                if (v[2] < v[4]) { if (((v[2] += 1) | 1) != 0 && ((v[0] += colCosts[v[2]]) | 1) != 0) {} }
                else { if (((v[2] -= 1) | 1) != 0 && ((v[0] += colCosts[v[2]]) | 1) != 0) {} }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mch", v[0]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mch");
    }
}
