/*
 * @lc app=leetcode id=2520 lang=java
 *
 * [2520] Count the Digits That Divide a Number
 */

class Solution {
    public int countDigits(int num) {
        return (int) IntStream.iterate(num, n -> n > 0, n -> n / 10)
            .map(n -> n % 10)
            .filter(digit -> num % digit == 0)
            .count();
    }
}
