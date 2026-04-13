/*
 * @lc app=leetcode id=1822 lang=java
 *
 * [1822] Sign of the Product of an Array
 */

class Solution {
    public int arraySign(int[] nums) {
        return Arrays.stream(nums)
            .map(Integer::signum)
            .reduce(1, (a, b) -> a * b);
    }
}
