/*
 * @lc app=leetcode id=2595 lang=java
 *
 * [2595] Number of Even and Odd Bits
 */

class Solution {
public int[] evenOddBit(int n) {
    return new int[] {Integer.bitCount(n & 0b0101010101), Integer.bitCount(n & 0b1010101010)};
}
}
