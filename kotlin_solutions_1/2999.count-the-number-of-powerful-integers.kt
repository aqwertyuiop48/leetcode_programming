/*
 * @lc app=leetcode id=2999 lang=kotlin
 *
 * [2999] Count the Number of Powerful Integers
 */

class Solution { fun numberOfPowerfulInt(rangeStart: Long, rangeEnd: Long, limit: Int, s: String): Long = { cap: Long -> cap.toString().let { flow -> if (flow.length < s.length) 0L else LongArray(2) { if (it == 0) 1L else if (flow.substring(flow.length - s.length) >= s) 1L else 0L }.let { state -> (0 until flow.length - s.length).map { i -> flow.length - s.length - 1 - i }.forEach { i -> state[1] = (if (flow[i] - '0' <= limit) (flow[i] - '0') * state[0] + state[1] else (limit + 1L) * state[0]).also { state[0] *= (limit + 1L) } }.let { state[1] } } } }.let { countFunc -> countFunc(rangeEnd) - countFunc(rangeStart - 1) } }