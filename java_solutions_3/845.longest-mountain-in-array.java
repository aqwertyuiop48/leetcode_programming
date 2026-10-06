/*
 * @lc app=leetcode id=845 lang=java
 *
 * [845] Longest Mountain in Array
 */

class Solution {
    public int longestMountain(int[] arr) {
        return java.util.stream.IntStream.range(1, arr.length - 1).filter(i -> arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
            .map(i -> (int) java.util.stream.IntStream.iterate(i, j -> j > 0 && arr[j - 1] < arr[j], j -> j - 1).count()
                + (int) java.util.stream.IntStream.iterate(i, j -> j < arr.length - 1 && arr[j] > arr[j + 1], j -> j + 1).count() + 1).max().orElse(0);
    }
}
