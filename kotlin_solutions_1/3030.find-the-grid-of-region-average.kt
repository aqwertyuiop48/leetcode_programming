/*
 * @lc app=leetcode id=3030 lang=kotlin
 *
 * [3030] Find the Grid of Region Average
 */

class Solution { fun resultGrid(image: Array<IntArray>, threshold: Int): Array<IntArray> = Array(image.size) { IntArray(image[0].size) }.also { sum -> Array(image.size) { IntArray(image[0].size) }.let { count -> (0..image.size - 3).forEach { r -> (0..image[0].size - 3).forEach { c -> if ((0..2).all { dr -> (0..1).all { dc -> Math.abs(image[r + dr][c + dc] - image[r + dr][c + dc + 1]) <= threshold } } && (0..1).all { dr -> (0..2).all { dc -> Math.abs(image[r + dr][c + dc] - image[r + dr + 1][c + dc]) <= threshold } }) ((0..2).sumOf { dr -> (0..2).sumOf { dc -> image[r + dr][c + dc] } } / 9).let { avg -> (0..2).forEach { dr -> (0..2).forEach { dc -> run { sum[r + dr][c + dc] += avg }.run { count[r + dr][c + dc] += 1 } } } } } } run { (0 until image.size).forEach { r -> (0 until image[0].size).forEach { c -> sum[r][c] = if (count[r][c] > 0) sum[r][c] / count[r][c] else image[r][c] } } } } } }