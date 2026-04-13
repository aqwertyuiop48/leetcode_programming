/*
 * @lc app=leetcode id=2283 lang=java
 *
 * [2283] Check if Number Has Equal Digit Count and Digit Value
 */

class Solution {
    public boolean digitCount(String num) {
        return IntStream.range(0, num.length())
            .allMatch(i -> (num.charAt(i) - '0') == num.chars()
                .filter(c -> c - '0' == i)
                .count());
    }
}
