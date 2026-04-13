/*
 * @lc app=leetcode id=1808 lang=java
 *
 * [1808] Maximize Number of Nice Divisors
 */

class Solution {
    public int maxNiceDivisors(int n) {
        return n <= 3 ? n : java.math.BigInteger.valueOf(3).modPow(java.math.BigInteger.valueOf(n % 3 == 0 ? n / 3 : n % 3 == 1 ? (n - 4) / 3 : n / 3), java.math.BigInteger.valueOf(1000000007)).multiply(java.math.BigInteger.valueOf(n % 3 == 0 ? 1 : n % 3 == 1 ? 4 : 2)).mod(java.math.BigInteger.valueOf(1000000007)).intValue();
    }
}
