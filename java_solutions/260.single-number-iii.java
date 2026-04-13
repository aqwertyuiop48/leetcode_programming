/*
 * @lc app=leetcode id=260 lang=java
 *
 * [260] Single Number III
 */

class Solution {
    public int[] singleNumber(int[] nums) {
        return Optional.of(Arrays.stream(nums).reduce(0, (a, b) -> a ^ b)).map(xor -> new int[]{Arrays.stream(nums).filter(n -> (n & (xor & -xor)) == 0).reduce(0, (a, b) -> a ^ b), Arrays.stream(nums).filter(n -> (n & (xor & -xor)) != 0).reduce(0, (a, b) -> a ^ b)}).get();
    }
}
