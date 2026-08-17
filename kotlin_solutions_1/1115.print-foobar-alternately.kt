/*
 * @lc app=leetcode id=1115 lang=kotlin
 *
 * [1115] Print FooBar Alternately
 */

class FooBar(private val n: Int, val s1: java.util.concurrent.Semaphore = java.util.concurrent.Semaphore(1), val s2: java.util.concurrent.Semaphore = java.util.concurrent.Semaphore(0)) { fun foo(printFoo: Runnable) = repeat(n) { s1.acquire().run { printFoo.run() }.also { s2.release() } } fun bar(printBar: Runnable) = repeat(n) { s2.acquire().run { printBar.run() }.also { s1.release() } } }