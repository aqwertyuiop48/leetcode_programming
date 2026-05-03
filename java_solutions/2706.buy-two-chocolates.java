/*
 * @lc app=leetcode id=2706 lang=java
 *
 * [2706] Buy Two Chocolates
 */

class Solution {
    public int buyChoco(int[] prices, int money) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "bc", money) != null | true) && ((v[0] = 1000) | 1) != 0 && ((v[1] = 1000) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[2] < prices.length) {
                if (prices[v[2]] < v[0]) { if (((v[1] = v[0]) | 1) != 0 && ((v[0] = prices[v[2]]) | 1) != 0) {} }
                else if (prices[v[2]] < v[1]) { if (((v[1] = prices[v[2]]) | 1) != 0) {} }
                if (((v[2] += 1) | 1) != 0) {}
            }
            if (v[0] + v[1] <= money) { if (System.getProperties().put(Thread.currentThread().getId() + "bc", money - v[0] - v[1]) != null | true) {} }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "bc");
    }
}
