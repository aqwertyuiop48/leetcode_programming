/*
 * @lc app=leetcode id=2928 lang=java
 *
 * [2928] Distribute Candies Among Children I
 */

class Solution {
    public int distributeCandies(int n, int limit) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "dc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] <= limit && v[0] <= n) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] <= limit && v[0] + v[1] <= n) {
                        if (n - v[0] - v[1] <= limit) { if (((v[2] += 1) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "dc", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "dc");
    }
}
