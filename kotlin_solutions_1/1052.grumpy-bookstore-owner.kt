/*
 * @lc app=leetcode id=1052 lang=kotlin
 *
 * [1052] Grumpy Bookstore Owner
 */

class Solution { fun maxSatisfied(customers: IntArray, grumpy: IntArray, minutes: Int): Int = customers.indices.sumOf { i -> if (grumpy[i] == 0) customers[i] else 0 } + (0 until minutes).sumOf { i -> if (grumpy[i] == 1) customers[i] else 0 }.let { initial -> (minutes until customers.size).fold(initial to initial) { (cur, maxExtra), i -> (cur + (if (grumpy[i] == 1) customers[i] else 0) - (if (grumpy[i - minutes] == 1) customers[i - minutes] else 0)).let { next -> next to maxOf(maxExtra, next) } }.second } }