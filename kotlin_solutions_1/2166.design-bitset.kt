/*
 * @lc app=leetcode id=2166 lang=kotlin
 *
 * [2166] Design Bitset
 */
class Bitset(val size: Int) { val a = IntArray(size) var f = 0 var c = 0 fun fix(idx: Int) = if (a[idx] xor f == 0) a.set(idx, a[idx] xor 1).also { c++ } else Unit fun unfix(idx: Int) = if (a[idx] xor f == 1) a.set(idx, a[idx] xor 1).also { c-- } else Unit fun flip() = run { f = f xor 1 }.also { c = size - c } fun all() = c == size fun one() = c > 0 fun count() = c override fun toString() = a.joinToString("") { (it xor f).toString() } }