/*
 * @lc app=leetcode id=3970 lang=java
 *
 * [3970] Shortest Path With At Most K Consecutive Identical Characters
 */

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        return Optional.of(labels.toCharArray()).map(lc ->
            Optional.of(IntStream.range(0, n)
                    .mapToObj(u -> IntStream.rangeClosed(0, k).mapToLong(c -> u == 0 && c == 1 ? 0 : Long.MAX_VALUE / 4).toArray())
                    .toArray(long[][]::new)).map(dist ->
                Optional.of(IntStream.range(0, edges.length).boxed().collect(Collectors.groupingBy(e -> edges[e][0]))).map(g ->
                    Optional.of(IntStream.range(0, n)
                            .mapToObj(u -> g.getOrDefault(u, List.<Integer>of()).stream().mapToInt(Integer::intValue).toArray())
                            .toArray(int[][]::new)).map(adj ->
                        Optional.of(Stream.of(new long[]{0, 0, 1})
                                .collect(Collectors.toCollection(() -> new PriorityQueue<long[]>(Comparator.comparingLong((long[] z) -> z[0]))))).map(pq ->
                            Optional.of(Stream.generate(pq::poll).takeWhile(cur -> cur != null && cur[1] != n - 1)
                                    .filter(cur -> cur[0] == dist[(int) cur[1]][(int) cur[2]])
                                    .peek(cur -> Arrays.stream(adj[(int) cur[1]])
                                        .mapToObj(e -> new long[]{cur[0] + edges[e][2], edges[e][1],
                                            lc[edges[e][1]] == lc[(int) cur[1]] ? cur[2] + 1 : 1})
                                        .filter(c -> c[2] <= k && c[0] < dist[(int) c[1]][(int) c[2]])
                                        .peek(c -> dist[(int) c[1]][(int) c[2]] = c[0])
                                        .forEach(pq::add))
                                    .count())
                                .map(ign -> Arrays.stream(dist[n - 1], 1, k + 1).min().getAsLong())
                                .map(ans -> ans == Long.MAX_VALUE / 4 ? -1 : (int) (long) ans)
                                .get()).get()).get()).get()).get()).get();
    }
}
