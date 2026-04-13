/*
 * @lc app=leetcode id=1542 lang=java
 *
 * [1542] Find Longest Awesome Substring
 */

class Solution {
    public int longestAwesome(String s) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[1024] instanceof int[] mask && new int[]{0, 0, 0} instanceof int[] v) {
                while (v[0] < 1024) {
                    if (((mask[v[0]] = s.length()) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((mask[0] = -1) | 1) != 0) {
                    while (v[0] < s.length()) {
                        if (((v[1] ^= (1 << (s.charAt(v[0]) - '0'))) | 1) != 0) {
                            if (((res[0] = Math.max(res[0], v[0] - mask[v[1]])) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] <= 9) {
                                    if (((res[0] = Math.max(res[0], v[0] - mask[v[1] ^ (1 << v[2])])) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (mask[v[1]] == s.length()) {
                                if (((mask[v[1]] = v[0]) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
