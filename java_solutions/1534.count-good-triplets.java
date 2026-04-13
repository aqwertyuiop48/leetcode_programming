/*
 * @lc app=leetcode id=1534 lang=java
 *
 * [1534] Count Good Triplets
 */

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        return (int) IntStream.range(0, arr.length - 2)
            .flatMap(i -> IntStream.range(i + 1, arr.length - 1)
                .filter(j -> Math.abs(arr[i] - arr[j]) <= a)
                .flatMap(j -> IntStream.range(j + 1, arr.length)
                    .filter(k -> Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)))
            .count();
    }
}
