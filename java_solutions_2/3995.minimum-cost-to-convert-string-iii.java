/*
 * @lc app=leetcode id=3995 lang=java
 *
 * [3995] Minimum Cost to Convert String III
 */

class Solution {
    public int minCost(String s, String t, List<List<String>> r, int[] c) {
        return java.util.stream.Stream.of(new int[s.length() + 1])
            .peek(dp -> java.util.Arrays.fill(dp, 1000000))
            .peek(dp -> dp[s.length()] = 0)
            .peek(dp -> java.util.stream.IntStream.range(0, s.length())
                .map(i -> s.length() - 1 - i)
                .forEach(i -> dp[i] = Math.min(
                    s.charAt(i) == t.charAt(i) ? dp[i + 1] : 1000000,
                    java.util.stream.IntStream.range(0, r.size())
                        .map(j -> java.util.stream.Stream.of(r.get(j).get(0))
                            .mapToInt(pat -> (i + pat.length() <= s.length() && dp[i + pat.length()] < 1000000 && java.util.stream.IntStream.range(0, pat.length()).allMatch(k -> (s.charAt(i + k) == pat.charAt(k) || pat.charAt(k) == '*') && t.charAt(i + k) == r.get(j).get(1).charAt(k)))
                                ? c[j] + dp[i + pat.length()] + java.util.stream.IntStream.range(0, pat.length()).map(k -> s.charAt(i + k) != pat.charAt(k) ? 1 : 0).sum()
                                : 1000000
                            )
                            .findFirst().getAsInt()
                        )
                        .min()
                        .orElse(1000000)
                ))
            )
            .map(dp -> dp[0] >= 1000000 ? -1 : dp[0])
            .findFirst()
            .get();
    }
}
