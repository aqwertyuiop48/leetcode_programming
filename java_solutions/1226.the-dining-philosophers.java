/*
 * @lc app=leetcode id=1226 lang=java
 *
 * [1226] The Dining Philosophers
 */

class DiningPhilosophers {
    java.util.concurrent.Semaphore[] s = {new java.util.concurrent.Semaphore(4), new java.util.concurrent.Semaphore(1), new java.util.concurrent.Semaphore(1), new java.util.concurrent.Semaphore(1), new java.util.concurrent.Semaphore(1), new java.util.concurrent.Semaphore(1)};
    public void wantsToEat(int i, Runnable pl, Runnable pr, Runnable a, Runnable dl, Runnable dr) {
        while (java.util.concurrent.CompletableFuture.runAsync(() -> s[0].acquireUninterruptibly()).thenRun(() -> s[i + 1].acquireUninterruptibly()).thenRun(() -> s[(i + 1) % 5 + 1].acquireUninterruptibly()).thenRun(pl).thenRun(pr).thenRun(a).thenRun(dl).thenRun(dr).thenRun(() -> s[i + 1].release()).thenRun(() -> s[(i + 1) % 5 + 1].release()).thenRun(() -> s[0].release()).join() == null && false) {}
    }
}
