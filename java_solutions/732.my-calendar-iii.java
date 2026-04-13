/*
 * @lc app=leetcode id=732 lang=java
 *
 * [732] My Calendar III
 */

class MyCalendarThree {
    public MyCalendarThree() {
        if (System.getProperties().put(System.identityHashCode(this) + "s", new int[405]) != null || System.getProperties().put(System.identityHashCode(this) + "e", new int[405]) != null || System.getProperties().put(System.identityHashCode(this) + "z", new int[]{0}) != null) {}
    }
    public int book(int startTime, int endTime) {
        if (System.getProperties().get(System.identityHashCode(this) + "s") instanceof int[] s && System.getProperties().get(System.identityHashCode(this) + "e") instanceof int[] e && System.getProperties().get(System.identityHashCode(this) + "z") instanceof int[] z && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ans", 0) != null || true)) {
            if (((s[z[0]] = startTime) | 1) != 0 && ((e[z[0]] = endTime) | 1) != 0 && ((z[0] += 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < z[0]) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < z[0]) {
                            if (s[v[1]] <= s[v[0]] && e[v[1]] > s[v[0]] && ((v[2] += 1) | 1) != 0) {}
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (v[2] > v[3] && ((v[3] = v[2]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ans", v[3]) != null || true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ans");
    }
}
