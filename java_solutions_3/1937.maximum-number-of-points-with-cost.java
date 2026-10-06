/*
 * @lc app=leetcode id=1937 lang=java
 *
 * [1937] Maximum Number of Points with Cost
 */

class Solution {
    public long maxPoints(int[][] points) {
        return java.util.Arrays.stream(points).skip(1).reduce(java.util.Arrays.stream(points[0]).asLongStream().toArray(),
                (prev, row) -> new long[points[0].length] instanceof long[] l && new long[points[0].length] instanceof long[] r
                    && java.util.stream.IntStream.range(0, row.length).peek(j -> l[j] = j == 0 ? prev[0] : Math.max(l[j - 1] - 1, prev[j])).allMatch(x -> true)
                    && java.util.stream.IntStream.iterate(row.length - 1, j -> j >= 0, j -> j - 1).peek(j -> r[j] = j == row.length - 1 ? prev[j] : Math.max(r[j + 1] - 1, prev[j])).allMatch(x -> true)
                    ? java.util.stream.IntStream.range(0, row.length).mapToLong(j -> row[j] + Math.max(l[j], r[j])).toArray() : null,
                (a, b) -> a) instanceof long[] fin
            ? java.util.Arrays.stream(fin).max().getAsLong() : 0;
    }
}
