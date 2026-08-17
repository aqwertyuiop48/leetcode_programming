/*
 * @lc app=leetcode id=1298 lang=kotlin
 *
 * [1298] Maximum Candies You Can Get from Boxes
 */

class Solution {
    fun maxCandies(status: IntArray, candies: IntArray, keys: Array<IntArray>, containedBoxes: Array<IntArray>, initialBoxes: IntArray): Int =
        BooleanArray(status.size).let { hasBox ->
            BooleanArray(status.size).let { opened ->
                java.util.ArrayDeque<Int>().apply {
                    initialBoxes.forEach {
                        hasBox[it] = true
                        if (status[it] == 1) add(it)
                    }
                }.let { q ->
                    generateSequence { q.poll() }
                        .fold(0) { total, b ->
                            if (opened[b]) total
                            else {
                                opened[b] = true
                                keys[b].forEach { k ->
                                    status[k] = 1
                                    if (hasBox[k] && !opened[k]) q.add(k)
                                }
                                containedBoxes[b].forEach { cb ->
                                    hasBox[cb] = true
                                    if (status[cb] == 1 && !opened[cb]) q.add(cb)
                                }
                                total + candies[b]
                            }
                        }
                }
            }
        }
}