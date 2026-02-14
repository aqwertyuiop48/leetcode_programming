/*
 * @lc app=leetcode id=600 lang=kotlin
 *
 * [600] Non-negative Integers without Consecutive Ones
 */

class Solution { companion object { val fib = intArrayOf(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578) } fun findIntegers(n: Int): Int = (30 downTo 0).fold(1 to false) { (count, done), bitPos -> when { done -> {count to true} ((n shr bitPos) and 1) != 0 -> {(count + fib[bitPos]).let { newCount -> if (((n shr bitPos) and 3) == 3) (newCount - 1) to true else newCount to false }} else -> count to false } }.first }