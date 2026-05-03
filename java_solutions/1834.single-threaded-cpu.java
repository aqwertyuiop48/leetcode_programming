/*
 * @lc app=leetcode id=1834 lang=java
 *
 * [1834] Single-Threaded CPU
 */

class Solution {
    public int[] getOrder(int[][] tasks) {
        return java.util.Optional.of(java.util.stream.IntStream.range(0, tasks.length).mapToObj(i -> new int[]{tasks[i][0], tasks[i][1], i}).sorted(java.util.Comparator.comparingInt(a -> a[0])).toArray(int[][]::new)).map(sorted -> java.util.stream.Stream.iterate(new Object[]{0, 0, new java.util.PriorityQueue<int[]>((a, b) -> a[1] == b[1] ? a[2] - b[2] : a[1] - b[1]), new java.util.ArrayList<Integer>()}, s -> ((java.util.ArrayList<Integer>)s[3]).size() < tasks.length, s -> java.util.Optional.of((int)s[0] < sorted.length && ((java.util.PriorityQueue<int[]>)s[2]).isEmpty() ? Math.max((int)s[1], sorted[(int)s[0]][0]) : (int)s[1]).map(time -> java.util.stream.Stream.iterate((int)s[0], j -> j < sorted.length && sorted[j][0] <= time, j -> j + 1).reduce((int)s[0], (dummy, j) -> ((java.util.PriorityQueue<int[]>)s[2]).offer(sorted[j]) ? j + 1 : j + 1)).map(nextI -> java.util.Optional.of(((java.util.PriorityQueue<int[]>)s[2]).poll()).map(cur -> new Object[]{nextI, time + cur[1], s[2], java.util.stream.Stream.concat(((java.util.ArrayList<Integer>)s[3]).stream(), java.util.stream.Stream.of(cur[2])).collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new))}).get()).get()).reduce((a, b) -> b).get()).map(s -> ((java.util.ArrayList<Integer>)s[3]).stream().mapToInt(x -> x).toArray()).get();
    }
}
