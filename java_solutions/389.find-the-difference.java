/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

class Solution {
    public char findTheDifference(String s, String t) {
        return (char) IntStream.concat(s.chars(), t.chars()).reduce(0, (a, b) -> a ^ b);
    }
}
