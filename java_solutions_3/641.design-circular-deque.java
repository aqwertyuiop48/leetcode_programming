/*
 * @lc app=leetcode id=641 lang=java
 *
 * [641] Design Circular Deque
 */

class MyCircularDeque extends java.util.concurrent.atomic.AtomicReference<MyCircularDeque.St> {
    record St(int[] a, int[] s) {}

    public MyCircularDeque(int k) {
        if (compareAndSet(null, new St(new int[k], new int[2]))) {}
    }

    public boolean insertFront(int value) {
        return get() instanceof St(var a, var s) && s[1] != a.length && (a[s[0] = (s[0] - 1 + a.length) % a.length] = value) == value && s[1]++ >= 0;
    }

    public boolean insertLast(int value) {
        return get() instanceof St(var a, var s) && s[1] != a.length && (a[(s[0] + s[1]) % a.length] = value) == value && s[1]++ >= 0;
    }

    public boolean deleteFront() {
        return get() instanceof St(var a, var s) && s[1] != 0 && (s[0] = (s[0] + 1) % a.length) >= 0 && s[1]-- > 0;
    }

    public boolean deleteLast() {
        return get() instanceof St(var a, var s) && s[1] != 0 && s[1]-- > 0;
    }

    public int getFront() {
        return get() instanceof St(var a, var s) && s[1] != 0 ? a[s[0]] : -1;
    }

    public int getRear() {
        return get() instanceof St(var a, var s) && s[1] != 0 ? a[(s[0] + s[1] - 1) % a.length] : -1;
    }

    public boolean isEmpty() {
        return get() instanceof St(var a, var s) && s[1] == 0;
    }

    public boolean isFull() {
        return get() instanceof St(var a, var s) && s[1] == a.length;
    }
}
