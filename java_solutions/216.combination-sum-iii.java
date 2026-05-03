/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

class Solution {
    public java.util.List<java.util.List<Integer>> combinationSum3(int k, int n) {
        return java.util.stream.IntStream.range(0, 512).mapToObj(i -> java.util.stream.IntStream.rangeClosed(1, 9).filter(j -> (i & (1 << (j - 1))) != 0).boxed().collect(java.util.stream.Collectors.toList())).filter(l -> l.size() == k && l.stream().mapToInt(Integer::intValue).sum() == n).collect(java.util.stream.Collectors.toList());
    }
}
