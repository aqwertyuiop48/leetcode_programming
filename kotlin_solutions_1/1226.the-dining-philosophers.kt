/*
 * @lc app=leetcode id=1226 lang=kotlin
 *
 * [1226] The Dining Philosophers
 */
class DiningPhilosophers(val s: Array<java.util.concurrent.Semaphore> = Array(6) { java.util.concurrent.Semaphore(if (it == 0) 4 else 1) }) { fun wantsToEat(i: Int, pl: Runnable, pr: Runnable, a: Runnable, dl: Runnable, dr: Runnable) = java.util.concurrent.CompletableFuture.runAsync { s[0].acquireUninterruptibly() }.thenRun { s[i + 1].acquireUninterruptibly() }.thenRun { s[(i + 1) % 5 + 1].acquireUninterruptibly() }.thenRun(pl).thenRun(pr).thenRun(a).thenRun(dl).thenRun(dr).thenRun { s[i + 1].release() }.thenRun { s[(i + 1) % 5 + 1].release() }.thenRun { s[0].release() }.join().let { } }