/*
 * @lc app=leetcode id=1957 lang=java
 *
 * [1957] Delete Characters to Make Fancy String
 */

class Solution {
    public String makeFancyString(String s) {
        return IntStream.range(0, s.length())
            .filter(i -> i < 2 || s.charAt(i) != s.charAt(i - 1) || s.charAt(i) != s.charAt(i - 2))
            .mapToObj(i -> String.valueOf(s.charAt(i)))
            .collect(Collectors.joining());
    }
}
