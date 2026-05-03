/*
 * @lc app=leetcode id=2591 lang=java
 *
 * [2591] Distribute Money to Maximum Children
 */

class Solution {
    public int distMoney(int money, int children) {
        return money < children ? -1 : (money > 8 * children ? children - 1 : (money == 8 * children ? children : (money == 8 * children - 4 ? children - 2 : (money - children) / 7)));
    }
}
