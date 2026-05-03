/*
 * @lc app=leetcode id=1239 lang=java
 *
 * [1239] Maximum Length of a Concatenated String with Unique Characters
 */

class Solution {
    public int maxLength(java.util.List<String> arr) {
        return arr.stream().map(s -> s.chars().map(c -> 1 << (c - 'a')).reduce(0, (a, b) -> (a & b) == 0 ? a | b : -1)).filter(m -> m != -1).reduce(new java.util.HashSet<>(java.util.Arrays.asList(0)), (set, m) -> java.util.stream.Stream.concat(set.stream(), set.stream().filter(s -> (s & m) == 0).map(s -> s | m)).collect(java.util.stream.Collectors.toCollection(java.util.HashSet::new)), (a, b) -> a).stream().mapToInt(Integer::bitCount).max().orElse(0);
    }
}
