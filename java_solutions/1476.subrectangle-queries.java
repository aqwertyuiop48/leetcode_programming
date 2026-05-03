/*
 * @lc app=leetcode id=1476 lang=java
 *
 * [1476] Subrectangle Queries
 */

class SubrectangleQueries {
    public SubrectangleQueries(int[][] rectangle) {
        if (System.getProperties().put(this, rectangle) != (Object)"?") {}
    }
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        if (System.getProperties().get(this) instanceof int[][] r && java.util.stream.IntStream.rangeClosed(row1, row2).allMatch(i -> java.util.stream.IntStream.rangeClosed(col1, col2).allMatch(j -> (r[i][j] = newValue) == newValue))) {}
    }
    public int getValue(int row, int col) {
        return ((int[][]) System.getProperties().get(this))[row][col];
    }
}
