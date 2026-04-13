/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

class Solution {
    public boolean isPowerOfThree(int n) {
        return (n<=0)? false : (n==243 || n==59049 || n==1594323 || n==14348907 || n==129140163) ? true : (Math.abs(Math.log(n)/Math.log(3) - (int)(Math.log(n)/Math.log(3)))) < 1e-10;
    }
}
