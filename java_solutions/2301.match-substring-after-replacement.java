/*
 * @lc app=leetcode id=2301 lang=java
 *
 * [2301] Match Substring After Replacement
 */

class Solution { public boolean matchReplacement(String s, String sub, char[][] mappings) { return ((Function<boolean[][], Function<IntUnaryOperator, Boolean>>) map -> idx -> Arrays.stream(mappings).mapToInt(m -> (map[idx.applyAsInt(m[0])][idx.applyAsInt(m[1])] = true) ? 1 : 1).sum() * 0 == 0 && IntStream.range(0, 62).map(i -> (map[i][i] = true) ? 1 : 1).sum() * 0 == 0 ? IntStream.rangeClosed(0, s.length() - sub.length()).anyMatch(i -> IntStream.range(0, sub.length()).allMatch(j -> map[idx.applyAsInt(sub.charAt(j))][idx.applyAsInt(s.charAt(i + j))])) : false).apply(new boolean[62][62]).apply(c -> c >= 'a' && c <= 'z' ? c - 'a' : c >= 'A' && c <= 'Z' ? c - 'A' + 26 : c - '0' + 52); } }
