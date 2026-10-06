/*
 * @lc app=leetcode id=621 lang=java
 *
 * [621] Task Scheduler
 */

class Solution {
    public int leastInterval(char[] tasks, int n) {
        return new int[26] instanceof int[] c && java.util.stream.IntStream.range(0, tasks.length).peek(i -> c[tasks[i] - 'A']++).allMatch(x -> true)
            ? Math.max(tasks.length, (java.util.Arrays.stream(c).max().getAsInt() - 1) * (n + 1)
                + (int) java.util.Arrays.stream(c).filter(x -> x == java.util.Arrays.stream(c).max().getAsInt()).count())
            : 0;
    }
}
