/*
 * @lc app=leetcode id=1834 lang=java
 *
 * [1834] Single-Threaded CPU
 */

class Solution {
    public int[] getOrder(int[][] tasks) {
        return java.util.stream.IntStream.range(0, tasks.length).boxed().sorted(java.util.Comparator.comparingInt((Integer i) -> tasks[i][0])).toList() instanceof java.util.List<Integer> o
            && new java.util.PriorityQueue<Integer>(java.util.Comparator.comparingInt((Integer i) -> tasks[i][1]).thenComparingInt(i -> i)) instanceof java.util.PriorityQueue<Integer> pq
            && new int[]{0} instanceof int[] p && new long[]{0} instanceof long[] t && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList<Integer> res
            && java.util.stream.Stream.of(0).peek(z -> {
                while (p[0] < tasks.length || !pq.isEmpty()) {
                    if (pq.isEmpty() && t[0] < tasks[o.get(p[0])][0] && (t[0] = tasks[o.get(p[0])][0]) < 0) {}
                    while (p[0] < tasks.length && tasks[o.get(p[0])][0] <= t[0] && pq.add(o.get(p[0]++))) {}
                    if (res.add(pq.peek()) && (t[0] += tasks[pq.poll()][1]) < 0) {}
                }
            }).anyMatch(z -> true)
            ? res.stream().mapToInt(i -> i).toArray() : null;
    }
}
