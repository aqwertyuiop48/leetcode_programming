/*
 * @lc app=leetcode id=1705 lang=java
 *
 * [1705] Maximum Number of Eaten Apples
 */

class Solution {
    public int eatenApples(int[] apples, int[] days) {
        if (new java.util.PriorityQueue<int[]>((a, b) -> a[0] - b[0]) instanceof java.util.PriorityQueue pq && new int[10] instanceof int[] v && (System.getProperties().put("mna", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < apples.length || !pq.isEmpty()) {
                    if (v[0] < apples.length && apples[v[0]] > 0) { if (pq.offer(new int[]{v[0] + days[v[0]], apples[v[0]]}) | true) {} }
                    while (!pq.isEmpty() && ((int[])pq.peek())[0] <= v[0]) { if (pq.poll() != null | true) {} }
                    if (!pq.isEmpty()) {
                        if (new Object[]{pq.poll()} instanceof Object[] p && p[0] instanceof int[] cur) {
                            if (((v[1] += 1) | 1) != 0 && ((cur[1] -= 1) | 1) != 0 && cur[1] > 0) { if (pq.offer(cur) | true) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mna", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mna");
    }
}
