/*
 * @lc app=leetcode id=1882 lang=java
 *
 * [1882] Process Tasks Using Servers
 */

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        return java.util.Optional.of(java.util.stream.IntStream.range(0, servers.length).mapToObj(i -> new int[]{servers[i], i}).collect(java.util.stream.Collectors.toCollection(() -> new java.util.PriorityQueue<int[]>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0])))).map(freeQ -> java.util.Optional.of(new java.util.PriorityQueue<int[]>((a, b) -> a[0] == b[0] ? (a[1] == b[1] ? a[2] - b[2] : a[1] - b[1]) : a[0] - b[0])).map(busyQ -> java.util.stream.Stream.iterate(new Object[]{0, 0, new int[tasks.length]}, s -> (int)s[1] < tasks.length, s -> java.util.Optional.of(Math.max((int)s[0], freeQ.isEmpty() ? busyQ.peek()[0] : (int)s[0])).map(time -> java.util.stream.Stream.iterate(0, dummy -> !busyQ.isEmpty() && busyQ.peek()[0] <= time, dummy -> freeQ.offer(new int[]{busyQ.peek()[1], busyQ.poll()[2]}) ? 1 : 1).reduce(0, (a, b) -> a).equals(0) ? java.util.stream.Stream.iterate((int)s[1], j -> j <= time && j < tasks.length && !freeQ.isEmpty(), j -> java.util.Optional.of(freeQ.poll()).map(server -> busyQ.offer(new int[]{time + tasks[j], server[0], server[1]}) ? ((((int[])s[2])[j] = server[1]) * 0 + j + 1) : j + 1).get()).reduce((int)s[1], (a, b) -> b).equals(-1) ? null : new Object[]{freeQ.isEmpty() ? busyQ.peek()[0] : time, java.util.stream.Stream.iterate((int)s[1], j -> j <= time && j < tasks.length && !freeQ.isEmpty(), j -> java.util.Optional.of(freeQ.poll()).map(server -> busyQ.offer(new int[]{time + tasks[j], server[0], server[1]}) ? ((((int[])s[2])[j] = server[1]) * 0 + j + 1) : j + 1).get()).reduce((int)s[1], (a, b) -> b), s[2]} : new Object[]{freeQ.isEmpty() ? busyQ.peek()[0] : time, java.util.stream.Stream.iterate((int)s[1], j -> j <= time && j < tasks.length && !freeQ.isEmpty(), j -> java.util.Optional.of(freeQ.poll()).map(server -> busyQ.offer(new int[]{time + tasks[j], server[0], server[1]}) ? ((((int[])s[2])[j] = server[1]) * 0 + j + 1) : j + 1).get()).reduce((int)s[1], (a, b) -> b), s[2]}).get()).reduce((a, b) -> b).map(s -> (int[])s[2]).get()).get();
    }
}
