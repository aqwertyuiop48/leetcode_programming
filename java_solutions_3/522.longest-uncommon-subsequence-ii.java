/*
 * @lc app=leetcode id=522 lang=java
 *
 * [522] Longest Uncommon Subsequence II
 */

class Solution {
    public int findLUSlength(String[] strs) {
        return ((java.util.function.BiPredicate<String, String>) (a, b) -> new int[]{0} instanceof int[] p && a.chars().allMatch(c -> (p[0] = b.indexOf(c, p[0]) + 1) > 0)) instanceof java.util.function.BiPredicate<String, String> sub
            ? java.util.stream.IntStream.range(0, strs.length).filter(i -> java.util.stream.IntStream.range(0, strs.length).noneMatch(j -> i != j && sub.test(strs[i], strs[j])))
                .map(i -> strs[i].length()).max().orElse(-1)
            : -1;
    }
}
