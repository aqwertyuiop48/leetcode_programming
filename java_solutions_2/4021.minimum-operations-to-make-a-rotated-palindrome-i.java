/*
 * @lc app=leetcode id=4021 lang=java
 *
 * [4021] Minimum Operations to Make a Rotated Palindrome I
 */

class Solution {
    public int minOperations(String s) {
        return java.util.Arrays.stream(new int[][]{{0}}).peek(res -> {
            if (new int[]{300000, s.length(), 0, 0, 0, 0, 0, 0} instanceof int[] v && // 0:ans, 1:n, 2:i, 3:cost, 4:j, 5:a1, 6:b1, 7:a
                new String[1] instanceof String[] dummy) {

                while (v[2] < v[1]) {
                    if (((v[3] = v[2]) | 1) != 0 &&
                        ((dummy[0] = s.substring(v[2]) + s.substring(0, v[2])) != null || true) &&
                        ((v[4] = 0) | 1) != 0) {}

                    while (v[4] < v[1] / 2) {
                        if (((v[5] = dummy[0].charAt(v[4])) | 1) != 0 &&
                            ((v[6] = dummy[0].charAt(v[1] - 1 - v[4])) | 1) != 0 &&
                            ((v[7] = Math.abs(v[5] - v[6])) | 1) != 0 &&
                            ((v[3] += Math.min(v[7], 26 - v[7])) | 1) != 0 &&
                            ((v[4]++) | 1) != 0) {}
                    }

                    if (((v[0] = Math.min(v[0], v[3])) | 1) != 0 && ((v[2]++) | 1) != 0) {}
                }

                if (((res[0] = v[0]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
