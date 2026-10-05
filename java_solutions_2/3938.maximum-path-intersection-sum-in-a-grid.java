/*
 * @lc app=leetcode id=3938 lang=java
 *
 * [3938] Maximum Path Intersection Sum in a Grid
 */

class Solution {
public int maxScore(int[][] g) {
    return Math.max(IntStream.range(1, g.length - 1).flatMap(i -> IntStream.range(1, g[0].length - 1).map(j -> g[i][j])).max().orElse(Integer.MIN_VALUE), Stream.concat(Arrays.stream(g), IntStream.range(0, g[0].length).mapToObj(j -> Arrays.stream(g).mapToInt(r -> r[j]).toArray())).mapToInt(L -> IntStream.range(2, L.length).collect(() -> new int[]{L[0] + L[1], L[0] + L[1]}, (s, j) -> s[1] = Math.max(s[1], s[0] = Math.max(s[0] + L[j], L[j - 1] + L[j])), (x, y) -> {})[1]).max().getAsInt());
}
}
