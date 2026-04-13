/*
 * @lc app=leetcode id=2413 lang=java
 *
 * [2413] Smallest Even Multiple
 */

class Solution {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : 2*n;
    }
}
