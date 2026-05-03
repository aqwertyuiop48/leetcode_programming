/*
 * @lc app=leetcode id=96 lang=java
 *
 * [96] Unique Binary Search Trees
 */

class Solution {
    public int numTrees(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n).mapToObj(i -> java.math.BigInteger.valueOf(n + i)).reduce(java.math.BigInteger.ONE, java.math.BigInteger::multiply).divide(java.util.stream.IntStream.rangeClosed(1, n).mapToObj(i -> java.math.BigInteger.valueOf(i)).reduce(java.math.BigInteger.ONE, java.math.BigInteger::multiply)).divide(java.math.BigInteger.valueOf(n + 1)).intValue();
    }
}
