/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// semicolons : 1
class Solution {
    public int[][] merge(int[][] intervals) {return Arrays.stream(intervals).sorted((a, b) -> Integer.compare(a[0], b[0])).collect(() -> new Object[]{new ArrayList<int[]>(), null}, (acc, interval) -> Optional.ofNullable((int[])acc[1]).ifPresentOrElse(prev -> Optional.of(interval[0] <= prev[1]).filter(overlap -> overlap).ifPresentOrElse(x -> Optional.of(Math.max(prev[1], interval[1])).ifPresent(max -> prev[1] = max), () -> Optional.of(((List<int[]>)acc[0]).add(prev)).ifPresent(x -> acc[1] = new int[]{interval[0], interval[1]})), () -> acc[1] = new int[]{interval[0], interval[1]}), (a, b) -> {}) instanceof Object[] result ? Optional.ofNullable((int[])result[1]).map(last -> Optional.of(((List<int[]>)result[0]).add(last)).map(x -> ((List<int[]>)result[0]).toArray(new int[((List<int[]>)result[0]).size()][])).orElse(new int[0][])).orElse(new int[0][]) : new int[0][];}
}
