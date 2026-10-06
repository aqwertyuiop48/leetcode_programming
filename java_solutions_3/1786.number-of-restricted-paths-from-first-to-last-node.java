/*
 * @lc app=leetcode id=1786 lang=java
 *
 * [1786] Number of Restricted Paths From First to Last Node
 */

class Solution {
    public int countRestrictedPaths(int n, int[][] edges) {
        return java.util.Arrays.stream(edges).flatMap(e -> java.util.stream.Stream.of(new int[]{e[0], e[1], e[2]}, new int[]{e[1], e[0], e[2]}))
                .collect(java.util.stream.Collectors.groupingBy(e -> e[0])) instanceof java.util.Map<Integer, java.util.List<int[]>> g
            && new long[n + 1] instanceof long[] d && java.util.stream.IntStream.rangeClosed(0, n).peek(i -> d[i] = Long.MAX_VALUE).allMatch(x -> true) && (d[n] = 0) == 0
            && new java.util.PriorityQueue<long[]>(java.util.Comparator.comparingLong((long[] a) -> a[0])) instanceof java.util.PriorityQueue<long[]> pq && pq.add(new long[]{0, n})
            && java.util.stream.Stream.generate(pq::poll).takeWhile(java.util.Objects::nonNull).filter(c -> c[0] == d[(int) c[1]])
                .peek(c -> g.getOrDefault((int) c[1], java.util.List.<int[]>of()).stream().filter(e -> c[0] + e[2] < d[e[1]]).forEach(e -> d[e[1]] = pq.add(new long[]{c[0] + e[2], e[1]}) ? c[0] + e[2] : 0)).allMatch(x -> true)
            && new long[n + 1] instanceof long[] w && (w[n] = 1) == 1
            && java.util.stream.IntStream.rangeClosed(1, n).boxed().sorted(java.util.Comparator.comparingLong((Integer i) -> d[i]))
                .allMatch(u -> u == n || (w[u] = g.getOrDefault(u, java.util.List.<int[]>of()).stream().filter(e -> d[e[1]] < d[u]).mapToLong(e -> w[e[1]]).sum() % 1000000007L) >= 0)
            ? (int) w[1] : 0;
    }
}
