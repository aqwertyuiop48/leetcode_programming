/*
 * @lc app=leetcode id=1844 lang=java
 *
 * [1844] Replace All Digits with Characters
 */

class Solution {
    public String replaceDigits(String s) {
        return java.util.stream.IntStream.range(0, s.length()).mapToObj(i -> String.valueOf((char)(i % 2 == 0 ? s.charAt(i) : s.charAt(i-1) + s.charAt(i) - '0'))).collect(java.util.stream.Collectors.joining());
    }
}
