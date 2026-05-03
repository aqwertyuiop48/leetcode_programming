/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

class Solution {
    public java.util.List<java.util.List<Integer>> combinationSum2(int[] candidates, int target) {
        return java.util.stream.Stream.of(java.util.Arrays.stream(candidates).sorted().toArray()).flatMap(arr -> java.util.stream.Stream.iterate(java.util.Collections.singletonList(java.util.Collections.<Integer>emptyList()), res -> !res.isEmpty(), res -> res.stream().flatMap(l -> java.util.stream.IntStream.range(l.isEmpty() ? 0 : l.get(l.size() - 1) + 1, arr.length).filter(i -> i == (l.isEmpty() ? 0 : l.get(l.size() - 1) + 1) || arr[i] != arr[i - 1]).filter(i -> l.stream().mapToInt(idx -> arr[idx]).sum() + arr[i] <= target).mapToObj(i -> java.util.stream.Stream.concat(l.stream(), java.util.stream.Stream.of(i)).collect(java.util.stream.Collectors.toList()))).collect(java.util.stream.Collectors.toList())).flatMap(java.util.Collection::stream).filter(l -> l.stream().mapToInt(idx -> arr[idx]).sum() == target).map(l -> l.stream().map(idx -> arr[idx]).collect(java.util.stream.Collectors.toList())).distinct()).collect(java.util.stream.Collectors.toList());
    }
}
