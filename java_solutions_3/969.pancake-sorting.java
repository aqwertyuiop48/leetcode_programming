/*
 * @lc app=leetcode id=969 lang=java
 *
 * [969] Pancake Sorting
 */

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        return arr.clone() instanceof int[] a
            && ((java.util.function.IntPredicate) k -> java.util.Arrays.copyOf(a, k) instanceof int[] t && java.util.stream.IntStream.range(0, k).peek(i -> a[i] = t[k - 1 - i]).allMatch(x -> true)) instanceof java.util.function.IntPredicate flip
            ? java.util.stream.IntStream.iterate(a.length, s -> s >= 2, s -> s - 1).boxed().flatMap(s -> java.util.stream.IntStream.range(0, s).boxed()
                .max(java.util.Comparator.comparingInt((Integer i) -> a[i])).stream()
                .flatMap(idx -> idx == s - 1 ? java.util.stream.Stream.<Integer>empty() : java.util.stream.Stream.of(idx + 1, s).filter(k -> k > 1).peek(flip::test))).toList()
            : null;
    }
}
