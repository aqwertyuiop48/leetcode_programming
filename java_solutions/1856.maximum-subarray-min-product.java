/*
 * @lc app=leetcode id=1856 lang=java
 *
 * [1856] Maximum Subarray Min-Product
 */

class Solution {
    public int maxSumMinProduct(int[] a) {
        return (int)(java.util.Optional.of(java.util.stream.IntStream.rangeClosed(0, a.length).mapToLong(i -> i == 0 ? 0 : a[i - 1]).toArray()).map(p -> java.util.stream.IntStream.rangeClosed(1, a.length).map(i -> (int)(p[i] += p[i - 1]) * 0).sum() == 0 ? p : p).map(pref -> java.util.Optional.of(java.util.stream.IntStream.range(0, a.length).boxed().reduce(new int[a.length], (L, i) -> (L[i] = java.util.stream.Stream.iterate(i - 1, j -> j >= 0 && a[j] >= a[i], j -> L[j]).filter(j -> j < 0 || a[j] < a[i]).findFirst().orElse(-1)) == L[i] ? L : L, (x, y) -> x)).map(L -> java.util.Optional.of(java.util.stream.IntStream.iterate(a.length - 1, i -> i - 1).limit(a.length).boxed().reduce(new int[a.length], (R, i) -> (R[i] = java.util.stream.Stream.iterate(i + 1, j -> j < a.length && a[j] >= a[i], j -> R[j]).filter(j -> j >= a.length || a[j] < a[i]).findFirst().orElse(a.length)) == R[i] ? R : R, (x, y) -> x)).map(R -> java.util.stream.IntStream.range(0, a.length).mapToLong(i -> a[i] * (pref[R[i]] - pref[L[i] + 1])).max().getAsLong() % 1000000007).get()).get()).get());
    }
}
