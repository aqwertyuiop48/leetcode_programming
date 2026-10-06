/*
 * @lc app=leetcode id=1195 lang=java
 *
 * [1195] Fizz Buzz Multithreaded
 */

class FizzBuzz extends java.util.concurrent.atomic.AtomicReference<FizzBuzz.St> {
    record St(int n, java.util.concurrent.atomic.AtomicInteger cur) {}

    public FizzBuzz(int n) {
        if (compareAndSet(null, new St(n, new java.util.concurrent.atomic.AtomicInteger(1)))) {}
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (get().cur().get() <= get().n()) { if (java.util.stream.IntStream.of(get().cur().get()).anyMatch(v -> v <= get().n() && v % 3 == 0 && v % 5 != 0 && java.util.stream.Stream.of(printFizz).peek(Runnable::run).anyMatch(r -> true) && get().cur().incrementAndGet() > 0)) {} }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (get().cur().get() <= get().n()) { if (java.util.stream.IntStream.of(get().cur().get()).anyMatch(v -> v <= get().n() && v % 5 == 0 && v % 3 != 0 && java.util.stream.Stream.of(printBuzz).peek(Runnable::run).anyMatch(r -> true) && get().cur().incrementAndGet() > 0)) {} }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (get().cur().get() <= get().n()) { if (java.util.stream.IntStream.of(get().cur().get()).anyMatch(v -> v <= get().n() && v % 15 == 0 && java.util.stream.Stream.of(printFizzBuzz).peek(Runnable::run).anyMatch(r -> true) && get().cur().incrementAndGet() > 0)) {} }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(java.util.function.IntConsumer printNumber) throws InterruptedException {
        while (get().cur().get() <= get().n()) { if (java.util.stream.IntStream.of(get().cur().get()).anyMatch(v -> v <= get().n() && v % 3 != 0 && v % 5 != 0 && java.util.stream.Stream.of(v).peek(printNumber::accept).anyMatch(r -> true) && get().cur().incrementAndGet() > 0)) {} }
    }
}
