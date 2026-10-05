/*
 * @lc app=leetcode id=3945 lang=java
 *
 * [3945] Digit Frequency Score
 */

class Solution {
public int digitFrequencyScore(int n) {
    return String.valueOf(n).chars().map(c -> c - '0').sum();
}
}
