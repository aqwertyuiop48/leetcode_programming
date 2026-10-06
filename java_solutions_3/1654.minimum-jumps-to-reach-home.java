/*
 * @lc app=leetcode id=1654 lang=java
 *
 * [1654] Minimum Jumps to Reach Home
 */

class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        return java.util.Arrays.stream(forbidden).boxed().collect(java.util.stream.Collectors.toSet()) instanceof java.util.Set<Integer> fb
            ? java.util.stream.IntStream.of(Math.max(x, java.util.Arrays.stream(forbidden).max().orElse(0)) + a + b).map(L -> new boolean[L + 1][2] instanceof boolean[][] seen && (seen[0][0] = true)
                ? java.util.stream.Stream.iterate(java.util.List.of(new int[]{0, 0}), f -> !f.isEmpty(), f -> f.stream().flatMap(s -> java.util.stream.Stream.of(new int[]{s[0] + a, 0}, new int[]{s[0] - b, 1})
                    .filter(t -> (t[1] == 0 || s[1] == 0) && t[0] >= 0 && t[0] <= L && !fb.contains(t[0]) && !seen[t[0]][t[1]] && (seen[t[0]][t[1]] = true))).toList())
                    .map(f -> f.stream().anyMatch(s -> s[0] == x)).toList().indexOf(true) : -1).findFirst().getAsInt()
            : -1;
    }
}
