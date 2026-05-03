/*
 * @lc app=leetcode id=201 lang=java
 *
 * [201] Bitwise AND of Numbers Range
 */

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        return left == right ? left : left & (~0 << (32 - Integer.numberOfLeadingZeros(left ^ right)));
    }
}
