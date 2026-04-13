/*
 * @lc app=leetcode id=2427 lang=java
 *
 * [2427] Number of Common Factors
 */

class Solution {
    public int commonFactors(int a, int b) {
        return (int) IntStream.rangeClosed(1, Math.min(a, b))
            .filter(i -> a % i == 0 && b % i == 0)
            .count();
    }
}
