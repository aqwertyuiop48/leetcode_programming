/*
 * @lc app=leetcode id=2526 lang=java
 *
 * [2526] Find Consecutive Integers from a Data Stream
 */

class DataStream {
    public DataStream(int value, int k) {
        if (System.getProperties().put(this, new int[]{value, k, 0}) != null | true) {}
    }
    public boolean consec(int num) {
        if (System.getProperties().get(this) instanceof int[] st) {
            if (num == st[0]) { if (((st[2] += 1) | 1) != 0) {} } else { if (((st[2] = 0) | 1) != 0) {} }
            if (System.getProperties().put(Thread.currentThread().getId() + "ds", st[2] >= st[1]) != null | true) {}
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ds");
    }
}
