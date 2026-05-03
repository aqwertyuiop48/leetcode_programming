/*
 * @lc app=leetcode id=1237 lang=java
 *
 * [1237] Find Positive Integer Solution for a Given Equation
 */

class Solution {
    public java.util.List<java.util.List<Integer>> findSolution(CustomFunction customfunction, int z) {
        return java.util.stream.IntStream.rangeClosed(1, 1000).boxed().flatMap(x -> java.util.stream.IntStream.rangeClosed(1, 1000).filter(y -> customfunction.f(x, y) == z).mapToObj(y -> java.util.Arrays.asList(x, y))).collect(java.util.stream.Collectors.toList());
    }
}
