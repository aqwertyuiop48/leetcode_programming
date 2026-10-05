/*
 * @lc app=leetcode id=3928 lang=java
 *
 * [3928] Minimum Cost to Buy Apples II
 */

class Solution {
    public int[] minCost(int n, int[] prices, int[][] roads) {
        return Optional.of(IntStream.range(0, roads.length).boxed()
                .flatMap(e -> Stream.of(new int[]{roads[e][0], e}, new int[]{roads[e][1], e}))
                .collect(Collectors.groupingBy(z -> z[0], Collectors.mapping(z -> z[1], Collectors.toList()))))
            .map(g -> Optional.of(IntStream.range(0, n)
                    .mapToObj(u -> g.getOrDefault(u, List.<Integer>of()).stream().mapToInt(Integer::intValue).toArray())
                    .toArray(int[][]::new))
                .map(adj -> Optional.of(new long[2 * n])
                    .map(dist -> Optional.of(new PriorityQueue<long[]>(Comparator.comparingLong((long[] z) -> z[0])))
                        .map(pq -> IntStream.range(0, n)
                            .peek(i -> Arrays.fill(dist, Long.MAX_VALUE / 4))
                            .peek(i -> dist[2 * i] = 0)
                            .peek(i -> pq.clear())
                            .peek(i -> pq.add(new long[]{0, i, 0}))
                            .peek(i -> Stream.generate(pq::poll).takeWhile(Objects::nonNull)
                                .filter(cur -> cur[0] == dist[2 * (int) cur[1] + (int) cur[2]])
                                .forEach(cur -> IntStream.concat(cur[2] == 0 ? IntStream.of(-1) : IntStream.empty(), Arrays.stream(adj[(int) cur[1]]))
                                    .mapToObj(e -> e < 0
                                        ? new long[]{cur[0] + prices[(int) cur[1]], cur[1], 1}
                                        : new long[]{cur[0] + (cur[2] == 0 ? roads[e][2] : (long) roads[e][2] * roads[e][3]),
                                                     roads[e][0] ^ roads[e][1] ^ (int) cur[1], cur[2]})
                                    .filter(c -> c[0] < prices[i] && c[0] < dist[2 * (int) c[1] + (int) c[2]])
                                    .peek(c -> dist[2 * (int) c[1] + (int) c[2]] = c[0])
                                    .forEach(pq::add)))
                            .map(i -> (int) Math.min(prices[i], dist[2 * i + 1]))
                            .toArray())
                        .get())
                    .get())
                .get())
            .get();
    }
}
