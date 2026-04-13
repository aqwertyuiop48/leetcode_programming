/*
 * @lc app=leetcode id=2243 lang=java
 *
 * [2243] Calculate Digit Sum of a String
 */

import java.util.stream.Collectors;

class Solution {
    public String digitSum(String s, int k) {
        return s.length() <= k ? s : digitSum(
            Arrays.stream(s.split("(?<=\\G.{" + k + "})"))
                .map(chunk -> String.valueOf(chunk.chars().map(Character::getNumericValue).sum()))
                .collect(Collectors.joining("")), 
            k
        );
    }
}
