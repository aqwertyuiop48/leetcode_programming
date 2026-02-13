/*
 * @lc app=leetcode id=284 lang=kotlin
 *
 * [284] Peeking Iterator
 */

class PeekingIterator(i: Iterator<Int>, private val d: List<Int> = i.asSequence().toList(), private val mv: ListIterator<Int> = d.listIterator()) : Iterator<Int> by mv { fun peek() = d[mv.nextIndex()] }
