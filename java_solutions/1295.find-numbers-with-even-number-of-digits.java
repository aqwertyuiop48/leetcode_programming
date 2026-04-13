/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

class Solution {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums)
            .filter(n -> String.valueOf(n).length() % 2 == 0)
            .count();
    }
}
