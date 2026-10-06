/*
 * @lc app=leetcode id=731 lang=java
 *
 * [731] My Calendar II
 */

class MyCalendarTwo extends java.util.concurrent.atomic.AtomicReference<MyCalendarTwo.St> {
    record St(java.util.List<int[]> b, java.util.List<int[]> d) {}

    public MyCalendarTwo() {
        if (compareAndSet(null, new St(new java.util.ArrayList<>(), new java.util.ArrayList<>()))) {}
    }

    public boolean book(int startTime, int endTime) {
        return get() instanceof St(var b, var d) && d.stream().noneMatch(x -> startTime < x[1] && endTime > x[0])
            && b.stream().filter(x -> startTime < x[1] && endTime > x[0]).map(x -> new int[]{Math.max(startTime, x[0]), Math.min(endTime, x[1])}).toList().stream().allMatch(d::add)
            && b.add(new int[]{startTime, endTime});
    }
}
