/*
 * @lc app=leetcode id=855 lang=java
 *
 * [855] Exam Room
 */

class ExamRoom extends java.util.concurrent.atomic.AtomicReference<ExamRoom.St> {
    record St(int n, java.util.TreeSet<Integer> s) {}

    public ExamRoom(int n) {
        if (compareAndSet(null, new St(n, new java.util.TreeSet<>()))) {}
    }

    public int seat() {
        return get() instanceof St(var n, var s)
            ? java.util.stream.Stream.concat(java.util.stream.Stream.of(new int[]{0, s.isEmpty() ? n : s.first()}), java.util.stream.Stream.concat(
                    s.isEmpty() ? java.util.stream.Stream.<int[]>empty() : java.util.stream.Stream.of(new int[]{n - 1, n - 1 - s.last()}),
                    s.stream().skip(1).map(b -> new int[]{(s.lower(b) + b) / 2, (b - s.lower(b)) / 2})))
                .max(java.util.Comparator.comparingInt((int[] c) -> c[1]).thenComparingInt(c -> -c[0])).map(c -> s.add(c[0]) ? c[0] : c[0]).get()
            : -1;
    }

    public void leave(int p) {
        if (get() instanceof St(var n, var s) && s.remove(p)) {}
    }
}
