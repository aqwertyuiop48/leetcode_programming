/*
 * @lc app=leetcode id=2259 lang=java
 *
 * [2259] Remove Digit From Number to Maximize Result
 */

class Solution {
    public String removeDigit(String number, char digit) {
        return IntStream.range(0, number.length())
            .filter(i -> number.charAt(i) == digit)
            .mapToObj(i -> number.substring(0, i) + number.substring(i + 1))
            .max(String::compareTo)
            .get();
    }
}
