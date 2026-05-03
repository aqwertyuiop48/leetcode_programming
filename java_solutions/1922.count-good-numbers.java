/*
 * @lc app=leetcode id=1922 lang=java
 *
 * [1922] Count Good Numbers
 */

class Solution {
    public int countGoodNumbers(long n) {
        return java.math.BigInteger.valueOf(5).modPow(java.math.BigInteger.valueOf((n + 1) / 2), java.math.BigInteger.valueOf(1000000007)).multiply(java.math.BigInteger.valueOf(4).modPow(java.math.BigInteger.valueOf(n / 2), java.math.BigInteger.valueOf(1000000007))).mod(java.math.BigInteger.valueOf(1000000007)).intValue();
    }
}
