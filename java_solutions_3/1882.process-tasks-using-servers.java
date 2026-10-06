/*
 * @lc app=leetcode id=1882 lang=java
 *
 * [1882] Process Tasks Using Servers
 */

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        return new java.util.PriorityQueue<int[]>(java.util.Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1])) instanceof java.util.PriorityQueue<int[]> free
            && new java.util.PriorityQueue<long[]>(java.util.Comparator.comparingLong((long[] a) -> a[0]).thenComparingLong(a -> a[1]).thenComparingLong(a -> a[2])) instanceof java.util.PriorityQueue<long[]> busy
            && java.util.stream.IntStream.range(0, servers.length).mapToObj(i -> new int[]{servers[i], i}).allMatch(free::add)
            && new long[]{0} instanceof long[] t && new int[tasks.length] instanceof int[] ans
            && java.util.stream.IntStream.range(0, tasks.length).peek(j -> {
                if ((t[0] = Math.max(t[0], j)) < 0) {}
                if (free.isEmpty() && (t[0] = Math.max(t[0], busy.peek()[0])) < 0) {}
                while (!busy.isEmpty() && busy.peek()[0] <= t[0] && free.add(new int[]{(int) busy.peek()[1], (int) busy.poll()[2]})) {}
                if (java.util.Optional.of(free.poll()).map(s -> busy.add(new long[]{t[0] + tasks[j], s[0], s[1]}) && (ans[j] = s[1]) >= 0).get()) {}
            }).allMatch(x -> true)
            ? ans : null;
    }
}
