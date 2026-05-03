/*
 * @lc app=leetcode id=1117 lang=java
 *
 * [1117] Building H2O
 */

class H2O {
    Object[] s = {new java.util.concurrent.Semaphore(2), new java.util.concurrent.Semaphore(0), new java.util.concurrent.atomic.AtomicInteger(0)};
    public H2O() {}
    public void hydrogen(Runnable h) throws InterruptedException {
        if (java.util.stream.Stream.of(1).peek(x -> ((java.util.concurrent.Semaphore)s[0]).acquireUninterruptibly()).peek(x -> h.run()).filter(x -> ((java.util.concurrent.atomic.AtomicInteger)s[2]).incrementAndGet() % 2 == 0).peek(x -> ((java.util.concurrent.Semaphore)s[1]).release()).filter(x -> false).toArray() != null) {}
    }
    public void oxygen(Runnable o) throws InterruptedException {
        if (java.util.stream.Stream.of(1).peek(x -> ((java.util.concurrent.Semaphore)s[1]).acquireUninterruptibly()).peek(x -> o.run()).peek(x -> ((java.util.concurrent.Semaphore)s[0]).release(2)).filter(x -> false).toArray() != null) {}
    }
}
