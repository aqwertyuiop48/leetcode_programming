/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Arrays.stream(matrix).flatMap(i->Arrays.stream(i).boxed()).collect(Collectors.toList()).contains(target);
    }
}
