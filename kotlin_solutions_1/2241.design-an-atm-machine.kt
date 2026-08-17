/*
 * @lc app=leetcode id=2241 lang=kotlin
 *
 * [2241] Design an ATM Machine
 */

class ATM(val b: LongArray = LongArray(5), val d: LongArray = longArrayOf(20, 50, 100, 200, 500)) {
    fun deposit(v: IntArray) = (0..4).forEach { b[it] += v[it].toLong() }
    fun withdraw(a: Int): IntArray = IntArray(5).let { ans -> (4 downTo 0).fold(a.toLong()) { r, i -> minOf(b[i], r / d[i]).toInt().also { ans[i] = it }.let { r - ans[i].toLong() * d[i] } }.let { r -> if (r == 0L) ans.also { (0..4).forEach { b[it] -= ans[it].toLong() } } else intArrayOf(-1) } }
}