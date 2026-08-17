/*
 * @lc app=leetcode id=1472 lang=kotlin
 *
 * [1472] Design Browser History
 */

class BrowserHistory(homepage: String, val list: MutableList<String> = mutableListOf(homepage), var cur: Int = 0) { fun visit(url: String) = run { list.subList(cur + 1, list.size).clear() }.also { list.add(url) }.also { cur++ }.let { } fun back(steps: Int): String = maxOf(0, cur - steps).also { cur = it }.let { list[it] } fun forward(steps: Int): String = minOf(list.size - 1, cur + steps).also { cur = it }.let { list[it] } }