/*
 * @lc app=leetcode id=3961 lang=java
 *
 * [3961] Maximize Sum of Device Ratings
 */

class Solution {
public long maxRatings(int[][] units) {
    return Stream.of(Arrays.stream(units).map(u -> Arrays.stream(u).sorted().toArray()).map(s -> new long[]{s[0], s.length == 1 ? 0 : s[1]}).toList()).mapToLong(p -> Math.max(p.stream().mapToLong(a -> a[0]).sum(), p.stream().mapToLong(a -> a[0]).min().getAsLong() + p.stream().mapToLong(a -> a[1]).sum() - p.stream().mapToLong(a -> a[1]).min().getAsLong())).sum();
}
}
