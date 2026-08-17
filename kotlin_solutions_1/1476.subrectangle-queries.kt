/*
 * @lc app=leetcode id=1476 lang=kotlin
 *
 * [1476] Subrectangle Queries
 */

class SubrectangleQueries(val rectangle: Array<IntArray>) {
    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) = (row1..row2).forEach { r -> (col1..col2).forEach { c -> rectangle[r][c] = newValue } } fun getValue(row: Int, col: Int) = rectangle[row][col]
}