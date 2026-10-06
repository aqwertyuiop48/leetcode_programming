/*
 * @lc app=leetcode id=947 lang=java
 *
 * [947] Most Stones Removed with Same Row or Column
 */

class Solution {
    public int removeStones(int[][] stones) {
        return new int[20002] instanceof int[] p && java.util.stream.IntStream.range(0, 20002).peek(i -> p[i] = i).allMatch(x -> true)
            && ((java.util.function.IntUnaryOperator) x -> java.util.stream.IntStream.iterate(x, i -> p[i]).filter(i -> p[i] == i).findFirst().getAsInt()) instanceof java.util.function.IntUnaryOperator find
            && java.util.Arrays.stream(stones).allMatch(s -> (p[find.applyAsInt(s[0])] = find.applyAsInt(s[1] + 10001)) >= 0)
            ? stones.length - (int) java.util.Arrays.stream(stones).map(s -> find.applyAsInt(s[0])).distinct().count() : 0;
    }
}
