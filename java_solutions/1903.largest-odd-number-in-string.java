/*
 * @lc app=leetcode id=1903 lang=java
 *
 * [1903] Largest Odd Number in String
 */

class Solution {
    public String largestOddNumber(String num) {
        return num.substring(0, IntStream.range(0, num.length())
            .map(i -> num.length() - 1 - i)
            .filter(i -> (num.charAt(i) - '0') % 2 != 0)
            .findFirst()
            .stream()
            .map(i -> i + 1)
            .findFirst()
            .orElse(0));
    }
}
