/*
 * @lc app=leetcode id=2544 lang=java
 *
 * [2544] Alternating Digit Sum
 */

class Solution {
    public int alternateDigitSum(int n) {
        return IntStream.range(0, String.valueOf(n).length())
            .map(i -> (String.valueOf(n).charAt(i) - '0') * (i % 2 == 0 ? 1 : -1))
            .sum();
    }
}
