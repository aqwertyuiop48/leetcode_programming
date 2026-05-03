/*
 * @lc app=leetcode id=1647 lang=java
 *
 * [1647] Minimum Deletions to Make Character Frequencies Unique
 */

class Solution {
    public int minDeletions(String s) {
        return new Object[]{s.chars().boxed().collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting())).values().stream().mapToInt(Long::intValue).sorted().toArray()} instanceof Object[] o && new java.util.HashSet<Integer>() instanceof java.util.Set set && new java.util.function.Function[1] instanceof java.util.function.Function[] f && (f[0] = x -> (int)x > 0 && !set.add((int)x) ? 1 + (int)f[0].apply((int)x - 1) : 0) != null ? java.util.stream.IntStream.range(0, ((int[])o[0]).length).map(i -> (int)f[0].apply(((int[])o[0])[i])).sum() : 0;
    }
}
