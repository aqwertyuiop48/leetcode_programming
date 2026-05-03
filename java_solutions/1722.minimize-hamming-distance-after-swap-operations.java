/*
 * @lc app=leetcode id=1722 lang=java
 *
 * [1722] Minimize Hamming Distance After Swap Operations
 */

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        return java.util.Optional.of(new Object[]{java.util.stream.IntStream.range(0, source.length).toArray(), new int[source.length], new java.util.HashMap<Integer, java.util.Map<Integer, Integer>>()})
            .filter(s -> java.util.Arrays.stream(allowedSwaps).allMatch(e -> java.util.Optional.of(new int[]{java.util.stream.Stream.iterate(e[0], i -> ((int[])s[0])[i]).dropWhile(i -> ((int[])s[0])[i] != i.intValue()).findFirst().get(), java.util.stream.Stream.iterate(e[1], i -> ((int[])s[0])[i]).dropWhile(i -> ((int[])s[0])[i] != i.intValue()).findFirst().get()}).map(r -> r[0] != r[1] ? (((int[])s[1])[r[0]] < ((int[])s[1])[r[1]] ? (((int[])s[0])[r[0]] = r[1]) : ((((int[])s[0])[r[1]] = r[0]) + ((((int[])s[1])[r[0]] == ((int[])s[1])[r[1]] ? (((int[])s[1])[r[0]]++) : 0) * 0))) : 0).isPresent() || true))
            .filter(s -> java.util.stream.IntStream.range(0, source.length).allMatch(i -> (((int[])s[0])[i] = java.util.stream.Stream.iterate(i, j -> ((int[])s[0])[j]).dropWhile(j -> ((int[])s[0])[j] != j.intValue()).findFirst().get()) >= 0 || true))
            .filter(s -> java.util.stream.IntStream.range(0, source.length).allMatch(i -> ((java.util.Map<Integer, java.util.Map<Integer, Integer>>)s[2]).computeIfAbsent(((int[])s[0])[i], k -> new java.util.HashMap<>()).merge(source[i], 1, Integer::sum) != null || true))
            .map(s -> (int) java.util.stream.IntStream.range(0, target.length).filter(i -> ((java.util.Map<Integer, java.util.Map<Integer, Integer>>)s[2]).get(((int[])s[0])[i]) == null || ((java.util.Map<Integer, java.util.Map<Integer, Integer>>)s[2]).get(((int[])s[0])[i]).merge(target[i], -1, Integer::sum) < 0).count())
            .get();
    }
}
