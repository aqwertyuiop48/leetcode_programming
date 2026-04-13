/*
 * @lc app=leetcode id=1835 lang=java
 *
 * [1835] Find XOR Sum of All Pairs Bitwise AND
 */

class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).reduce(0, (a, b) -> a ^ b) & Arrays.stream(arr2).reduce(0, (a, b) -> a ^ b);
    }
}
