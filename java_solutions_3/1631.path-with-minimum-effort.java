/*
 * @lc app=leetcode id=1631 lang=java
 *
 * [1631] Path With Minimum Effort
 */

class Solution {
    public int minimumEffortPath(int[][] heights) {
        return new int[heights.length][heights[0].length] instanceof int[][] dist
            && java.util.Arrays.stream(dist).peek(r -> java.util.Arrays.fill(r, Integer.MAX_VALUE)).allMatch(x -> true) && (dist[0][0] = 0) == 0
            && new java.util.PriorityQueue<int[]>(java.util.Comparator.comparingInt((int[] a) -> a[0])) instanceof java.util.PriorityQueue<int[]> pq && pq.add(new int[]{0, 0, 0})
            && java.util.stream.Stream.generate(pq::poll).takeWhile(java.util.Objects::nonNull).filter(c -> c[0] == dist[c[1]][c[2]])
                .peek(c -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{c[1] + d[0], c[2] + d[1]})
                    .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < heights.length && x[1] < heights[0].length)
                    .map(x -> new int[]{Math.max(c[0], Math.abs(heights[x[0]][x[1]] - heights[c[1]][c[2]])), x[0], x[1]})
                    .filter(x -> x[0] < dist[x[1]][x[2]]).forEach(x -> dist[x[1]][x[2]] = pq.add(x) ? x[0] : x[0])).allMatch(x -> true)
            ? dist[heights.length - 1][heights[0].length - 1] : 0;
    }
}
