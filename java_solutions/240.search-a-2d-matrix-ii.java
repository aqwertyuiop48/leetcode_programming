/*
 * @lc app=leetcode id=240 lang=java
 *
 * [240] Search a 2D Matrix II
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return (Arrays.stream(matrix).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList())).contains(target);
    }
}
