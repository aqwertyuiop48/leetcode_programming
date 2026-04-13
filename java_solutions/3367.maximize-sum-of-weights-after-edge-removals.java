/*
 * @lc app=leetcode id=3367 lang=java
 *
 * [3367] Maximize Sum of Weights after Edge Removals
 */

class Solution { public long maximizeSumOfWeights(int[][] edges, int k) { return ((Function<Map<Integer, List<int[]>>, Long>) g -> ((Function<BiFunction<BiFunction, int[], long[]>, long[]>) dfs -> dfs.apply(dfs, new int[]{0, -1})).apply((f, state) -> ((Function<long[][], long[]>) childRes -> ((Function<long[], long[]>) diffsDesc -> new long[]{ Arrays.stream(childRes).mapToLong(r -> r[0]).sum() + Arrays.stream(diffsDesc).limit(k).sum(), Arrays.stream(childRes).mapToLong(r -> r[0]).sum() + Arrays.stream(diffsDesc).limit(Math.max(0, k - 1)).sum() }).apply(Arrays.stream(childRes).mapToLong(r -> r[1]).filter(d -> d > 0).map(d -> -d).sorted().map(d -> -d).toArray())).apply(g.containsKey(state[0]) ? g.get(state[0]).stream().filter(e -> e[0] != state[1]).map(e -> ((Function<long[], long[]>) nxt -> new long[]{nxt[0], nxt[1] + e[1] - nxt[0]}).apply((long[]) f.apply(f, new int[]{e[0], state[0]}))).toArray(long[][]::new) : new long[0][0]))[0]).apply(Arrays.stream(edges).flatMap(e -> Stream.of(new int[][]{{e[0], e[1], e[2]}, {e[1], e[0], e[2]}})).collect(Collectors.groupingBy(e -> e[0], Collectors.mapping(e -> new int[]{e[1], e[2]}, Collectors.toList())))); } }
