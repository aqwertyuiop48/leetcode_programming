/*
 * @lc app=leetcode id=3008 lang=java
 *
 * [3008] Find Beautiful Indices in the Given Array II
 */

class Solution { public List<Integer> beautifulIndices(String s, String a, String b, int k) { return ((Function<BiFunction<String, String, int[]>, List<Integer>>) getOccur -> ((Function<int[], Function<int[], List<Integer>>>) v1 -> v2 -> Arrays.stream(v1).filter(i -> ((Function<Integer, Boolean>) idx -> (idx >= 0) || (~idx < v2.length && v2[~idx] <= i + k) || (~idx > 0 && i - v2[~idx - 1] <= k)).apply(Arrays.binarySearch(v2, i))).boxed().collect(Collectors.toList())).apply(getOccur.apply(s, a)).apply(getOccur.apply(s, b))).apply((txt, pat) -> ((Function<String, int[]>) con -> ((Function<int[], int[]>) z -> ((Function<int[], int[]>) p -> IntStream.range(1, con.length()).map(i -> (i <= p[1] ? (z[i] = Math.min(p[1] - i + 1, z[i - p[0]])) : 0) * 0 + (z[i] = IntStream.iterate(z[i], j -> i + j < con.length() && con.charAt(j) == con.charAt(i + j), j -> j + 1).max().orElse(z[i] - 1) + 1) * 0 + (i + z[i] - 1 > p[1] ? (p[0] = i) * 0 + (p[1] = i + z[i] - 1) : 0)).sum() * 0 == 0 ? IntStream.range(pat.length() + 1, con.length()).filter(i -> z[i] >= pat.length()).map(i -> i - pat.length() - 1).toArray() : null).apply(new int[2])).apply(new int[con.length()])).apply(pat + "#" + txt)); } }
