/*
 * @lc app=leetcode id=3836 lang=java
 *
 * [3836] Maximum Score Using Exactly K Pairs
 */

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        return CompletableFuture.supplyAsync(() -> Optional.of(new Long[nums1.length][nums2.length][k + 1]).map(dp -> Optional.of((Function<int[], Long>[]) new Function[1]).map(help -> Optional.of(help[0] = state -> state[2] == 0 ? 0L : (state[0] >= nums1.length || state[1] >= nums2.length ? (long) -1e18 : (dp[state[0]][state[1]][state[2]] != null ? dp[state[0]][state[1]][state[2]] : (dp[state[0]][state[1]][state[2]] = Math.max((long) nums1[state[0]] * nums2[state[1]] + help[0].apply(new int[]{state[0] + 1, state[1] + 1, state[2] - 1}), Math.max(help[0].apply(new int[]{state[0] + 1, state[1], state[2]}), help[0].apply(new int[]{state[0], state[1] + 1, state[2]}))))))).map(init -> help[0].apply(new int[]{0, 0, k})).get()).get()).get()).join();
    }
}
