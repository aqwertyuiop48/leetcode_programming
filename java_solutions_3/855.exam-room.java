/*
 * @lc app=leetcode id=855 lang=java
 *
 * [855] Exam Room
 */

class ExamRoom extends java.util.concurrent.atomic.AtomicReference<ExamRoom.St> {
    record St(int n, java.util.TreeSet<Integer> s, java.util.PriorityQueue<int[]> pq, java.util.function.BiPredicate<Integer, Integer> push) {}

    public ExamRoom(int n) {
        if (new java.util.PriorityQueue<int[]>(java.util.Comparator.comparingInt((int[] g) -> -g[3]).thenComparingInt(g -> g[2])) instanceof java.util.PriorityQueue<int[]> pq
            && pq.add(new int[]{-1, n, 0, Integer.MAX_VALUE})
            && compareAndSet(null, new St(n, new java.util.TreeSet<>(), pq, (l, r) -> (l < 0 && r >= n || l < 0 && r > 0 || r >= n && l < n - 1 || l >= 0 && r < n && r - l >= 2)
                && pq.add(l < 0 ? new int[]{l, r, 0, r} : r >= n ? new int[]{l, r, n - 1, n - 1 - l} : new int[]{l, r, (l + r) / 2, (r - l) / 2}) || true))) {}
    }

    public int seat() {
        return get() instanceof St(var n, var s, var pq, var push)
            ? java.util.stream.Stream.generate(pq::poll)
                .filter(g -> (g[0] < 0 || s.contains(g[0])) && (g[0] < 0 ? (s.isEmpty() ? n : s.first()) : s.higher(g[0]) == null ? n : s.higher(g[0])) == g[1])
                .findFirst().map(g -> s.add(g[2]) && push.test(g[0], g[2]) && push.test(g[2], g[1]) ? g[2] : g[2]).get()
            : -1;
    }

    public void leave(int p) {
        if (get() instanceof St(var n, var s, var pq, var push) && s.remove(p) && push.test(s.lower(p) == null ? -1 : s.lower(p), s.higher(p) == null ? n : s.higher(p))) {}
    }
}
