/*
 * @lc app=leetcode id=241 lang=java
 *
 * [241] Different Ways to Add Parentheses
 */

class Solution {
    public java.util.List<Integer> diffWaysToCompute(String expression) {
        return java.util.Optional.of(java.util.stream.IntStream.range(0, expression.length()).filter(i -> !Character.isDigit(expression.charAt(i))).boxed().flatMap(i -> diffWaysToCompute(expression.substring(0, i)).stream().flatMap(l -> diffWaysToCompute(expression.substring(i + 1)).stream().map(r -> expression.charAt(i) == '+' ? l + r : expression.charAt(i) == '-' ? l - r : l * r))).collect(java.util.stream.Collectors.toList())).map(res -> res.isEmpty() ? java.util.Collections.singletonList(Integer.parseInt(expression)) : res).get();
    }
}
