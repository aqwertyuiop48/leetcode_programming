/*
 * @lc app=leetcode id=3337 lang=java
 *
 * [3337] Total Characters in String After Transformations II
 */
fun lengthAfterTransformations(s: String, t: Int, nums: List<Int>): Int = fun(a: Array<LongArray>, b: Array<LongArray>): Array<LongArray> = Array(26) { i -> LongArray(26) { j -> (0..25).fold(0L) { acc, k -> (acc + a[i][k] * b[k][j]) % 1000000007 } } }.let { mul -> Array(26) { i -> LongArray(26) { j -> if ((j - i + 26) % 26 in 1..nums[i]) 1L else 0L } }.let { m -> (0..30).fold(m to Array(26) { i -> LongArray(26) { j -> if (i == j) 1L else 0L } }) { (curr, res), i -> (if ((t shr i) and 1 == 1) mul(res, curr) else res) to mul(curr, curr) }.first.let { fin -> LongArray(26).also { cnt -> s.forEach { cnt[it - 'a']++ } }.let { c -> (0..25).fold(0L) { acc, i -> (acc + c[i] * (0..25).sumOf { fin[i][it] }) % 1000000007 }.toInt() } } } }