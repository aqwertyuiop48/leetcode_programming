/*
 * @lc app=leetcode id=1622 lang=kotlin
 *
 * [1622] Fancy Sequence
 */

class Fancy(val v: MutableList<Long> = mutableListOf(), var a: Long = 1L, var b: Long = 0L, val M: Long = 1000000007L) { fun pow(x: Long, y: Long): Long = run { if (y == 0L) 1L else (pow((x * x) % M, y / 2) * if (y % 2L == 1L) x else 1L) % M } fun append(val_param: Int) = run { v.add(((val_param - b % M + M) % M * pow(a, M - 2)) % M) } fun addAll(inc: Int) = run { b = (b + inc) % M } fun multAll(m: Int) = run { (a * m % M).let { a = it }.also { b = b * m % M } } fun getIndex(idx: Int): Int = run { if (idx >= v.size) -1 else ((a * v[idx] + b) % M).toInt() } }