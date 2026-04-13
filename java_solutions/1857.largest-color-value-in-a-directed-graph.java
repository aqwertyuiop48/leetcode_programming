/*
 * @lc app=leetcode id=1857 lang=java
 *
 * [1857] Largest Color Value in a Directed Graph
 */

class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        return (((Function<int[][], Integer>) (mem -> 
            (mem[0] = new int[colors.length()]) != null && (mem[1] = new int[edges.length]) != null && (mem[2] = new int[edges.length]) != null && (mem[3] = new int[colors.length()]) != null &&
            IntStream.range(0, colors.length()).reduce(0, (acc, i) -> (mem[0][i] = -1) * 0 + (mem[4 + i] = new int[26]).hashCode() * 0) * 0 == 0 &&
            IntStream.range(0, edges.length).reduce(0, (acc, i) -> (mem[1][i] = edges[i][1]) * 0 + (mem[2][i] = mem[0][edges[i][0]]) * 0 + (mem[0][edges[i][0]] = i) * 0) * 0 == 0 ?
            (((Function<IntUnaryOperator[], Integer>) (dfs -> 
                (dfs[0] = (u -> 
                    mem[3][u] == 1 ? -1 :
                    mem[3][u] == 2 ? mem[4 + u][colors.charAt(u) - 'a'] :
                    (mem[3][u] = 1) * 0 == 0 &&
                    IntStream.iterate(mem[0][u], e -> e != -1, e -> mem[2][e]).anyMatch(e -> dfs[0].applyAsInt(mem[1][e]) == -1 || IntStream.range(0, 26).reduce(0, (a, c) -> (mem[4 + u][c] = Math.max(mem[4 + u][c], mem[4 + mem[1][e]][c])) * 0) != 0) ? -1 :
                    (mem[4 + u][colors.charAt(u) - 'a']++) * 0 + (mem[3][u] = 2) * 0 + mem[4 + u][colors.charAt(u) - 'a']
                )).hashCode() * 0 == 0 &&
                IntStream.range(0, colors.length()).map(i -> dfs[0].applyAsInt(i)).anyMatch(v -> v == -1) ? -1 : IntStream.range(0, colors.length()).map(i -> IntStream.range(0, 26).map(c -> mem[4 + i][c]).max().orElse(0)).max().orElse(0)
            ))).apply(new IntUnaryOperator[1]) : 0
        ))).apply(new int[4 + colors.length()][]);
    }
}
