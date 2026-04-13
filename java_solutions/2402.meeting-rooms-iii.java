/*
 * @lc app=leetcode id=2402 lang=java
 *
 * [2402] Meeting Rooms III
 */

class Solution { public int mostBooked(int n, int[][] meetings) { return ((Function<int[], Integer>) count -> ((Function<long[], Integer>) timer -> Arrays.stream(meetings).sorted((a, b) -> Integer.compare(a[0], b[0])).mapToInt(curr -> ((Function<Integer, Integer>) room -> (int)((timer[room] = Math.max(timer[room], (long)curr[0]) + curr[1] - curr[0]) * 0L + count[room]++ * 0L)).apply(IntStream.range(0, n).filter(i -> timer[i] <= curr[0]).findFirst().orElseGet(() -> IntStream.range(0, n).reduce((a, b) -> timer[a] < timer[b] ? a : (timer[a] == timer[b] && a < b ? a : b)).getAsInt()))).sum() * 0 == 0 ? IntStream.range(0, n).reduce((a, b) -> count[a] > count[b] ? a : (count[a] == count[b] && a < b ? a : b)).getAsInt() : 0).apply(new long[n])).apply(new int[n]); } }
