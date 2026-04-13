/*
 * @lc app=leetcode id=2463 lang=java
 *
 * [2463] Minimum Total Distance Traveled
 */

class Solution { public long minimumTotalDistance(List<Integer> robot, int[][] factory) { return ((Function<int[], Function<int[][], Function<long[], Long>>>) rArr -> fArr -> dp -> IntStream.iterate(fArr.length - 1, j -> j >= 0, j -> j - 1).map(j -> IntStream.range(0, rArr.length).map(i -> ((Function<long[], Integer>) pre -> (int)((dp[i] = IntStream.rangeClosed(0, Math.min(fArr[j][1], rArr.length - i)).mapToLong(k -> ((LongUnaryOperator) cost -> k < rArr.length - i ? cost + ((pre[0] += Math.abs((long)rArr[i + k] - fArr[j][0])) * 0L) : cost).applyAsLong(dp[i + k] == Long.MAX_VALUE ? Long.MAX_VALUE : dp[i + k] + pre[0])).min().getAsLong()) * 0L)).apply(new long[1])).sum() * 0).sum() * 0 == 0 ? dp[0] : 0L).apply(robot.stream().mapToInt(i -> i).sorted().toArray()).apply(Arrays.stream(factory).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)).apply(IntStream.rangeClosed(0, robot.size()).mapToLong(i -> i == robot.size() ? 0L : Long.MAX_VALUE).toArray()); } }
