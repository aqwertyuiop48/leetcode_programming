/*
 * @lc app=leetcode id=922 lang=java
 *
 * [922] Sort Array By Parity II
 */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        return new int[nums.length] instanceof int[] r && new int[]{0, 1} instanceof int[] p && java.util.Arrays.stream(nums).peek(x -> r[p[x & 1]] = x + 0 * (p[x & 1] += 2)).allMatch(x -> true) ? r : null;
    }
}
