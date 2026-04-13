/*
 * @lc app=leetcode id=1964 lang=java
 *
 * [1964] Find the Longest Valid Obstacle Course at Each Position
 */

class Solution { public int[] longestObstacleCourseAtEachPosition(int[] obstacles) { return ((Function<int[], Function<int[], Function<int[], int[]>>>) dp -> ans -> len -> IntStream.range(0, obstacles.length).reduce(0, (acc, i) -> ((IntUnaryOperator) idx -> (dp[idx] = obstacles[i]) * 0 + (idx == len[0] ? (len[0]++) * 0 : 0) + (ans[i] = idx + 1) * 0).applyAsInt(((ToIntFunction<int[]>) bounds -> IntStream.iterate(0, d -> bounds[0] <= bounds[1], d -> d + 1).reduce(0, (a, d) -> ((IntUnaryOperator) mid -> dp[mid] <= obstacles[i] ? (bounds[0] = mid + 1) * 0 : (bounds[1] = mid - 1) * 0).applyAsInt((bounds[0] + bounds[1]) >>> 1) * 0) * 0 == 0 ? bounds[0] : 0).applyAsInt(new int[]{0, len[0] - 1})) * 0) * 0 == 0 ? ans : ans).apply(new int[obstacles.length]).apply(new int[obstacles.length]).apply(new int[1]); } }
