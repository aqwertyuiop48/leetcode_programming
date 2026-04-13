/*
 * @lc app=leetcode id=2169 lang=java
 *
 * [2169] Count Operations to Obtain Zero
 */

class Solution {
    public int countOperations(int num1, int num2) {
        return (num1 == 0 || num2 == 0) ? 0 : (num1 >= num2) 
            ? (num1 / num2) + countOperations(num1 % num2, num2) 
            : (num2 / num1) + countOperations(num1, num2 % num1);
    }
}
