/*
 * @lc app=leetcode id=765 lang=kotlin
 *
 * [765] Couples Holding Hands
 */

class Solution {fun minSwapsCouples(row: IntArray) = IntArray(row.size).apply { row.indices.forEach { this[row[it]] = it } }.let { m -> generateSequence(0 to -1) { (c, last) -> row.indices.step(2).fold(c) { cnt, i -> if (abs(row[i] - row[i+1]) > 1) (if (row[i] % 2 == 0) m[row[i]+1] else m[row[i]-1]).let { j -> row[j].also { row[j] = row[i+1].also { row[i+1] = row[j] } }.also { m[row[i+1]] = i+1 }.also { m[row[j]] = j }.let { cnt + 1 } } else cnt }.let { it to c } }.dropWhile { (curr, prev) -> curr != prev }.first().first }}