/*
 * @lc app=leetcode id=873 lang=java
 *
 * [873] Length of Longest Fibonacci Subsequence
 */

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        return java.util.stream.IntStream.range(0, arr.length).boxed().collect(java.util.stream.Collectors.toMap(i -> arr[i], i -> i)) instanceof java.util.Map<Integer, Integer> idx && new int[arr.length][arr.length] instanceof int[][] d
            ? java.util.stream.IntStream.of(java.util.stream.IntStream.range(0, arr.length).map(k -> java.util.stream.IntStream.range(0, k)
                    .map(j -> d[j][k] = idx.containsKey(arr[k] - arr[j]) && idx.get(arr[k] - arr[j]) < j ? d[idx.get(arr[k] - arr[j])][j] + 1 : 2).max().orElse(0)).max().orElse(0))
                .map(m -> m < 3 ? 0 : m).findFirst().getAsInt()
            : 0;
    }
}
