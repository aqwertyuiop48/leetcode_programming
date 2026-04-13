/*
 * @lc app=leetcode id=2566 lang=java
 *
 * [2566] Maximum Difference by Remapping a Digit
 */

class Solution {
    public int minMaxDifference(int num) {
        return Stream.of(String.valueOf(num))
            .mapToInt(s -> Integer.parseInt(s.replace((char) s.chars().filter(c -> c != '9').findFirst().orElse('9'), '9')) 
                         - Integer.parseInt(s.replace(s.charAt(0), '0')))
            .findFirst()
            .getAsInt();
    }
}
