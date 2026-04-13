/*
 * @lc app=leetcode id=3609 lang=java
 *
 * [3609] Minimum Moves to Reach Target in Grid
 */

class Solution {
    public int minMoves(int sx, int sy, int tx, int ty) {
        return (sx == 0 && sy == 0) ? ((tx == 0 && ty == 0) ? 0 : -1) : CompletableFuture.supplyAsync(() -> Optional.of((Function<int[], Integer>[]) new Function[1]).map(f -> Optional.of(f[0] = s -> s[0] == sx && s[1] == sy ? s[2] : (sx > s[0] || sy > s[1] ? -1 : (s[0] > s[1] ? (s[0] > s[1] * 2 ? (s[0] % 2 != 0 ? -1 : f[0].apply(new int[]{s[0] / 2, s[1], s[2] + 1})) : f[0].apply(new int[]{s[0] - s[1], s[1], s[2] + 1})) : (s[0] < s[1] ? (s[1] > s[0] * 2 ? (s[1] % 2 != 0 ? -1 : f[0].apply(new int[]{s[0], s[1] / 2, s[2] + 1})) : f[0].apply(new int[]{s[0], s[1] - s[0], s[2] + 1})) : (sx == 0 ? f[0].apply(new int[]{0, s[1], s[2] + 1}) : (sy == 0 ? f[0].apply(new int[]{s[0], 0, s[2] + 1}) : -1)))))).map(init -> f[0].apply(new int[]{tx, ty, 0})).get()).get()).join();
    }
}
