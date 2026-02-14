/*
 * @lc app=leetcode id=591 lang=kotlin
 *
 * [591] Tag Validator
 */

class Solution { fun isValid(code: String): Boolean = Regex("^[A-Z]{1,9}$").let { tagRegex -> DeepRecursiveFunction<Triple<String, Int, List<String>>, Boolean> { (c, idx, stack) -> when { idx >= c.length -> {stack.isEmpty()} c.substring(idx).startsWith("</") -> {c.indexOf('>', idx).takeIf { it > idx }?.let { end -> c.substring(idx + 2, end).let { tag -> (stack.isNotEmpty() && stack.last() == tag).let { validTag -> if (validTag) callRecursive(Triple(c, end + 1, stack.dropLast(1))).let { valid -> valid && (stack.size > 1 || end + 1 >= c.length) } else false } } } ?: false} c.substring(idx).startsWith("<![CDATA[") -> {c.indexOf("]]>", idx).takeIf { it >= 0 }?.let { end -> stack.isNotEmpty().let { hasTag -> if (hasTag) callRecursive(Triple(c, end + 3, stack)) else false } } ?: false} c[idx] == '<' -> {c.indexOf('>', idx).takeIf { it > idx }?.let { end -> c.substring(idx + 1, end).let { tag -> if (tag.matches(tagRegex)) callRecursive(Triple(c, end + 1, stack + tag)) else false } } ?: false} else -> stack.isNotEmpty().let { hasTag -> if (hasTag) callRecursive(Triple(c, idx + 1, stack)) else false } } }.invoke(Triple(code, 0, emptyList())) } }
