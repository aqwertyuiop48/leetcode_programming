/*
 * @lc app=leetcode id=1716 lang=java
 *
 * [1716] Calculate Money in Leetcode Bank
 */

class Solution {
    public int totalMoney(int n) {
        return IntStream.range(0, n)
            .map(i -> (i / 7 + 1) + (i % 7))
            .sum();
    }
}
