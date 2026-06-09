/*
 * @lc app=leetcode id=498 lang=java
 *
 * [498] Diagonal Traverse
 */

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        return mat.length == 0 ? new int[0] : java.util.stream.IntStream.range(0, mat.length + mat[0].length - 1).boxed().flatMapToInt(s -> java.util.stream.IntStream.rangeClosed(Math.max(0, s - mat[0].length + 1), Math.min(s, mat.length - 1)).map(r -> s % 2 == 0 ? Math.min(s, mat.length - 1) - (r - Math.max(0, s - mat[0].length + 1)) : r).map(r -> mat[r][s - r])).toArray();
    }
}
