/*
 * @lc app=leetcode id=3007 lang=kotlin
 *
 * [3007] Maximum Number That Sum of the Prices Is Less Than or Equal to K
 */

class Solution { fun findMaximumNumber(k: Long, x: Int): Long = arrayOfNulls<Any>(1).also { box -> box[0] = { l: Long, r: Long -> if (l > r) r else ((l + r) / 2).let { mid -> ((mid + 1).let { n -> (x..60 step x).sumOf { i -> (1L shl i).let { limit -> (1L shl (i - 1)).let { half -> n / limit * half + maxOf(0L, n % limit - half) } } } }).let { count -> if (count <= k) (box[0] as (Long, Long) -> Long)(mid + 1, r) else (box[0] as (Long, Long) -> Long)(l, mid - 1) } } } }.let { (it[0] as (Long, Long) -> Long)(1L, 1000000000000000L) } }