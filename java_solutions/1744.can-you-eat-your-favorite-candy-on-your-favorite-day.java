/*
 * @lc app=leetcode id=1744 lang=java
 *
 * [1744] Can You Eat Your Favorite Candy on Your Favorite Day?
 */

class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        return java.util.Optional.of(new long[candiesCount.length + 1]).filter(p -> java.util.stream.IntStream.range(0, candiesCount.length).allMatch(i -> (p[i + 1] = p[i] + candiesCount[i]) >= 0 || true)).map(p -> java.util.Optional.of(new boolean[queries.length]).filter(ans -> java.util.stream.IntStream.range(0, queries.length).allMatch(i -> (ans[i] = queries[i][1] < p[queries[i][0] + 1] && (long) (queries[i][1] + 1) * queries[i][2] > p[queries[i][0]]) || true)).get()).get();
    }
}
