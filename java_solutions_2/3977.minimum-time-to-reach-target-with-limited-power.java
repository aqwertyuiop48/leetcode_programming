/*
 * @lc app=leetcode id=3977 lang=java
 *
 * [3977] Minimum Time to Reach Target With Limited Power
 */

class Solution {
public long[] minTimeMaxPower(int n, int[][] edges, int p, int[] cost, int s, int t) {
    return Stream.of(new long[]{-1, -1}).peek(best -> Stream.of(Arrays.stream(edges).collect(Collectors.groupingBy(e -> e[0]))).forEach(adj -> Stream.<long[][]>of(IntStream.range(0, n).mapToObj(i -> LongStream.rangeClosed(0, p).map(j -> i == s && j == p ? 0 : (long) 1e18).toArray()).toArray(long[][]::new)).forEach(dist -> Stream.of(new PriorityQueue<long[]>(Comparator.<long[]>comparingLong(a -> a[0]))).peek(pq -> pq.offer(new long[]{0, s, p})).forEach(pq -> Stream.generate(pq::poll).takeWhile(v -> v != null && (best[0] == -1 || v[0] <= best[0])).filter(v -> v[0] == dist[(int) v[1]][(int) v[2]]).peek(v -> Stream.of(v).filter(x -> (int) x[1] == t).peek(x -> best[0] = best[0] == -1 ? x[0] : best[0]).forEach(x -> best[1] = Math.max(best[1], x[2]))).flatMap(v -> (int) v[1] != t && v[2] >= cost[(int) v[1]] ? adj.getOrDefault((int) v[1], List.<int[]>of()).stream().map(e -> new long[]{v[0] + e[2], e[1], v[2] - cost[(int) v[1]]}) : Stream.<long[]>empty()).filter(c -> c[0] < dist[(int) c[1]][(int) c[2]]).peek(c -> dist[(int) c[1]][(int) c[2]] = c[0]).forEach(pq::offer))))).findFirst().get();
}
}
