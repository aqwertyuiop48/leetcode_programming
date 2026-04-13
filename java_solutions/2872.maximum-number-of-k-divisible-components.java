/*
 * @lc app=leetcode id=2872 lang=java
 *
 * [2872] Maximum Number of K-Divisible Components
 */

class Solution { public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) { return ((Function<List<List<Integer>>, Function<int[], Function<Object[], Integer>>>) adj -> ans -> box -> ((BiFunction<Integer, Integer, Long>) (box[0] = (BiFunction<Integer, Integer, Long>) (u, p) -> ((Function<Long, Long>) sum -> (sum % k == 0 ? ans[0]++ * 0 : 0) + sum % k).apply(values[u] + adj.get(u).stream().filter(v -> !v.equals(p)).mapToLong(v -> ((BiFunction<Integer, Integer, Long>)box[0]).apply(v, u)).sum()))).apply(0, -1) * 0L == 0L ? ans[0] : 0).apply(Arrays.stream(edges).reduce(IntStream.range(0, n).mapToObj(i -> (List<Integer>) new ArrayList<Integer>()).collect(Collectors.toList()), (a, e) -> (a.get(e[0]).add(e[1]) ? 1 : 1) * (a.get(e[1]).add(e[0]) ? 1 : 1) == 1 ? a : a, (a, b) -> a)).apply(new int[1]).apply(new Object[1]); } }
