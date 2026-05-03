/*
 * @lc app=leetcode id=2806 lang=java
 *
 * [2806] Account Balance After Rounded Purchase
 */

class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - (purchaseAmount + 5) / 10 * 10;
    }
}
