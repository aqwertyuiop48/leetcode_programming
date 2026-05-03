/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

record Solution() {
    public int peakIndexInMountainArray(int[] arr) {
        return java.util.stream.Stream.iterate(new int[]{0, arr.length - 1}, b -> b[0] < b[1], b -> java.util.Optional.of((b[0] + b[1]) / 2).map(m -> arr[m] < arr[m + 1] ? new int[]{m + 1, b[1]} : new int[]{b[0], m}).get()).reduce((a, b) -> b).get()[0];
    }
}
