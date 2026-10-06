/*
 * @lc app=leetcode id=762 lang=java
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */

class Solution {
    public int countPrimeSetBits(int left, int right) {
        return (int) java.util.stream.IntStream.rangeClosed(left, right).filter(x -> (665772 >> Integer.bitCount(x) & 1) == 1).count();
    }
}
