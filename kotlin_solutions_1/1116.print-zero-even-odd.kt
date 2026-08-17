/*
 * @lc app=leetcode id=1116 lang=kotlin
 *
 * [1116] Print Zero Even Odd
 */

class ZeroEvenOdd(private val n: Int, val sz: java.util.concurrent.Semaphore = java.util.concurrent.Semaphore(1), val se: java.util.concurrent.Semaphore = java.util.concurrent.Semaphore(0), val so: java.util.concurrent.Semaphore = java.util.concurrent.Semaphore(0)) { fun zero(printNumber: java.util.function.IntConsumer) = (1..n).forEach { i -> sz.acquire().run { printNumber.accept(0) }.also { (if (i % 2 != 0) so else se).release() } } fun even(printNumber: java.util.function.IntConsumer) = (2..n step 2).forEach { i -> se.acquire().run { printNumber.accept(i) }.also { sz.release() } } fun odd(printNumber: java.util.function.IntConsumer) = (1..n step 2).forEach { i -> so.acquire().run { printNumber.accept(i) }.also { sz.release() } } }