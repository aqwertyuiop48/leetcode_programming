/*
 * @lc app=leetcode id=399 lang=java
 *
 * [399] Evaluate Division
 */

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        return new java.util.HashMap<String, Integer>() instanceof java.util.HashMap<String, Integer> id
            && equations.stream().flatMap(java.util.List::stream).map(v -> id.computeIfAbsent(v, x -> id.size())).anyMatch(x -> false) == false
            && new double[id.size()][id.size()] instanceof double[][] g
            && java.util.stream.IntStream.range(0, id.size()).peek(i -> g[i][i] = 1).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, equations.size())
                .mapToDouble(e -> (g[id.get(equations.get(e).get(0))][id.get(equations.get(e).get(1))] = values[e])
                    + (g[id.get(equations.get(e).get(1))][id.get(equations.get(e).get(0))] = 1 / values[e])).sum() > 0
            && java.util.stream.IntStream.range(0, id.size()).peek(k -> java.util.stream.IntStream.range(0, id.size())
                .forEach(i -> java.util.stream.IntStream.range(0, id.size())
                    .forEach(j -> g[i][j] = g[i][j] != 0 ? g[i][j] : g[i][k] * g[k][j]))).allMatch(x -> true)
            ? queries.stream().mapToDouble(q -> id.containsKey(q.get(0)) && id.containsKey(q.get(1)) && g[id.get(q.get(0))][id.get(q.get(1))] != 0
                ? g[id.get(q.get(0))][id.get(q.get(1))] : -1).toArray()
            : null;
    }
}
