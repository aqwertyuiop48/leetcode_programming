/*
 * @lc app=leetcode id=1238 lang=java
 *
 * [1238] Circular Permutation in Binary Representation
 */

class Solution {
    public java.util.List<Integer> circularPermutation(int n, int start) {
        return java.util.stream.IntStream.range(0, 1 << n).mapToObj(i -> start ^ i ^ (i >> 1)).collect(java.util.stream.Collectors.toList());
    }
}
