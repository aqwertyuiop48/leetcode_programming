/*
 * @lc app=leetcode id=1105 lang=kotlin
 *
 * [1105] Filling Bookcase Shelves
 */

class Solution { fun minHeightShelves(books: Array<IntArray>, shelfWidth: Int): Int = IntArray(books.size + 1).apply { (1..books.size).forEach { i -> this[i] = (i downTo 1).asSequence().map { books[it - 1] }.runningFold(intArrayOf(0, 0)) { acc, book -> intArrayOf(acc[0] + book[0], maxOf(acc[1], book[1])) }.drop(1).takeWhile { it[0] <= shelfWidth }.mapIndexed { k, step -> this[i - k - 1] + step[1] }.minOrNull()!! } }[books.size] }