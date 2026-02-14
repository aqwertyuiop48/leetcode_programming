/*
 * @lc app=leetcode id=780 lang=kotlin
 *
 * [780] Reaching Points
 */

class Solution { fun reachingPoints(sx: Int, sy: Int, txv: Int, tyv: Int): Boolean = DeepRecursiveFunction<Pair<Int, Int>, Boolean> { (tx, ty) -> (tx to ty).takeIf { it.first >= sx && it.second >= sy }?.let { when { tx > ty -> (sy != ty).let { notEqual -> notEqual.takeIf { it }?.let { callRecursive(tx % ty to ty) } ?: ((tx - sx) % ty == 0) } else -> (sx != tx).let { notEqual -> notEqual.takeIf { it }?.let { callRecursive(tx to ty % tx) } ?: ((ty - sy) % tx == 0) } } } ?: false }(txv to tyv) }
