/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.LinkedList<int[]>(), mat}).peek(a -> java.util.stream.IntStream.range(0, mat.length).forEach(i -> java.util.stream.IntStream.range(0, mat[0].length).forEach(j -> java.util.stream.Stream.of(0).peek(_x -> mat[i][j] = mat[i][j] == 0 ? 0 : Integer.MAX_VALUE).filter(_x -> mat[i][j] == 0).forEach(_x -> ((java.util.Queue<int[]>) a[0]).offer(new int[]{i, j}))))).peek(a -> java.util.stream.Stream.generate(() -> ((java.util.Queue<int[]>) a[0]).poll()).takeWhile(p -> p != null).forEach(p -> java.util.Arrays.stream(new int[][]{{p[0]+1, p[1]}, {p[0]-1, p[1]}, {p[0], p[1]+1}, {p[0], p[1]-1}}).filter(d -> d[0] >= 0 && d[0] < mat.length && d[1] >= 0 && d[1] < mat[0].length && mat[d[0]][d[1]] > mat[p[0]][p[1]] + 1).peek(d -> mat[d[0]][d[1]] = mat[p[0]][p[1]] + 1).forEach(d -> ((java.util.Queue<int[]>) a[0]).offer(d)))).map(a -> mat).findFirst().get();
    }
}
