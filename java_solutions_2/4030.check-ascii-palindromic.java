/*
 * @lc app=leetcode id=4030 lang=java
 *
 * [4030] Check ASCII Palindromic
 */

class Solution {
    public boolean isPalindromic(String s) {
        return java.util.Arrays.stream(new boolean[][]{{false}}).peek(res -> {
            if (new StringBuilder() instanceof StringBuilder sb &&
                new int[]{0, 0, 0, 1} instanceof int[] v) {

                while (v[0] < s.length()) {
                    if (String.format("%8s", Integer.toBinaryString(s.charAt(v[0]))).replace(' ', '0') instanceof String bin) {
                        if ((sb.append(bin) != null || true) && ((v[0]++) | 1) != 0) {}
                    }
                }

                if (((v[2] = sb.length() - 1) | 1) != 0) {}

                while (v[1] < v[2] && v[3] == 1) {
                    if (sb.charAt(v[1]) != sb.charAt(v[2])) {
                        if (((v[3] = 0) | 1) != 0) {}
                    }
                    if (((v[1]++) | 1) != 0 && ((v[2]--) | 1) != 0) {}
                }

                if (((res[0] = (v[3] == 1)) || true)) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
