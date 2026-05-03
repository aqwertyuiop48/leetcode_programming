/*
 * @lc app=leetcode id=395 lang=java
 *
 * [395] Longest Substring with At Least K Repeating Characters
 */

record Solution() {
    public int longestSubstring(String s, int k) {
        return s.length() == 0 ? 0 : java.util.Optional.of(s.chars().boxed().collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting()))).map(freq -> java.util.stream.IntStream.range(0, s.length()).filter(i -> freq.get((int) s.charAt(i)) < k).findFirst().map(i -> Math.max(longestSubstring(s.substring(0, i), k), longestSubstring(s.substring(i + 1), k))).orElse(s.length())).get();
    }
}
