/*
 * @lc app=leetcode id=2180 lang=java
 *
 * [2180] Count Integers With Even Digit Sum
 */

class Solution {
    public int countEven(int num) {
        return (int) IntStream.rangeClosed(1, num)
            .filter(i -> String.valueOf(i).chars().map(c -> c - '0').sum() % 2 == 0)
            .count();
    }
}
