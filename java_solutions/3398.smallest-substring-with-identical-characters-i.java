/*
 * @lc app=leetcode id=3398 lang=java
 *
 * [3398] Smallest Substring With Identical Characters I
 */

class Solution { public int minLength(String s, int k) { return IntStream.rangeClosed(1, s.length()).filter(mid -> mid == 1 ? Math.min(IntStream.range(0, s.length()).filter(i -> s.charAt(i) - '0' != i % 2).count(), IntStream.range(0, s.length()).filter(i -> s.charAt(i) - '0' == i % 2).count()) <= k : Arrays.stream(s.split("(?<=(.))(?!\\1)")).mapToInt(String::length).map(len -> len / (mid + 1)).sum() <= k).findFirst().orElse(1); } }
