/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        return (n<=0)? false : (Math.abs(Math.log(n)/Math.log(4) - (int)(Math.log(n)/Math.log(4)))) < 1e-10;
    }
}
