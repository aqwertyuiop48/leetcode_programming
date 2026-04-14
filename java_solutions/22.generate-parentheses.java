/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

class Solution {
    public List<String> generateParenthesis(int n) {
        return IntStream.range(0, 2 * n).boxed().reduce(List.of(""), (list, i) -> list.stream().flatMap(s -> Stream.concat(s.replace(")", "").length() < n ? Stream.of(s + "(") : Stream.empty(), s.length() < 2 * s.replace(")", "").length() ? Stream.of(s + ")") : Stream.empty())).toList(), (a, b) -> a);
    }
}
