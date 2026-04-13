/*
 * @lc app=leetcode id=1611 lang=java
 *
 * [1611] Minimum One Bit Operations to Make Integers Zero
 */

class Solution {
    public int minimumOneBitOperations(int n) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{n} instanceof int[] v) {
                while (v[0] > 0) {
                    if (((res[0] ^= v[0]) | 1) != 0 && ((v[0] >>= 1) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
