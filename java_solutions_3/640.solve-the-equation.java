/*
 * @lc app=leetcode id=640 lang=java
 *
 * [640] Solve the Equation
 */

class Solution {
    public String solveEquation(String equation) {
        return ((java.util.function.Function<String, int[]>) side -> java.util.regex.Pattern.compile("[+-]?\\d*x|[+-]?\\d+").matcher(side).results().map(java.util.regex.MatchResult::group)
                .map(t -> t.endsWith("x") ? new int[]{t.length() == 1 || t.equals("+x") ? 1 : t.equals("-x") ? -1 : Integer.parseInt(t.substring(0, t.length() - 1)), 0} : new int[]{0, Integer.parseInt(t)})
                .reduce(new int[2], (a, b) -> new int[]{a[0] + b[0], a[1] + b[1]})) instanceof java.util.function.Function<String, int[]> p
            && java.util.Arrays.stream(equation.split("=")).map(p).toList() instanceof java.util.List<int[]> v
            ? (v.get(0)[0] - v.get(1)[0] == 0 ? (v.get(1)[1] - v.get(0)[1] == 0 ? "Infinite solutions" : "No solution")
                : "x=" + (v.get(1)[1] - v.get(0)[1]) / (v.get(0)[0] - v.get(1)[0]))
            : "";
    }
}
