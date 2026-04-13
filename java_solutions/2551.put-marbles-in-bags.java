/*
 * @lc app=leetcode id=2551 lang=java
 *
 * [2551] Put Marbles in Bags
 */

class Solution { public long putMarbles(int[] weights, int k) { return k == 1 ? 0L : ((Function<long[], Long>) pairs -> Arrays.stream(pairs).skip(pairs.length - k + 1).sum() - Arrays.stream(pairs).limit(k - 1).sum()).apply(IntStream.range(0, weights.length - 1).mapToLong(i -> (long)weights[i] + weights[i + 1]).sorted().toArray()); } }
