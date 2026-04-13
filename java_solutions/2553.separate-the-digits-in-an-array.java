/*
 * @lc app=leetcode id=2553 lang=java
 *
 * [2553] Separate the Digits in an Array
 */

class Solution {
    public int[] separateDigits(int[] nums) {
        return Arrays.stream(nums)
            .mapToObj(String::valueOf)
            .flatMapToInt(s -> s.chars().map(Character::getNumericValue))
            .toArray();
    }
}
