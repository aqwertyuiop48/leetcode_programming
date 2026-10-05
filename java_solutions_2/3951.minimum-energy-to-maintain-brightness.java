/*
 * @lc app=leetcode id=3951 lang=java
 *
 * [3951] Minimum Energy to Maintain Brightness
 */

class Solution {
public long minEnergy(int n, int brightness, int[][] intervals) {
    return Stream.of(Arrays.stream(intervals).sorted(Comparator.<int[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1])).collect(() -> new long[]{Long.MIN_VALUE / 4 + 1, Long.MIN_VALUE / 4, 0}, (st, iv) -> st[2] += (st[1] >= iv[0] ? 0 : st[1] - st[0] + 1) + 0 * ((st[0] = st[1] >= iv[0] ? st[0] : iv[0]) + (st[1] = st[1] >= iv[0] ? Math.max(st[1], iv[1]) : iv[1])), (a, b) -> {})).mapToLong(st -> (st[2] + st[1] - st[0] + 1) * ((brightness + 2) / 3)).sum();
}
}
