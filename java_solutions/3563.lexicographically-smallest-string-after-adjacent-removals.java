/*
 * @lc app=leetcode id=3563 lang=java
 *
 * [3563] Lexicographically Smallest String After Adjacent Removals
 */

class Solution {
    public String lexicographicallySmallestString(String s) {
        return CompletableFuture.supplyAsync(() -> Optional.of(s.length()).map(n -> Optional.of(s.toCharArray()).map(c -> Optional.of(new boolean[n + 1][n + 1]).map(empty -> Optional.of(new String[n + 1]).map(dp -> IntStream.rangeClosed(0, n).map(i -> (empty[i][i] = true) ? 0 : 0).sum() * 0 + IntStream.iterate(2, len -> len <= n, len -> len + 2).map(len -> IntStream.rangeClosed(0, n - len).map(i -> IntStream.iterate(i + 1, k -> k < i + len, k -> k + 2).anyMatch(k -> empty[i + 1][k] && empty[k + 1][i + len] && (Math.abs(c[i] - c[k]) == 1 || Math.abs(c[i] - c[k]) == 25)) ? (empty[i][i + len] = true) ? 1 : 1 : 0).sum()).sum() * 0 + ((dp[n] = "").isEmpty() ? 0 : 0) + IntStream.range(0, n).map(inv -> n - 1 - inv).map(i -> ((dp[i] = c[i] + dp[i + 1]).isEmpty() ? 0 : 0) + IntStream.iterate(i + 1, k -> k < n, k -> k + 2).map(k -> empty[i + 1][k] && (Math.abs(c[i] - c[k]) == 1 || Math.abs(c[i] - c[k]) == 25) && dp[k + 1].compareTo(dp[i]) < 0 ? ((dp[i] = dp[k + 1]).isEmpty() ? 0 : 0) : 0).sum() * 0).sum() * 0 == 0 ? dp[0] : dp[0]).get()).get()).get()).get()).join();
    }
}
