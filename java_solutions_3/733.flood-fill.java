/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return image[sr][sc] == color ? image : new java.util.ArrayDeque<int[]>(java.util.List.of(new int[]{sr, sc})) instanceof java.util.ArrayDeque<int[]> q
            && java.util.stream.IntStream.of(image[sr][sc]).allMatch(o -> (image[sr][sc] = color) == color
                && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                    .peek(p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]})
                        .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < image.length && x[1] < image[0].length && image[x[0]][x[1]] == o)
                        .forEach(x -> image[x[0]][x[1]] = q.add(x) ? color : color)).allMatch(x -> true))
            ? image : image;
    }
}
