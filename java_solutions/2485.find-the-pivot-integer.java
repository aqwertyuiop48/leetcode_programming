/*
 * @lc app=leetcode id=2485 lang=java
 *
 * [2485] Find the Pivot Integer
 */

class Solution {
    public int pivotInteger(int n) {
        return (int) Math.sqrt(n * (n + 1) / 2) * (int) Math.sqrt(n * (n + 1) / 2) == n * (n + 1) / 2 
            ? (int) Math.sqrt(n * (n + 1) / 2) 
            : -1;
    }
}
