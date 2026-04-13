/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 */

class Solution {
    public int trailingZeroes(int n) {
        return Stream.iterate(n / 5, i -> i > 0, i -> i / 5).mapToInt(Integer::intValue).sum();
    }
}
