/*
 * @lc app=leetcode id=2001 lang=java
 *
 * [2001] Number of Pairs of Interchangeable Rectangles
 */

class Solution { public long interchangeableRectangles(int[][] rectangles) { return java.util.Arrays.stream(rectangles).mapToLong(r -> { int g = gcd(r[0], r[1]); return ((long)r[0]/g) << 32 | (r[1]/g); }).boxed().collect(java.util.stream.Collectors.groupingBy(k -> k, java.util.stream.Collectors.counting())).values().stream().mapToLong(c -> c * (c - 1) / 2).sum(); } private int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); } }
