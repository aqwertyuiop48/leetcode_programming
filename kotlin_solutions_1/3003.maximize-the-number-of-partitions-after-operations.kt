/*
 * @lc app=leetcode id=3003 lang=kotlin
 *
 * [3003] Maximize the Number of Partitions After Operations
 */

class Solution { fun maxPartitionsAfterOperations(s: String, k: Int): Int = HashMap<Long, Int>().let { memo -> arrayOfNulls<Any>(1).also { box -> box[0] = { st: LongArray -> memo.getOrPut((st[0] shl 27) or (st[1] shl 1) or st[2]) { if (st[0].toInt() == s.length) 0 else maxOf((st[1] or (1L shl (s[st[0].toInt()] - 'a'))).let { nm -> if (java.lang.Long.bitCount(nm) > k) 1 + (box[0] as (LongArray) -> Int)(longArrayOf(st[0] + 1, 1L shl (s[st[0].toInt()] - 'a'), st[2])) else (box[0] as (LongArray) -> Int)(longArrayOf(st[0] + 1, nm, st[2])) }, if (st[2] == 1L) (0..25).maxOf { j -> (st[1] or (1L shl j)).let { cm -> if (java.lang.Long.bitCount(cm) > k) 1 + (box[0] as (LongArray) -> Int)(longArrayOf(st[0] + 1, 1L shl j, 0L)) else (box[0] as (LongArray) -> Int)(longArrayOf(st[0] + 1, cm, 0L)) } } else 0) } } }.let { box -> (box[0] as (LongArray) -> Int)(longArrayOf(0L, 0L, 1L)) + 1 } } }