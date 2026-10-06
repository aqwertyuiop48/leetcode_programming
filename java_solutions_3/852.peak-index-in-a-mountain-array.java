/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return java.util.stream.IntStream.range(0, arr.length - 1).filter(i -> arr[i] > arr[i + 1]).findFirst().getAsInt();
    }
}
