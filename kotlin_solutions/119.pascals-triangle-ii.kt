/*
 * @lc app=leetcode id=119 lang=kotlin
 *
 * [119] Pascal's Triangle II
 */

class Solution {fun getRow(rowIndex: Int): List<Int> = mutableListOf(1).apply { (1..rowIndex).forEach { i -> add((get(i - 1).toLong() * (rowIndex - i + 1) / i).toInt()) } }}