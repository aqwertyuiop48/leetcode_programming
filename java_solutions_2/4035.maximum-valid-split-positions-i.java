/*
 * @lc app=leetcode id=4035 lang=java
 *
 * [4035] Maximum Valid Split Positions I
 */

import java.math.*;
class Solution {
public int maxValidSplits(int[] nums) {
    return Stream.<IntBinaryOperator[]>of(new IntBinaryOperator[1])
        .peek(h -> h[0] = (x, y) -> y == 0 ? x : h[0].applyAsInt(y, x % y))
        .map(h -> h[0])
        .mapToInt(g -> Stream.of(new int[nums.length + 1])
            .peek(P -> IntStream.range(0, nums.length).forEach(i -> P[i + 1] = g.applyAsInt(P[i], nums[i])))
            .mapToInt(P -> Stream.of(new int[nums.length + 2])
                .peek(S -> IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1)
                    .forEach(i -> S[i] = g.applyAsInt(S[i + 1], nums[i])))
                .mapToInt(S -> IntStream.rangeClosed(0, nums.length)
                    .map(j -> Stream.of(g.applyAsInt(P[j], S[j + 1]))
                        .mapToInt(G -> Math.max(0,
                            nums.length - (j < nums.length ? 1 : 0) - 1
                            - (int) IntStream.concat(
                                    IntStream.rangeClosed(1, j).map(t -> P[t]),
                                    Stream.of(new int[]{P[j]}).flatMapToInt(c ->
                                        IntStream.range(j + 1, nums.length)
                                            .map(i -> c[0] = g.applyAsInt(c[0], nums[i]))))
                                .takeWhile(v -> v != G).count()
                            - (int) IntStream.concat(
                                    IntStream.rangeClosed(1, nums.length - 1 - j).map(x -> S[nums.length - x]),
                                    Stream.of(new int[]{S[j + 1]}).flatMapToInt(c ->
                                        IntStream.range(0, j)
                                            .map(x -> c[0] = g.applyAsInt(c[0], nums[j - 1 - x]))))
                                .takeWhile(v -> v != G).count()))
                        .findFirst().getAsInt())
                    .max().getAsInt())
                .findFirst().getAsInt())
            .findFirst().getAsInt())
        .findFirst().getAsInt();
}
}
