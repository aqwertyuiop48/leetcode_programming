/*
 * @lc app=leetcode id=502 lang=java
 *
 * [502] IPO
 */

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{java.util.stream.IntStream.range(0, profits.length).mapToObj(i -> new int[]{profits[i], capital[i]}).sorted((x, y) -> Integer.compare(x[1], y[1])).toArray(int[][]::new), new java.util.PriorityQueue<Integer>((x, y) -> Integer.compare(y, x)), new int[]{w}, new int[]{0}}).peek(a -> java.util.stream.IntStream.range(0, k).forEach(i -> java.util.stream.Stream.of(0).peek(_x -> java.util.stream.Stream.iterate(0, _y -> ((int[]) a[3])[0] < ((int[][]) a[0]).length && ((int[][]) a[0])[((int[]) a[3])[0]][1] <= ((int[]) a[2])[0], _y -> _y).forEach(_y -> ((java.util.PriorityQueue<Integer>) a[1]).offer(((int[][]) a[0])[((int[]) a[3])[0]++][0]))).filter(_x -> !((java.util.PriorityQueue<Integer>) a[1]).isEmpty()).forEach(_x -> ((int[]) a[2])[0] += ((java.util.PriorityQueue<Integer>) a[1]).poll()))).map(a -> ((int[]) a[2])[0]).findFirst().get();
    }
}
