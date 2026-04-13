/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

class Solution {
    public boolean isPerfectSquare(int num) {
        return (int)Math.pow(num,0.5) == Math.pow(num,0.5);
    }
}
