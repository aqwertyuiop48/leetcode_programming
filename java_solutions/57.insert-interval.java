/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        return java.util.stream.Stream.concat(java.util.Arrays.stream(intervals), java.util.stream.Stream.of(newInterval)).sorted(java.util.Comparator.comparingInt(a -> a[0])).reduce(new java.util.LinkedList<int[]>(), (l, i) -> java.util.stream.Stream.of(l).map(list -> list.isEmpty() || list.getLast()[1] < i[0] ? (list.add(i) ? list : list) : ((list.getLast()[1] = Math.max(list.getLast()[1], i[1])) > -1 ? list : list)).findFirst().get(), (l1, l2) -> l1).toArray(int[][]::new);
    }
}
