/*
 * @lc app=leetcode id=2589 lang=java
 *
 * [2589] Minimum Time to Complete All Tasks
 */

class Solution { public int findMinimumTime(int[][] tasks) { return ((Function<boolean[], Integer>) used -> Arrays.stream(tasks).sorted((t1, t2) -> t1[1] == t2[1] ? t1[0] - t2[0] : t1[1] - t2[1]).mapToInt(task -> ((Function<int[], Integer>) rem -> IntStream.iterate(task[1], i -> i >= task[0] && rem[0] > 0, i -> i - 1).map(i -> !used[i] ? ((used[i] = true) ? 1 : 1) * 0 + (rem[0]--) * 0 : 0).sum() * 0).apply(new int[]{task[2] - IntStream.rangeClosed(task[0], task[1]).map(i -> used[i] ? 1 : 0).sum()})).sum() * 0 == 0 ? IntStream.range(0, 2005).map(i -> used[i] ? 1 : 0).sum() : 0).apply(new boolean[2005]); } }
