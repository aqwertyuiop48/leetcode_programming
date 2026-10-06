/*
 * @lc app=leetcode id=436 lang=java
 *
 * [436] Find Right Interval
 */

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        return new java.util.TreeMap<Integer, Integer>() instanceof java.util.TreeMap<Integer, Integer> t
            && java.util.stream.IntStream.range(0, intervals.length).peek(i -> t.put(intervals[i][0], i)).allMatch(i -> true)
            ? java.util.Arrays.stream(intervals).mapToInt(v -> java.util.Optional.ofNullable(t.ceilingEntry(v[1])).map(java.util.Map.Entry::getValue).orElse(-1)).toArray()
            : null;
    }
}
