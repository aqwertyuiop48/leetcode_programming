/*
 * @lc app=leetcode id=2535 lang=java
 *
 * [2535] Difference Between Element Sum and Digit Sum of an Array
 */

class Solution {
    public int differenceOfSum(int[] nums) {
        return Arrays.stream(nums).sum() - Arrays.stream(nums)
            .flatMap(n -> String.valueOf(n).chars().map(Character::getNumericValue))
            .sum();
    }
}
