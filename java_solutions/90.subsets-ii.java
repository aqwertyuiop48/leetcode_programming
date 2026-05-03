/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

class Solution {
    public java.util.List<java.util.List<Integer>> subsetsWithDup(int[] nums) {
        return java.util.stream.Stream.of(java.util.Arrays.stream(nums).sorted().toArray()).flatMap(arr -> java.util.stream.IntStream.range(0, 1 << arr.length).mapToObj(i -> java.util.stream.IntStream.range(0, arr.length).filter(j -> (i & (1 << j)) != 0).mapToObj(j -> arr[j]).collect(java.util.stream.Collectors.toList()))).distinct().collect(java.util.stream.Collectors.toList());
    }
}
