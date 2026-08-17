/* @lc app=leetcode id=2043 lang=kotlin */
class Bank(val b: LongArray) {
    fun transfer(a1: Int, a2: Int, m: Long) = if (a1 in 1..b.size && a2 in 1..b.size && b[a1 - 1] >= m) b.set(a1 - 1, b[a1 - 1] - m).let { b.set(a2 - 1, b[a2 - 1] + m) }.let { true } else false
    fun deposit(a: Int, m: Long) = if (a in 1..b.size) b.set(a - 1, b[a - 1] + m).let { true } else false
    fun withdraw(a: Int, m: Long) = if (a in 1..b.size && b[a - 1] >= m) b.set(a - 1, b[a - 1] - m).let { true } else false
}