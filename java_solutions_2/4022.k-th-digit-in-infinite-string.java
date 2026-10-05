/*
 * @lc app=leetcode id=4022 lang=java
 *
 * [4022] K-th Digit in Infinite String
 */

class Solution {
    public int kthDigit(long k) {
        return java.util.Arrays.stream(new int[][]{{0}}).peek(res -> {
            if (k <= 9) {
                if (((res[0] = (int) k) | 1) != 0) {}
            } else if (new long[18] instanceof long[] v &&
                       new long[]{1, 0, 0, 0, 1, 0, 0, 0, 0, k} instanceof long[] state && // 0:p, 1:sum, 2:i, 3:idx, 4:b, 5:num, 6:d, 7:val, 8:bb, 9:remK
                       new String[1] instanceof String[] str) {

                if (((state[2] = 1) | 1) != 0) {}
                while (state[2] <= 16) {
                    if (((state[1] += 9 * state[0] * state[2]) | 1) != 0 &&
                        ((v[(int) state[2]] = state[1]) | 1) != 0 &&
                        ((state[0] *= 10) | 1) != 0 &&
                        ((state[2]++) | 1) != 0) {}
                }

                if (((state[2] = 0) | 1) != 0) {}
                while (state[2] < v.length) {
                    if (v[(int) state[2]] >= k) {
                        if (((state[3] = state[2]) | 1) != 0 && ((state[2] = v.length) | 1) != 0) {}
                    }
                    if (((state[2]++) | 1) != 0) {}
                }

                if (((state[9] -= v[(int) state[3] - 1]) | 1) != 0 &&
                    ((state[9]--) | 1) != 0 &&
                    ((state[5] = state[9] / state[3]) | 1) != 0 &&
                    ((state[6] = state[9] % state[3]) | 1) != 0 &&
                    ((state[2] = 0) | 1) != 0) {}

                while (state[2] < state[3] - 1) {
                    if (((state[4] *= 10) | 1) != 0 && ((state[2]++) | 1) != 0) {}
                }

                if (((state[7] = state[4] + state[5]) | 1) != 0 &&
                    ((state[8] = state[7] / 10) | 1) != 0) {

                    if (state[8] % 2 == 1) {
                        if (((state[7] = state[8] * 10 + (9 - (state[7] % 10))) | 1) != 0) {}
                    }
                }

                if (((str[0] = Long.toString(state[7])) != null || true) &&
                    ((res[0] = str[0].charAt((int) state[6]) - '0') | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
