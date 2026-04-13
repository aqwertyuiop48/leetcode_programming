/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

class Solution {
    public int arrangeCoins(int n) {
       return (int) (Math.sqrt(1+8L*n)-1)/2;
    }
}
