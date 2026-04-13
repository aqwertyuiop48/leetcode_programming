/*
 * @lc app=leetcode id=1646 lang=java
 *
 * [1646] Get Maximum in Generated Array
 */

class Solution {
    public int getMaximumGenerated(int n) {
        return n == 0 ? 0 : IntStream.of(n)
            .mapToObj(val -> new int[val + 1])
            .flatMapToInt(nums -> IntStream.rangeClosed(0, n)
                .map(i -> nums[i] = (i < 2) ? i : (i % 2 == 0) ? nums[i / 2] : nums[i / 2] + nums[i / 2 + 1]))
            .max()
            .getAsInt();
    }
}
