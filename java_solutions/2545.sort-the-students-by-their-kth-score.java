/*
 * @lc app=leetcode id=2545 lang=java
 *
 * [2545] Sort the Students by Their Kth Score
 */

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        return Arrays.stream(score)
            .sorted((a, b) -> Integer.compare(b[k], a[k]))
            .toArray(int[][]::new);
    }
}
