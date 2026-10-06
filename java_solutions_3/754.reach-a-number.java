/*
 * @lc app=leetcode id=754 lang=java
 *
 * [754] Reach a Number
 */

class Solution {
    public int reachNumber(int target) {
        return java.util.stream.IntStream.of(Math.abs(target)).map(t -> java.util.stream.IntStream.iterate(1, k -> k + 1)
            .filter(k -> (long) k * (k + 1) / 2 >= t && ((long) k * (k + 1) / 2 - t) % 2 == 0).findFirst().getAsInt()).findFirst().getAsInt();
    }
}
