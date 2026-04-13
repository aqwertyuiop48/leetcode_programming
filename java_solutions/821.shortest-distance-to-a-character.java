/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */

class Solution { public int[] shortestToChar(String s, char c) { return IntStream.range(0, s.length()) .map(i -> IntStream.range(0, s.length()) .boxed() .filter(k -> s.charAt(k) == c) .collect(Collectors.toList()).stream() .mapToInt(j -> Math.abs(j - i)) .min() .getAsInt() ) .toArray(); } }
