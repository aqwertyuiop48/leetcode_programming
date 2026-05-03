/*
 * @lc app=leetcode id=2406 lang=java
 *
 * [2406] Divide Intervals Into Minimum Number of Groups
 */

class Solution {
    public int minGroups(int[][] intervals) {
        if (new int[intervals.length] instanceof int[] start && new int[intervals.length] instanceof int[] end && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mg", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < intervals.length) { if (((start[v[0]] = intervals[v[0]][0]) | 1) != 0 && ((end[v[0]] = intervals[v[0]][1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if ((System.getProperties().put("s1", java.util.Arrays.stream(start).sorted().toArray()) != null | true) && (System.getProperties().put("e1", java.util.Arrays.stream(end).sorted().toArray()) != null | true) && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                if (System.getProperties().get("s1") instanceof int[] sSorted && System.getProperties().get("e1") instanceof int[] eSorted) {
                    while (v[1] < intervals.length) {
                        if (sSorted[v[1]] <= eSorted[v[2]]) { if (((v[3] += 1) | 1) != 0) {} }
                        else { if (((v[2] += 1) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mg", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mg");
    }
}
