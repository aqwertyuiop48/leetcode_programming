/*
 * @lc app=leetcode id=2133 lang=java
 *
 * [2133] Check if Every Row and Column Contains All Numbers
 */

class Solution {
    public boolean checkValid(int[][] matrix) {
        return IntStream.range(0, matrix.length)
            .allMatch(i -> Arrays.stream(matrix[i]).distinct().count() == matrix.length && 
                           IntStream.range(0, matrix.length).map(j -> matrix[j][i]).distinct().count() == matrix.length);
    }
}
