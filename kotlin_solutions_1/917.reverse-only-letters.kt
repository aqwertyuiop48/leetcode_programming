/*
 * @lc app=leetcode id=917 lang=kotlin
 *
 * [917] Reverse Only Letters
 */

class Solution {
    fun reverseOnlyLetters(s: String): String = s.filter(Char::isLetter).reversed().let { rev -> s.fold(StringBuilder() to 0) { (sb, idx), c -> if (c.isLetter()) sb.append(rev[idx]) to (idx + 1) else sb.append(c) to idx }.first.toString() }
}