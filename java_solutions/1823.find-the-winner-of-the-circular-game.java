/*
 * @lc app=leetcode id=1823 lang=java
 *
 * [1823] Find the Winner of the Circular Game
 */

class Solution {
    public int findTheWinner(int n, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("fw", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] <= n) { if (((v[1] = (v[1] + k) % v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (System.getProperties().put("fw", v[1] + 1) != null | true) {}
            }
        }
        return (int) System.getProperties().get("fw");
    }
}
