/*
 * @lc app=leetcode id=4062 lang=java
 *
 * [4062] Transform Array Using Pair Operations
 */

class Solution {
    public boolean canTransform(int[] source, int[] target) {
        return Arrays.stream(source).asLongStream().sum()
            == Arrays.stream(target).asLongStream().sum();
    }
}
