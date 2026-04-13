/*
 * @lc app=leetcode id=2973 lang=java
 *
 * [2973] Find Number of Coins to Place in Tree Nodes
 */

class Solution { public long[] placedCoins(int[][] edges, int[] cost) { return ((Function<List<List<Integer>>, long[]>) adj -> ((Function<long[], Function<Object[], long[]>>) coins -> box -> ((BiFunction<Integer, Integer, List<Long>>) (box[0] = (BiFunction<Integer, Integer, List<Long>>) (u, p) -> ((Function<List<Long>, List<Long>>) vals -> (coins[u] = vals.size() < 3 ? 1L : Math.max(0L, Math.max(vals.get(vals.size() - 1) * vals.get(vals.size() - 2) * vals.get(vals.size() - 3), vals.get(0) * vals.get(1) * vals.get(vals.size() - 1)))) * 0L == 0L ? (vals.size() <= 5 ? vals : Arrays.asList(vals.get(0), vals.get(1), vals.get(vals.size() - 3), vals.get(vals.size() - 2), vals.get(vals.size() - 1))) : null).apply(Stream.concat(Stream.of((long)cost[u]), adj.get(u).stream().filter(v -> !v.equals(p)).flatMap(v -> ((BiFunction<Integer, Integer, List<Long>>)box[0]).apply(v, u).stream())).sorted().collect(Collectors.toList())))).apply(0, -1) == null ? coins : coins).apply(new long[cost.length]).apply(new Object[1])).apply(Arrays.stream(edges).reduce(IntStream.range(0, cost.length).mapToObj(i -> new ArrayList<Integer>()).collect(Collectors.toList()), (a, e) -> (a.get(e[0]).add(e[1]) ? 1 : 1) * (a.get(e[1]).add(e[0]) ? 1 : 1) == 1 ? a : a, (a, b) -> a)); } }
