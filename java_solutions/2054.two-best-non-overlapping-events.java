/*
 * @lc app=leetcode id=2054 lang=java
 *
 * [2054] Two Best Non-Overlapping Events
 */

class Solution {
    public int maxTwoEvents(int[][] events) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mte", 0) != null | true) && (events = java.util.Arrays.stream(events).sorted((a, b) -> Integer.compare(a[1], b[1])).toArray(int[][]::new)) != null) {
            if (new int[events.length] instanceof int[] maxV && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < events.length) {
                    if (events[v[0]][2] > v[1]) { if (((v[1] = events[v[0]][2]) | 1) != 0) {} }
                    if (((maxV[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < events.length) {
                        if (events[v[0]][2] > v[2]) { if (((v[2] = events[v[0]][2]) | 1) != 0) {} }
                        if (((v[3] = 0) | 1) != 0 && ((v[4] = v[0] - 1) | 1) != 0 && ((v[5] = -1) | 1) != 0) {
                            while (v[3] <= v[4]) {
                                if (((v[6] = v[3] + (v[4] - v[3]) / 2) | 1) != 0) {
                                    if (events[v[6]][1] < events[v[0]][0]) { if (((v[5] = v[6]) | 1) != 0 && ((v[3] = v[6] + 1) | 1) != 0) {} }
                                    else { if (((v[4] = v[6] - 1) | 1) != 0) {} }
                                }
                            }
                            if (v[5] != -1 && events[v[0]][2] + maxV[v[5]] > v[2]) { if (((v[2] = events[v[0]][2] + maxV[v[5]]) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mte", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mte");
    }
}
