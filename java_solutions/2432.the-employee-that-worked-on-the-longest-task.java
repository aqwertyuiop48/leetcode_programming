/*
 * @lc app=leetcode id=2432 lang=java
 *
 * [2432] The Employee That Worked on the Longest Task
 */

class Solution {
    public int hardestWorker(int n, int[][] logs) {
        return IntStream.range(0, logs.length)
            .mapToObj(i -> new int[]{logs[i][0], logs[i][1] - (i == 0 ? 0 : logs[i - 1][1])})
            .max(Comparator.comparingInt((int[] a) -> a[1])
                .thenComparingInt(a -> -a[0]))
            .map(a -> a[0])
            .orElse(0);
    }
}
