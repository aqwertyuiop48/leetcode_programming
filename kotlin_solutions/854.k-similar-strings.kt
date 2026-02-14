/*
 * @lc app=leetcode id=854 lang=kotlin
 *
 * [854] K-Similar Strings
 */

class Solution { private class Found(val steps: Int) : Exception() fun kSimilarity(s1: String, s2: String): Int = s1.encode().let { S -> s2.encode().let { T -> runCatching { generateSequence(Triple(ArrayDeque<Long>().apply { add(S) }, mutableSetOf(S), 0)) { (queue, visited, k) -> queue.takeIf { it.isNotEmpty() }?.let { _ -> (0 until queue.size).forEach { _ -> queue.removeFirst().let { s -> s.takeIf { it == T }?.run { throw Found(k) } ?: generateSequence(0) { i -> i + 1 }.first { i -> s.get(i) != T.get(i) }.let { i -> ((i + 1) until s1.length).filter { j -> s.get(j) == T.get(i) }.forEach { j -> s.swap(i, j).takeUnless { it in visited }?.also { t -> visited.add(t) .run{queue.addLast(t)} } } } } } .run{Triple(queue, visited, k + 1)} } }.first { it.first.isEmpty() }.third }.getOrElse { (it as Found).steps } }} fun String.encode(): Long = indices.fold(0L) { r, i -> r or ((this[i].code - 'a'.code).toLong() shl (i * 3)) } fun Long.swap(i: Int, j: Int): Long = get(i).let { a -> get(j).let { b -> set(i, b).set(j, a) } } fun mask(i: Int): Long = 7L shl (i * 3) fun Long.get(i: Int): Long = (this and mask(i)) shr (i * 3) fun Long.set(i: Int, v: Long): Long = (this and mask(i).inv()) or (v shl (i * 3)) }

