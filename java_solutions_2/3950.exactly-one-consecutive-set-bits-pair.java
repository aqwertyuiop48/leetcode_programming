/*
 * @lc app=leetcode id=3950 lang=java
 *
 * [3950] Exactly One Consecutive Set Bits Pair
 */

class Solution {
    public boolean consecutiveSetBits(int n) {
        return Integer.bitCount(n & (n >> 1)) == 1;
    }
}
