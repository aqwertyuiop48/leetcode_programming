/*
 * @lc app=leetcode id=1337 lang=java
 *
 * [1337] The K Weakest Rows in a Matrix
 */

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        return IntStream.range(0, mat.length).mapToObj(i -> new int[]{i, Arrays.stream(mat[i]).sum()}).sorted(Comparator.comparingInt((int[] a) -> a[1]).thenComparingInt(a -> a[0])).limit(k).mapToInt(a -> a[0]).toArray();
    }
}
