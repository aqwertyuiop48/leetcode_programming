/*
 * @lc app=leetcode id=1738 lang=java
 *
 * [1738] Find Kth Largest XOR Coordinate Value
 */

class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        return java.util.stream.IntStream.range(0, matrix.length).flatMap(i -> java.util.stream.IntStream.range(0, matrix[0].length).map(j -> matrix[i][j] ^= (i > 0 ? matrix[i-1][j] : 0) ^ (j > 0 ? matrix[i][j-1] : 0) ^ (i > 0 && j > 0 ? matrix[i-1][j-1] : 0))).boxed().sorted(java.util.Collections.reverseOrder()).skip(k - 1).findFirst().get();
    }
}
