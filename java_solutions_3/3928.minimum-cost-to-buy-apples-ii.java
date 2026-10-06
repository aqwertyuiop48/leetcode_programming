/*
 * @lc app=leetcode id=3928 lang=java
 *
 * [3928] Minimum Cost to Buy Apples II
 */

class Solution {
    public int[] minCost(int n, int[] prices, int[][] roads) {
        return new int[roads.length * 2 + n] instanceof int[] au && new int[au.length] instanceof int[] av && new int[au.length] instanceof int[] sw
            && new long[au.length] instanceof long[] w0 && new long[au.length] instanceof long[] w1
            && java.util.stream.IntStream.range(0, au.length).peek(i -> au[i] = i >= 2 * roads.length ? i - 2 * roads.length : roads[i / 2][i % 2]).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, au.length).peek(i -> av[i] = i >= 2 * roads.length ? i - 2 * roads.length : roads[i / 2][1 - i % 2]).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, au.length).peek(i -> sw[i] = i >= 2 * roads.length ? 1 : 0).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, au.length).peek(i -> w0[i] = i >= 2 * roads.length ? prices[i - 2 * roads.length] : roads[i / 2][2]).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, au.length).peek(i -> w1[i] = i >= 2 * roads.length ? Long.MAX_VALUE / 4 : (long) roads[i / 2][2] * roads[i / 2][3]).allMatch(x -> true)
            && new int[n][] instanceof int[][] arcs
            && java.util.stream.IntStream.range(0, n).peek(u -> arcs[u] = java.util.stream.IntStream.range(0, au.length).filter(i -> au[i] == u).toArray()).allMatch(x -> true)
            && new long[][]{w0, w1} instanceof long[][] W
            && java.util.Arrays.stream(prices).boxed().min(Integer::compare).get() instanceof Integer minP
            ? java.util.stream.IntStream.range(0, n).map(s -> java.util.stream.LongStream.generate(() -> 1L << 60).limit(2 * n).toArray() instanceof long[] dist
                && (dist[s] = 0) == 0 && new java.util.PriorityQueue<Long>() instanceof java.util.PriorityQueue<Long> pq && pq.add((long) s)
                && java.util.stream.Stream.generate(pq::poll).takeWhile(k -> k != null && (k >> 11) < prices[s] && (int) (k & 2047) != s + n)
                    .filter(k -> (k >> 11) == dist[(int) (k & 2047)])
                    .peek(k -> java.util.Arrays.stream(arcs[(int) (k & 2047) % n])
                        .mapToLong(e -> (k >> 11) + W[(int) (k & 2047) / n][e] < prices[s] && (int) (k & 2047) / n + sw[e] < 2
                            && (k >> 11) + W[(int) (k & 2047) / n][e] < dist[av[e] + n * ((int) (k & 2047) / n + sw[e])]
                            && ((int) (k & 2047) / n == 1 || (sw[e] == 1 ? 2 * (k >> 11) + W[0][e] < prices[s] : 2 * ((k >> 11) + W[0][e]) + minP < prices[s]))
                            ? (((dist[av[e] + n * ((int) (k & 2047) / n + sw[e])] = (k >> 11) + W[(int) (k & 2047) / n][e])) << 11) | (av[e] + n * ((int) (k & 2047) / n + sw[e])) : -1L)
                        .filter(x -> x >= 0).forEach(pq::add))
                    .count() >= 0
                ? (int) Math.min(prices[s], dist[s + n]) : 0).toArray()
            : null;
    }
}
