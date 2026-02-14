/*
 * @lc app=leetcode id=638 lang=kotlin
 *
 * [638] Shopping Offers
 */

class Solution { fun shoppingOffers(price: List<Int>, special: List<List<Int>>, needs: List<Int>): Int = mutableMapOf<List<Int>, Int>().let { memo -> DeepRecursiveFunction<List<Int>, Int> { n -> memo.getOrPut(n) { minOf( n.mapIndexed { i, cnt -> cnt * price[i] }.sum(), special.filter { s -> n.indices.all { i -> s[i] <= n[i] } }.minOfOrNull { s -> s.last() + callRecursive(n.mapIndexed { i, cnt -> cnt - s[i] }) } ?: Int.MAX_VALUE ) } }(needs) } }