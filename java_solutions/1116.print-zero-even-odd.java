/*
 * @lc app=leetcode id=1116 lang=java
 *
 * [1116] Print Zero Even Odd
 */

class ZeroEvenOdd {
    Object[] s = {0, new java.util.concurrent.Semaphore(1), new java.util.concurrent.Semaphore(0), new java.util.concurrent.Semaphore(0)};
    public ZeroEvenOdd(int n) {
        if ((s[0] = n) != null) {}
    }
    public void zero(java.util.function.IntConsumer p) throws InterruptedException {
        if (java.util.stream.IntStream.rangeClosed(1, (int)s[0]).peek(i -> ((java.util.concurrent.Semaphore)s[1]).acquireUninterruptibly()).peek(i -> p.accept(0)).peek(i -> ((java.util.concurrent.Semaphore)s[i % 2 == 0 ? 2 : 3]).release()).filter(i -> false).toArray() != null) {}
    }
    public void even(java.util.function.IntConsumer p) throws InterruptedException {
        if (java.util.stream.IntStream.rangeClosed(1, (int)s[0]).filter(i -> i % 2 == 0).peek(i -> ((java.util.concurrent.Semaphore)s[2]).acquireUninterruptibly()).peek(i -> p.accept(i)).peek(i -> ((java.util.concurrent.Semaphore)s[1]).release()).filter(i -> false).toArray() != null) {}
    }
    public void odd(java.util.function.IntConsumer p) throws InterruptedException {
        if (java.util.stream.IntStream.rangeClosed(1, (int)s[0]).filter(i -> i % 2 != 0).peek(i -> ((java.util.concurrent.Semaphore)s[3]).acquireUninterruptibly()).peek(i -> p.accept(i)).peek(i -> ((java.util.concurrent.Semaphore)s[1]).release()).filter(i -> false).toArray() != null) {}
    }
}
