/*
 * @lc app=leetcode id=1825 lang=kotlin
 *
 * [1825] Finding MK Average
 */

class MKAverage(val m: Int, val k: Int, val state: Pair<IntArray, Pair<LongArray, Pair<IntArray, IntArray>>> = Pair(IntArray(100005), Pair(LongArray(100005), Pair(IntArray(100005), IntArray(1))))) {
    fun addElement(num: Int): Unit = state.let { (fG, s2) -> s2.let { (fS, s3) -> s3.let { (buf, idx) -> buf[idx[0]].let { buf[idx[0]] = num }.run { idx[0]++ }.run { generateSequence(num) { it + (it and -it) }.takeWhile { it < 100005 }.forEach { i -> fG[i].let { fG[i] = it + 1 }.run { fS[i] += num.toLong() } } }.run { if (idx[0] > m) buf[idx[0] - m - 1].let { old -> generateSequence(old) { it + (it and -it) }.takeWhile { it < 100005 }.forEach { i -> fG[i].let { fG[i] = it - 1 }.run { fS[i] -= old.toLong() } } } } } } } fun calculateMKAverage(): Int = state.let { (fG, s2) -> s2.let { (fS, s3) -> s3.let { (buf, idx) -> if (idx[0] < m) -1 else ({ tK: Int -> ((16 downTo 0).fold(Pair(0, tK)) { (p, count), step -> (p + (1 shl step)).let { next -> if (next < 100005 && fG[next] < count) Pair(next, count - fG[next]) else Pair(p, count) } }.first + 1).let { valAtPos -> generateSequence(valAtPos) { it - (it and -it) }.takeWhile { it > 0 }.fold(0L to 0L) { (s, c), j -> (s + fS[j]) to (c + fG[j]) }.let { (sum, count) -> sum - (count - tK) * valAtPos } } }).let { query -> ((query(m - k) - query(k)) / (m - 2 * k)).toInt() } } } }
}