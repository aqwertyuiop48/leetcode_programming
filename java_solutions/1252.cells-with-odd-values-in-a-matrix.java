/*
 * @lc app=leetcode id=1252 lang=java
 *
 * [1252] Cells with Odd Values in a Matrix
 */

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        return (int) IntStream.range(0, n).flatMap(i -> IntStream.range(0, m).filter(j -> (IntStream.range(0, n).mapToLong(k -> Arrays.stream(indices).filter(rc -> rc[0] == k).count()).toArray()[i] + IntStream.range(0, m).mapToLong(l -> Arrays.stream(indices).filter(rc -> rc[1] == l).count()).toArray()[j]) % 2 != 0)).count();
    }
}
