/*
 * @lc app=leetcode id=729 lang=java
 *
 * [729] My Calendar I
 */

class MyCalendar extends java.util.concurrent.atomic.AtomicReference<java.util.TreeMap<Integer, Integer>> {
    public MyCalendar() {
        if (compareAndSet(null, new java.util.TreeMap<>())) {}
    }

    public boolean book(int startTime, int endTime) {
        return (get().floorEntry(startTime) == null || get().floorEntry(startTime).getValue() <= startTime)
            && (get().ceilingKey(startTime) == null || get().ceilingKey(startTime) >= endTime) && get().put(startTime, endTime) == null;
    }
}
