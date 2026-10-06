/*
 * @lc app=leetcode id=417 lang=java
 *
 * [417] Pacific Atlantic Water Flow
 */

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        return ((java.util.function.Function<java.util.List<int[]>, boolean[][]>) st -> new boolean[heights.length][heights[0].length] instanceof boolean[][] v
                && new java.util.ArrayDeque<int[]>(st) instanceof java.util.ArrayDeque<int[]> q
                && st.stream().allMatch(p -> v[p[0]][p[1]] = true)
                && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                    .peek(p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]})
                        .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < heights.length && x[1] < heights[0].length && !v[x[0]][x[1]] && heights[x[0]][x[1]] >= heights[p[0]][p[1]])
                        .forEach(x -> v[x[0]][x[1]] = q.add(x)))
                    .allMatch(x -> true) ? v : null)
            instanceof java.util.function.Function<java.util.List<int[]>, boolean[][]> f
            && f.apply(java.util.stream.IntStream.range(0, heights.length * heights[0].length).filter(k -> k / heights[0].length == 0 || k % heights[0].length == 0)
                .mapToObj(k -> new int[]{k / heights[0].length, k % heights[0].length}).toList()) instanceof boolean[][] a
            && f.apply(java.util.stream.IntStream.range(0, heights.length * heights[0].length).filter(k -> k / heights[0].length == heights.length - 1 || k % heights[0].length == heights[0].length - 1)
                .mapToObj(k -> new int[]{k / heights[0].length, k % heights[0].length}).toList()) instanceof boolean[][] b
            ? java.util.stream.IntStream.range(0, heights.length * heights[0].length).filter(k -> a[k / heights[0].length][k % heights[0].length] && b[k / heights[0].length][k % heights[0].length])
                .mapToObj(k -> java.util.List.of(k / heights[0].length, k % heights[0].length)).toList()
            : null;
    }
}
