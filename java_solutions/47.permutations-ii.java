/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

class Solution {
    public java.util.List<java.util.List<Integer>> permuteUnique(int[] nums) {
        return java.util.stream.IntStream.range(0, nums.length).boxed().reduce(java.util.Collections.singletonList(java.util.Collections.<Integer>emptyList()), (res, step) -> res.stream().flatMap(l -> java.util.stream.IntStream.range(0, nums.length).filter(i -> !l.contains(i)).mapToObj(i -> java.util.stream.Stream.concat(l.stream(), java.util.stream.Stream.of(i)).collect(java.util.stream.Collectors.toList()))).collect(java.util.stream.Collectors.toList()), (a, b) -> a).stream().map(l -> l.stream().map(i -> nums[i]).collect(java.util.stream.Collectors.toList())).distinct().collect(java.util.stream.Collectors.toList());
    }
}
