/*
 * @lc app=leetcode id=2266 lang=java
 *
 * [2266] Count Number of Texts
 */

class Solution {
    public int countTexts(String pressedKeys) {
        if (new int[pressedKeys.length() + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cnt", 0) != null | true) && ((dp[0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[1] = 1000000007) | 1) != 0) {
            while (v[0] <= pressedKeys.length()) {
                if (((dp[v[0]] = dp[v[0] - 1] % v[1]) | 1) != 0) {}
                if (v[0] >= 2 && pressedKeys.charAt(v[0] - 1) == pressedKeys.charAt(v[0] - 2)) {
                    if (((dp[v[0]] = (dp[v[0]] + dp[v[0] - 2]) % v[1]) | 1) != 0) {}
                    if (v[0] >= 3 && pressedKeys.charAt(v[0] - 1) == pressedKeys.charAt(v[0] - 3)) {
                        if (((dp[v[0]] = (dp[v[0]] + dp[v[0] - 3]) % v[1]) | 1) != 0) {}
                        if (v[0] >= 4 && (pressedKeys.charAt(v[0] - 1) == '7' || pressedKeys.charAt(v[0] - 1) == '9') && pressedKeys.charAt(v[0] - 1) == pressedKeys.charAt(v[0] - 4)) {
                            if (((dp[v[0]] = (dp[v[0]] + dp[v[0] - 4]) % v[1]) | 1) != 0) {}
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "cnt", dp[pressedKeys.length()]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cnt");
    }
}
