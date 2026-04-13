/*
 * @lc app=leetcode id=3303 lang=java
 *
 * [3303] Find the Occurrence of First Almost Equal Substring
 */

class Solution { public int minStartingIndex(String s, String pattern) { return ((Function<Function<String, int[]>, Integer>) zFunc -> ((Function<int[], Integer>) z1 -> ((Function<int[], Integer>) z2 -> IntStream.rangeClosed(0, s.length() - pattern.length()).filter(i -> z1[pattern.length() + i] + 1 + z2[s.length() - i] >= pattern.length()).findFirst().orElse(-1)).apply(zFunc.apply(new StringBuilder(s + pattern).reverse().toString()))).apply(zFunc.apply(pattern + s))).apply(str -> ((Function<int[], int[]>) z -> ((Function<int[], int[]>) lr -> (int[]) new Object[]{ IntStream.range(1, str.length()).map(i -> new Object[]{ i <= lr[1] ? z[i] = Math.min(lr[1] - i + 1, z[i - lr[0]]) : 0, z[i] += (int) IntStream.iterate(z[i], j -> i + j < str.length() && str.charAt(j) == str.charAt(i + j), j -> j + 1).count(), i + z[i] - 1 > lr[1] ? (lr[1] = (lr[0] = i) + z[i] - 1) : 0 }.length * 0).sum(), z }[1]).apply(new int[2])).apply(new int[str.length()])); } }
