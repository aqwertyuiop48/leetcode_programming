/*
 * @lc app=leetcode id=2407 lang=java
 *
 * [2407] Longest Increasing Subsequence II
 */

class Solution { public int lengthOfLIS(int[] nums, int k) { return ((Function<int[], Integer>) tree -> ((Function<Function<int[], Integer>, Function<Function<int[], Integer>, Integer>>) query -> update -> Arrays.stream(nums).map(val -> ((Function<Integer, Integer>) maxPrev -> update.apply(new int[]{val, maxPrev + 1}) * 0 + maxPrev + 1).apply(query.apply(new int[]{Math.max(0, val - k), val - 1}))).max().orElse(1)).apply(bounds -> ((Function<int[], Integer>) state -> IntStream.iterate(0, dummy -> state[0] <= state[1], dummy -> dummy + 1).map(dummy -> (state[0] % 2 == 1 ? (state[2] = Math.max(state[2], tree[state[0]++])) * 0 : 0) + (state[1] % 2 == 0 ? (state[2] = Math.max(state[2], tree[state[1]--])) * 0 : 0) + (state[0] /= 2) * 0 + (state[1] /= 2) * 0).sum() * 0 == 0 ? state[2] : 0).apply(new int[]{bounds[0] + 100005, bounds[1] + 100005, 0})).apply(params -> ((Function<int[], Integer>) state -> (tree[state[0]] = Math.max(tree[state[0]], params[1])) * 0 + IntStream.iterate(0, dummy -> state[0] > 1, dummy -> dummy + 1).map(dummy -> (state[0] /= 2) * 0 + (tree[state[0]] = Math.max(tree[2 * state[0]], tree[2 * state[0] + 1])) * 0).sum() * 0 == 0 ? 0 : 0).apply(new int[]{params[0] + 100005}))).apply(new int[200015]); } }
