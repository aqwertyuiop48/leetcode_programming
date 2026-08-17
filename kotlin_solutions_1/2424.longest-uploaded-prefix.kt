/* @lc app=leetcode id=2424 lang=kotlin */
class LUPrefix(n: Int) {
    val a = BooleanArray(n + 2)
    val m = IntArray(1) { 1 }
    fun upload(video: Int) = a.set(video, true).also { while (a[m[0]]) m[0]++ }
    fun longest() = m[0] - 1
}