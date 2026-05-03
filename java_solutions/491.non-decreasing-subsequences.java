/*
 * @lc app=leetcode id=491 lang=java
 *
 * [491] Non-decreasing Subsequences
 */

record Solution() {
    public java.util.List<java.util.List<Integer>> findSubsequences(int[] nums) {
        return new java.util.ArrayList<>(java.util.Arrays.stream(nums).boxed().reduce(new java.util.HashSet<java.util.List<Integer>>(), (set, n) -> java.util.stream.Stream.concat(set.stream(), set.stream().filter(l -> l.get(l.size() - 1) <= n).map(l -> java.util.stream.Stream.concat(l.stream(), java.util.stream.Stream.of(n)).collect(java.util.stream.Collectors.toList()))).collect(java.util.stream.Collectors.toCollection(() -> new java.util.HashSet<>(java.util.Arrays.asList(java.util.Collections.singletonList(n))))), (a, b) -> a).stream().filter(l -> l.size() > 1).collect(java.util.stream.Collectors.toList()));
    }
}
