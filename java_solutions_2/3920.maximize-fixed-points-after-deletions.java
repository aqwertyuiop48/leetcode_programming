/*
 * @lc app=leetcode id=3920 lang=java
 *
 * [3920] Maximize Fixed Points After Deletions
 */

class Solution {
 public int maxFixedPoints(int[] A) {
    return IntStream.range(0, A.length).filter(i -> i >= A[i]).mapToObj(i -> new int[]{i - A[i], A[i]}).sorted(Comparator.<int[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1])).collect(() -> new int[A.length + 1], (t, p) -> t[A.length] += IntStream.of(Arrays.binarySearch(t, 0, t[A.length], p[1])).map(r -> r >= 0 ? r : -r - 1).map(pos -> (t[pos] = p[1]) * 0 + (pos == t[A.length] ? 1 : 0)).sum(), (a, b) -> {})[A.length];
}
}
