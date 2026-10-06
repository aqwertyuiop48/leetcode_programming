/*
 * @lc app=leetcode id=684 lang=java
 *
 * [684] Redundant Connection
 */

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        return java.util.stream.IntStream.rangeClosed(0, edges.length).toArray() instanceof int[] p
            && ((java.util.function.IntUnaryOperator) x -> java.util.stream.IntStream.iterate(x, i -> p[i]).filter(i -> p[i] == i).findFirst().getAsInt()) instanceof java.util.function.IntUnaryOperator r
            ? java.util.Arrays.stream(edges).filter(e -> r.applyAsInt(e[0]) == r.applyAsInt(e[1]) || (p[r.applyAsInt(e[0])] = r.applyAsInt(e[1])) < 0).findFirst().get() : null;
    }
}
