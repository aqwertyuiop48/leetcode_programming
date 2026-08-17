/*
 * @lc app=leetcode id=3479 lang=kotlin
 *
 * [3479] Fruits Into Baskets III
 */

class Solution { fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int = (if (baskets.size == 1) 1 else Integer.highestOneBit(baskets.size - 1) shl 1).let { sz -> IntArray(2 * sz).apply { baskets.indices.forEach { i -> this[sz + i] = baskets[i] } }.apply { (sz - 1 downTo 1).forEach { i -> this[i] = maxOf(this[2 * i], this[2 * i + 1]) } }.let { tree -> fruits.fold(0) { unplaced, fruit -> if (tree[1] < fruit) unplaced + 1 else (1..20).fold(1) { idx, _ -> if (idx < sz) (if (tree[2 * idx] >= fruit) 2 * idx else 2 * idx + 1) else idx }.let { leafIdx -> tree.apply { this[leafIdx] = 0 }.let { (1..20).fold(leafIdx shr 1) { p, _ -> if (p > 0) tree.apply { this[p] = maxOf(this[2 * p], this[2 * p + 1]) }.let { p shr 1 } else 0 } } }.let { unplaced } } } } }