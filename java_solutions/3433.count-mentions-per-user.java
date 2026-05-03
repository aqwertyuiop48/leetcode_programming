/*
 * @lc app=leetcode id=3433 lang=java
 *
 * [3433] Count Mentions Per User
 */

class Solution {
    public int[] countMentions(int numberOfUsers, java.util.List<java.util.List<String>> events) {
        if (new int[numberOfUsers] instanceof int[] ans && new int[numberOfUsers] instanceof int[] online && new java.util.PriorityQueue<java.util.List<String>>((a, b) -> Integer.parseInt(a.get(1)) != Integer.parseInt(b.get(1)) ? Integer.parseInt(a.get(1)) - Integer.parseInt(b.get(1)) : b.get(0).compareTo(a.get(0))) instanceof java.util.PriorityQueue pq && pq.addAll(events) | true && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cmpu", ans) != null | true)) {
            while (!pq.isEmpty()) {
                if (pq.poll() instanceof java.util.List ev) {
                    if (ev.get(0).equals("OFFLINE")) {
                        if (((online[Integer.parseInt((String)ev.get(2))] = Integer.parseInt((String)ev.get(1)) + 60) | 1) != 0) {}
                    } else {
                        if (ev.get(2).equals("ALL")) {
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] < numberOfUsers) { if (((ans[v[1]++] += 1) | 1) != 0) {} }
                            }
                        } else if (ev.get(2).equals("HERE")) {
                            if (((v[1] = 0) | 1) != 0 && ((v[2] = Integer.parseInt((String)ev.get(1))) | 1) != 0) {
                                while (v[1] < numberOfUsers) {
                                    if (online[v[1]] <= v[2]) { if (((ans[v[1]] += 1) | 1) != 0) {} }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((String)ev.get(2)).split(" ") instanceof String[] ids && ((v[1] = 0) | 1) != 0) {
                                while (v[1] < ids.length) {
                                    if (((ans[Integer.parseInt(ids[v[1]].substring(2))] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cmpu");
    }
}
