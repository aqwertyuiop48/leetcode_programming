/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

class Solution {
    public java.util.List<java.util.List<Integer>> combinationSum(int[] candidates, int target) {
        return java.util.stream.Stream.iterate(java.util.Collections.singletonList(java.util.Collections.<Integer>emptyList()), res -> !res.isEmpty(), res -> res.stream().flatMap(l -> java.util.Arrays.stream(candidates).filter(c -> l.isEmpty() || c >= l.get(l.size() - 1)).filter(c -> l.stream().mapToInt(x -> x).sum() + c <= target).mapToObj(c -> java.util.stream.Stream.concat(l.stream(), java.util.stream.Stream.of(c)).collect(java.util.stream.Collectors.toList()))).collect(java.util.stream.Collectors.toList())).flatMap(java.util.Collection::stream).filter(l -> l.stream().mapToInt(x -> x).sum() == target).collect(java.util.stream.Collectors.toList());
    }
}
