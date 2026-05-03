/*
 * @lc app=leetcode id=1921 lang=java
 *
 * [1921] Eliminate Maximum Number of Monsters
 */

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        return java.util.Optional.of(java.util.stream.IntStream.range(0, dist.length).mapToDouble(i -> (double) dist[i] / speed[i]).sorted().toArray()).map(arr -> java.util.stream.IntStream.range(0, arr.length).filter(i -> arr[i] <= i).findFirst().orElse(arr.length)).get();
    }
}
