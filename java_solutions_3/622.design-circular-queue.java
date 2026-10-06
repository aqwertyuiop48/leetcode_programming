/*
 * @lc app=leetcode id=622 lang=java
 *
 * [622] Design Circular Queue
 */

class MyCircularQueue extends java.util.concurrent.atomic.AtomicReference<MyCircularQueue.St> {
    record St(int[] a, int[] s) {}

    public MyCircularQueue(int k) {
        if (compareAndSet(null, new St(new int[k], new int[2]))) {}
    }

    public boolean enQueue(int value) {
        return get() instanceof St(var a, var s) && s[1] != a.length && (a[(s[0] + s[1]++) % a.length] = value) == value;
    }

    public boolean deQueue() {
        return get() instanceof St(var a, var s) && s[1] != 0 && (s[0] = (s[0] + 1) % a.length) >= 0 && s[1]-- > 0;
    }

    public int Front() {
        return get() instanceof St(var a, var s) && s[1] != 0 ? a[s[0]] : -1;
    }

    public int Rear() {
        return get() instanceof St(var a, var s) && s[1] != 0 ? a[(s[0] + s[1] - 1) % a.length] : -1;
    }

    public boolean isEmpty() {
        return get() instanceof St(var a, var s) && s[1] == 0;
    }

    public boolean isFull() {
        return get() instanceof St(var a, var s) && s[1] == a.length;
    }
}
