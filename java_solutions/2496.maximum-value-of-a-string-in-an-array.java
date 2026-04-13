/*
 * @lc app=leetcode id=2496 lang=java
 *
 * [2496] Maximum Value of a String in an Array
 */

class Solution {
    public int maximumValue(String[] strs) {
        return Arrays.stream(strs)
            .mapToInt(s -> s.chars().allMatch(Character::isDigit) ? Integer.parseInt(s) : s.length())
            .max()
            .orElse(0);
    }
}
