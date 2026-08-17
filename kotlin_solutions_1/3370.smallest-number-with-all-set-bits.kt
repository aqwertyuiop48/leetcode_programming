/*
 * @lc app=leetcode id=3370 lang=java
 *
 * [3370] Smallest Number With All Set Bits
 */

fun smallestNumber(n: Int): Int = (1 shl (32 - Integer.numberOfLeadingZeros(n))) - 1