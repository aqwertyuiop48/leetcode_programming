/*
 * @lc app=leetcode id=990 lang=java
 *
 * [990] Satisfiability of Equality Equations
 */

class Solution {
    public boolean equationsPossible(String[] equations) {
        return java.util.stream.IntStream.range(0, 26).toArray() instanceof int[] p
            && ((java.util.function.IntUnaryOperator) x -> java.util.stream.IntStream.iterate(x, i -> p[i]).filter(i -> p[i] == i).findFirst().getAsInt()) instanceof java.util.function.IntUnaryOperator f
            && java.util.Arrays.stream(equations).filter(e -> e.charAt(1) == '=').allMatch(e -> (p[f.applyAsInt(e.charAt(0) - 'a')] = f.applyAsInt(e.charAt(3) - 'a')) >= 0)
            && java.util.Arrays.stream(equations).filter(e -> e.charAt(1) == '!').noneMatch(e -> f.applyAsInt(e.charAt(0) - 'a') == f.applyAsInt(e.charAt(3) - 'a'));
    }
}
