/*
 * @lc app=leetcode id=1796 lang=java
 *
 * [1796] Second Largest Digit in a String
 */

class Solution {
    public int secondHighest(String s) {
        return s.chars()
            .filter(Character::isDigit)
            .map(c -> c - '0')
            .distinct()
            .boxed()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElse(-1);
    }
}
