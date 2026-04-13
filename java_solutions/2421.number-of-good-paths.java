/*
 * @lc app=leetcode id=2421 lang=java
 *
 * [2421] Number of Good Paths
 */

class Solution { public int numberOfGoodPaths(int[] vals, int[][] edges) { return ((Function<int[], Function<int[], Function<int[], Function<Object[], Integer>>>>) p -> c -> ans -> box -> ((Function<Integer, Integer>) (box[0] = (Function<Integer, Integer>) i -> p[i] == i ? i : (p[i] = ((Function<Integer, Integer>)box[0]).apply(p[i])))).apply(0) * 0 == 0 ? Arrays.stream(edges).sorted((a, b) -> Math.max(vals[a[0]], vals[a[1]]) - Math.max(vals[b[0]], vals[b[1]])).mapToInt(e -> ((Function<Integer, Function<Integer, Integer>>) u -> v -> u.equals(v) ? 0 : (vals[u] == vals[v] ? (ans[0] += c[u] * c[v]) * 0 + (c[u] += c[v]) * 0 + (p[v] = u) * 0 : vals[u] > vals[v] ? (p[v] = u) * 0 : (p[u] = v) * 0)).apply(((Function<Integer, Integer>)box[0]).apply(e[0])).apply(((Function<Integer, Integer>)box[0]).apply(e[1]))).sum() * 0 == 0 ? ans[0] : 0 : 0).apply(IntStream.range(0, vals.length).toArray()).apply(IntStream.range(0, vals.length).map(i -> 1).toArray()).apply(new int[]{vals.length}).apply(new Object[1]); } }
