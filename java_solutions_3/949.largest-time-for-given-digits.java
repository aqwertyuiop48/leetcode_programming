/*
 * @lc app=leetcode id=949 lang=java
 *
 * [949] Largest Time for Given Digits
 */

class Solution {
    public String largestTimeFromDigits(int[] arr) {
        return java.util.stream.IntStream.range(0, 256).filter(k -> java.util.stream.IntStream.of(k / 64, k / 16 % 4, k / 4 % 4, k % 4).distinct().count() == 4)
            .map(k -> (10 * arr[k / 64] + arr[k / 16 % 4]) * 100 + 10 * arr[k / 4 % 4] + arr[k % 4]).filter(v -> v / 100 < 24 && v % 100 < 60).max()
            .stream().mapToObj(v -> String.format("%02d:%02d", v / 100, v % 100)).findFirst().orElse("");
    }
}
