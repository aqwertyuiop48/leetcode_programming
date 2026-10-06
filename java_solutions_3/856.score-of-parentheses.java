/*
 * @lc app=leetcode id=856 lang=java
 *
 * [856] Score of Parentheses
 */

class Solution {
    public int scoreOfParentheses(String s) {
        return new int[1] instanceof int[] d
            ? java.util.stream.IntStream.range(0, s.length()).map(i -> s.charAt(i) == '(' ? d[0]++ * 0 : --d[0] >= 0 && s.charAt(i - 1) == '(' ? 1 << d[0] : 0).sum() : 0;
    }
}
