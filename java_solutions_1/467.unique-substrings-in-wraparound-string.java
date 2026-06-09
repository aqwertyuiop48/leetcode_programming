/*
 * @lc app=leetcode id=467 lang=java
 *
 * [467] Unique Substrings in Wraparound String
 */

class Solution {
    public int findSubstringInWraproundString(String p) {
        return p.isEmpty() ? 0 : java.util.stream.Stream.of(new int[26]).peek(dp -> java.util.stream.IntStream.range(0, p.length()).boxed().reduce(0, (len, i) -> java.util.stream.Stream.of(i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i - 1) - p.charAt(i) == 25) ? len + 1 : 1).peek(l -> dp[p.charAt(i) - 'a'] = Math.max(dp[p.charAt(i) - 'a'], l)).findFirst().get(), (a, b) -> b)).map(dp -> java.util.Arrays.stream(dp).sum()).findFirst().get();
    }
}
