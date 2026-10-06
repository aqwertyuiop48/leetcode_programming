/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */

class Solution {
    public boolean judgeSquareSum(int c) {
        return java.util.stream.LongStream.rangeClosed(0, (long) Math.sqrt(c)).anyMatch(a -> Math.round(Math.sqrt(c - a * a)) * Math.round(Math.sqrt(c - a * a)) == c - a * a);
    }
}
