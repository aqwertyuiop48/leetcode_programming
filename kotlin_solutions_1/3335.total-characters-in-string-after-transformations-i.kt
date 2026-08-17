/*
 * @lc app=leetcode id=3335 lang=java
 *
 * [3335] Total Characters in String After Transformations I
 */
fun lengthAfterTransformations(s: String, t: Int): Int = LongArray(26).also { cnt -> s.forEach { cnt[it - 'a']++ } }.let { cnt -> (1..t).fold(cnt) { c, _ -> LongArray(26).also { n -> (0..24).forEach { i -> n[i + 1] = c[i] % 1000000007L } }.also { n -> n[0] = c[25] % 1000000007L }.also { n -> n[1] = (n[1] + c[25]) % 1000000007L } }.fold(0L) { a, b -> (a + b) % 1000000007L }.toInt() }