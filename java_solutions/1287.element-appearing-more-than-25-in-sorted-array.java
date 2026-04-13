/*
 * @lc app=leetcode id=1287 lang=java
 *
 * [1287] Element Appearing More Than 25% In Sorted Array
 */

class Solution {
    public int findSpecialInteger(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> (i + arr.length / 4 < arr.length && arr[i] == arr[i + arr.length / 4]))
                .mapToObj(i -> arr[i])
                .findFirst()
                .orElse(arr[0]);
    }
}
