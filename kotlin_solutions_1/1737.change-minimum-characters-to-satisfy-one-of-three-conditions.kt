/*
 * @lc app=leetcode id=1737 lang=kotlin
 *
 * [1737] Change Minimum Characters to Satisfy One of Three Conditions
 */
class Solution { fun minCharacters(a: String, b: String): Int = IntArray(26).also { f -> a.forEach { f[it - 'a']++ } }.let { fa -> IntArray(26).also { f -> b.forEach { f[it - 'a']++ } }.let { fb -> (0..25).minOf { i -> minOf(if (i == 0) Int.MAX_VALUE else fa.drop(i).sum() + fb.take(i).sum(), if (i == 0) Int.MAX_VALUE else fb.drop(i).sum() + fa.take(i).sum(), a.length - fa[i] + b.length - fb[i]) } } } }