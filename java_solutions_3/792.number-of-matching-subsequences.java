/*
 * @lc app=leetcode id=792 lang=java
 *
 * [792] Number of Matching Subsequences
 */

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        return java.util.stream.IntStream.range(0, s.length()).boxed().collect(java.util.stream.Collectors.groupingBy(i -> s.charAt(i))) instanceof java.util.Map<Character, java.util.List<Integer>> m
            ? (int) java.util.Arrays.stream(words).filter(w -> new int[]{-1} instanceof int[] p && w.chars().allMatch(c -> m.getOrDefault((char) c, java.util.List.of()) instanceof java.util.List<Integer> l
                && java.util.stream.IntStream.of(java.util.Collections.binarySearch(l, p[0])).map(r -> r >= 0 ? r + 1 : -r - 1).allMatch(k -> k < l.size() && (p[0] = l.get(k)) >= 0))).count()
            : 0;
    }
}
