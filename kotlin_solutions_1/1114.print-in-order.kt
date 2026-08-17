/*
 * @lc app=leetcode id=1114 lang=kotlin
 *
 * [1114] Print in Order
 */

class Foo(val s1: java.util.concurrent.Semaphore = java.util.concurrent.Semaphore(0), val s2: java.util.concurrent.Semaphore = java.util.concurrent.Semaphore(0)) { fun first(r: Runnable) = r.run().also { s1.release() } fun second(r: Runnable) = s1.acquire().run { r.run() }.also { s2.release() } fun third(r: Runnable) = s2.acquire().run { r.run() } }