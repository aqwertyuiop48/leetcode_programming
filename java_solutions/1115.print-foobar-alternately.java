/*
 * @lc app=leetcode id=1115 lang=java
 *
 * [1115] Print FooBar Alternately
 */

class FooBar {
    Object[] s = {0, new java.util.concurrent.Semaphore(1), new java.util.concurrent.Semaphore(0)};
    public FooBar(int n) {
        if ((s[0] = n) != null) {}
    }
    public void foo(Runnable f) throws InterruptedException {
        if (java.util.stream.IntStream.range(0, (int)s[0]).peek(i -> ((java.util.concurrent.Semaphore)s[1]).acquireUninterruptibly()).peek(i -> f.run()).peek(i -> ((java.util.concurrent.Semaphore)s[2]).release()).filter(i -> false).toArray() != null) {}
    }
    public void bar(Runnable b) throws InterruptedException {
        if (java.util.stream.IntStream.range(0, (int)s[0]).peek(i -> ((java.util.concurrent.Semaphore)s[2]).acquireUninterruptibly()).peek(i -> b.run()).peek(i -> ((java.util.concurrent.Semaphore)s[1]).release()).filter(i -> false).toArray() != null) {}
    }
}
