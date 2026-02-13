/*
 * @lc app=leetcode id=385 lang=kotlin
 *
 * [385] Mini Parser
 */

class Solution { fun deserialize(s: String): NestedInteger = s.takeIf { it[0] != '[' }?.toInt()?.let { NestedInteger().also { ni -> ni.setInteger(it) } } ?: generateSequence(Triple(NestedInteger(), 0, mutableListOf<NestedInteger>())) { (resNi, i, st) -> i.takeIf { it < s.length }?.let { idx -> s[idx].let { c -> Triple(resNi, idx, st).let { state -> if (c != ',') when { c == '-' || c.isDigit() -> {(if (c == '-') -1 to (idx + 1) else 1 to idx).let { (sign, start) -> generateSequence(0 to start) { (num, j) -> s[j].takeIf { it.isDigit() }?.let { num * 10 + it.digitToInt() to (j + 1) } }.last().let { (num, j) -> Triple(resNi, j - 1, st.apply { last().add(NestedInteger().also { it.setInteger(num * sign) }) }) } }} c == '[' -> {Triple(resNi, idx, st.apply { add(NestedInteger()) })} else -> st.removeLast().let { removed -> Triple(if (st.isEmpty()) removed else resNi.also { st.last().add(removed) }, idx, st) } } else state }.let { (r, newIdx, newSt) -> Triple(r, newIdx + 1, newSt) } } } }.last().first }
