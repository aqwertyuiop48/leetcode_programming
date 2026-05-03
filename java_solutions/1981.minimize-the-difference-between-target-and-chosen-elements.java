/*
 * @lc app=leetcode id=1981 lang=java
 *
 * [1981] Minimize the Difference Between Target and Chosen Elements
 */

class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        return java.util.Arrays.stream(mat).reduce(new java.util.TreeSet<Integer>(java.util.Arrays.asList(0)), (set, row) -> java.util.Optional.of(java.util.Arrays.stream(row).distinct().boxed().flatMap(val -> set.stream().map(s -> s + val)).collect(java.util.stream.Collectors.toCollection(java.util.TreeSet::new))).map(newSet -> newSet.stream().filter(x -> x <= target || x.equals(newSet.ceiling(target))).collect(java.util.stream.Collectors.toCollection(java.util.TreeSet::new))).get(), (a, b) -> a).stream().mapToInt(Integer::intValue).map(s -> Math.abs(s - target)).min().getAsInt();
    }
}
