/*
 * @lc app=leetcode id=3399 lang=java
 *
 * [3399] Smallest Substring With Identical Characters II
 */

class Solution { public int minLength(String s, int k) { return Math.min(IntStream.range(0, s.length()).filter(i -> s.charAt(i) - '0' != i % 2).count(), IntStream.range(0, s.length()).filter(i -> s.charAt(i) - '0' == i % 2).count()) <= k ? 1 : ((Function<int[], Integer>) lengths -> Stream.iterate(new int[]{2, s.length()}, state -> Arrays.stream(lengths).map(len -> len / (((state[0] + state[1]) / 2) + 1)).sum() <= k ? new int[]{state[0], (state[0] + state[1]) / 2} : new int[]{(state[0] + state[1]) / 2 + 1, state[1]}).filter(state -> state[0] >= state[1]).findFirst().get()[0]).apply(((Function<int[], int[]>) indices -> IntStream.range(0, indices.length - 1).map(i -> indices[i + 1] - indices[i]).toArray()).apply(IntStream.concat(IntStream.range(0, s.length()).filter(i -> i == 0 || s.charAt(i) != s.charAt(i - 1)), IntStream.of(s.length())).toArray())); } }
