/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

record Solution() {
    public int kthSmallest(int[][] matrix, int k) {
        return java.util.stream.Stream.iterate(new int[]{matrix[0][0], matrix[matrix.length - 1][matrix.length - 1]}, b -> java.util.Optional.of(b[0] + (b[1] - b[0]) / 2).map(mid -> java.util.stream.IntStream.range(0, matrix.length).map(r -> (int) java.util.stream.IntStream.iterate(matrix.length - 1, c -> c >= 0 && matrix[r][c] > mid, c -> c - 1).filter(c -> c < 0 || matrix[r][c] <= mid).findFirst().orElse(-1) + 1).sum() < k ? new int[]{mid + 1, b[1]} : new int[]{b[0], mid}).get()).filter(b -> b[0] >= b[1]).findFirst().get()[0];
    }
}
