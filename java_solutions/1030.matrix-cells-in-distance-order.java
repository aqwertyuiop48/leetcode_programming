/*
 * @lc app=leetcode id=1030 lang=java
 *
 * [1030] Matrix Cells in Distance Order
 */

class Solution { public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) { return IntStream.range(0, rows) .boxed() .flatMap(i -> IntStream.range(0, cols) .mapToObj(j -> new int[]{i, j})) .sorted(Comparator.comparingInt(a -> Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter))) .toArray(int[][]::new); } }
