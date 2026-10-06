/*
 * @lc app=leetcode id=3928 lang=java
 *
 * [3928] Minimum Cost to Buy Apples II
 */

class Solution {
    public int[] minCost(int n, int[] prices, int[][] roads) {
        return java.util.Arrays.stream(roads).flatMap(r -> java.util.stream.Stream.of(new long[]{r[0], r[1], r[2], r[3]}, new long[]{r[1], r[0], r[2], r[3]}))
                .collect(java.util.stream.Collectors.groupingBy(e -> (int) e[0])) instanceof java.util.Map<Integer, java.util.List<long[]>> g
            && ((java.util.function.BiFunction<Integer, Integer, long[]>) (s, t) -> new long[n] instanceof long[] d
                    && java.util.stream.IntStream.range(0, n).peek(i -> d[i] = 1L << 60).allMatch(x -> true) && (d[s] = 0) == 0
                    && new java.util.PriorityQueue<long[]>(java.util.Comparator.comparingLong((long[] a) -> a[0])) instanceof java.util.PriorityQueue<long[]> pq && pq.add(new long[]{0, s})
                    && java.util.stream.Stream.generate(pq::poll).takeWhile(java.util.Objects::nonNull).filter(c -> c[0] == d[(int) c[1]])
                        .peek(c -> g.getOrDefault((int) c[1], java.util.List.<long[]>of()).stream().map(e -> new long[]{c[0] + (t == 0 ? e[2] : e[2] * e[3]), e[1]})
                            .filter(x -> x[0] < d[(int) x[1]]).forEach(x -> d[(int) x[1]] = pq.add(x) ? x[0] : x[0])).allMatch(x -> true)
                    ? d : null) instanceof java.util.function.BiFunction<Integer, Integer, long[]> f
            ? java.util.stream.IntStream.range(0, n).map(i -> f.apply(i, 0) instanceof long[] a && f.apply(i, 1) instanceof long[] b
                ? (int) Math.min(prices[i], java.util.stream.IntStream.range(0, n).mapToLong(j -> a[j] + b[j] + prices[j]).min().getAsLong()) : 0).toArray()
            : null;
    }
}
