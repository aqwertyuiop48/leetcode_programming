/*
 * @lc app=leetcode id=1760 lang=java
 *
 * [1760] Minimum Limit of Balls in a Bag
 */

class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        return java.util.stream.Stream.iterate(new int[]{1, 1000000000}, b -> java.util.Arrays.stream(nums).map(n -> (n - 1) / (b[0] + (b[1] - b[0]) / 2)).sum() <= maxOperations ? new int[]{b[0], b[0] + (b[1] - b[0]) / 2} : new int[]{b[0] + (b[1] - b[0]) / 2 + 1, b[1]}).filter(b -> b[0] >= b[1]).findFirst().get()[0];
    }
}
