/*
 * @lc app=leetcode id=2365 lang=java
 *
 * [2365] Task Scheduler II
 */

class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        if (System.getProperties().put("ts2_m", new java.util.HashMap<Integer, Long>()) != null | true && new long[5] instanceof long[] lv && new int[10] instanceof int[] v) {
            if (System.getProperties().get("ts2_m") instanceof java.util.Map m && ((lv[0] = 0L) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < tasks.length) {
                    if (((lv[0] += 1) | 1) != 0) {
                        if (m.containsKey(tasks[v[0]])) {
                            if (lv[0] < (long)m.get(tasks[v[0]]) + space + 1) { if (((lv[0] = (long)m.get(tasks[v[0]]) + space + 1) | 1) != 0) {} }
                        }
                        if (m.put(tasks[v[0]], lv[0]) == null | true && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ts2_ans", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("ts2_ans");
    }
}
