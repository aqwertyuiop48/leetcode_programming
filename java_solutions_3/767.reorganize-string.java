/*
 * @lc app=leetcode id=767 lang=java
 *
 * [767] Reorganize String
 */

class Solution {
    public String reorganizeString(String s) {
        return s.chars().boxed().collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting())) instanceof java.util.Map<Integer, Long> f
            && f.values().stream().max(Long::compare).get() <= (s.length() + 1) / 2 && new char[s.length()] instanceof char[] r
            && s.chars().boxed().sorted(java.util.Comparator.comparing((Integer c) -> -f.get(c)).thenComparing(c -> c)).toList() instanceof java.util.List<Integer> o
            && java.util.stream.IntStream.range(0, s.length()).peek(k -> r[k < (s.length() + 1) / 2 ? 2 * k : 2 * (k - (s.length() + 1) / 2) + 1] = (char) (int) o.get(k)).allMatch(x -> true)
            ? new String(r) : "";
    }
}
