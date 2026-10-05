/*
 * @lc app=leetcode id=3975 lang=java
 *
 * [3975] Filter Occupied Intervals
 */

class Solution {
public List<List<Integer>> filterOccupiedIntervals(int[][] arr, int freeStart, int freeEnd) {
    return Arrays.stream(arr).sorted(Comparator.comparingInt((int[] a) -> a[0])).collect(ArrayList<int[]>::new, (l, b) -> Optional.of(l).filter(x -> x.isEmpty() || x.get(x.size() - 1)[1] + 1 < b[0]).ifPresentOrElse(x -> x.add(new int[]{b[0], b[1]}), () -> l.get(l.size() - 1)[1] = Math.max(l.get(l.size() - 1)[1], b[1])), ArrayList::addAll).stream().flatMap(b -> b[1] < freeStart || b[0] > freeEnd ? Stream.of(List.of(b[0], b[1])) : Stream.concat(b[0] < freeStart ? Stream.of(List.of(b[0], freeStart - 1)) : Stream.<List<Integer>>empty(), b[1] > freeEnd ? Stream.of(List.of(freeEnd + 1, b[1])) : Stream.<List<Integer>>empty())).toList();
}
}
