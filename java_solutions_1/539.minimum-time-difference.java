/*
 * @lc app=leetcode id=539 lang=java
 *
 * [539] Minimum Time Difference
 */

class Solution {
    public int findMinDifference(java.util.List<String> timePoints) {
        return java.util.stream.Stream.of(timePoints.stream().mapToInt(t -> Integer.parseInt(t.substring(0, 2)) * 60 + Integer.parseInt(t.substring(3))).sorted().toArray()).map(arr -> java.util.stream.IntStream.range(0, arr.length).map(i -> i == arr.length - 1 ? arr[0] + 1440 - arr[i] : arr[i + 1] - arr[i]).min().getAsInt()).findFirst().get();
    }
}
