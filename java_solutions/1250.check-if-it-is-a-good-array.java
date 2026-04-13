/*
 * @lc app=leetcode id=1250 lang=java
 *
 * [1250] Check If It Is a Good Array
 */

class Solution {
    public boolean isGoodArray(int[] nums) {
        return Arrays.stream(new boolean[][]{new boolean[]{false}}).peek(res -> {
            if (new int[]{0, 0, 0, 0} instanceof int[] v) {
                while (v[0] < nums.length && !res[0]) {
                    if (((v[2] = v[1]) | 1) != 0 && ((v[3] = nums[v[0]]) | 1) != 0) {
                        while (v[3] != 0) {
                            if (((v[2] %= v[3]) | 1) != 0 && ((v[2] ^= v[3]) | 1) != 0 && ((v[3] ^= v[2]) | 1) != 0 && ((v[2] ^= v[3]) | 1) != 0) {}
                        }
                        if (((v[1] = v[2]) | 1) != 0) {
                            if (v[1] == 1) {
                                if (((res[0] = true) | true)) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
