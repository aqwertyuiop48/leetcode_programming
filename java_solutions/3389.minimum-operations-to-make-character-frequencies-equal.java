/*
 * @lc app=leetcode id=3389 lang=java
 *
 * [3389] Minimum Operations to Make Character Frequencies Equal
 */

class Solution { public int makeStringGood(String s) { return ((Function<int[], Integer>) cnt -> IntStream.rangeClosed(Arrays.stream(cnt).filter(c -> c > 0).min().orElse(0), Arrays.stream(cnt).max().orElse(0)).map(target -> Math.min(((int[]) Arrays.stream(cnt).boxed().reduce(new int[]{cnt[0], cnt[0] <= target ? target - cnt[0] : cnt[0] - target, cnt[0], 0}, (dp, c) -> dp[3]++ == 0 ? dp : new int[]{ Math.min(dp[0], dp[1]) + c, c >= target ? Math.min(dp[0], dp[1]) + (c - target) : Math.min(dp[0] + target - Math.min(target, c + dp[2]), dp[1] + target - Math.min(target, c + Math.max(0, dp[2] - target))), c, dp[3] }, (a, b) -> a))[0], ((int[]) Arrays.stream(cnt).boxed().reduce(new int[]{cnt[0], cnt[0] <= target ? target - cnt[0] : cnt[0] - target, cnt[0], 0}, (dp, c) -> dp[3]++ == 0 ? dp : new int[]{ Math.min(dp[0], dp[1]) + c, c >= target ? Math.min(dp[0], dp[1]) + (c - target) : Math.min(dp[0] + target - Math.min(target, c + dp[2]), dp[1] + target - Math.min(target, c + Math.max(0, dp[2] - target))), c, dp[3] }, (a, b) -> a))[1])).min().orElse(0)).apply(s.chars().boxed().reduce(new int[26], (arr, c) -> arr[c - 'a']++ < 0 ? arr : arr, (a, b) -> a)); } }
