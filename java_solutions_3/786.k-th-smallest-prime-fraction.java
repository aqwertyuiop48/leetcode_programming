/*
 * @lc app=leetcode id=786 lang=java
 *
 * [786] K-th Smallest Prime Fraction
 */

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        return java.util.stream.IntStream.range(0, arr.length).boxed().flatMap(i -> java.util.stream.IntStream.range(i + 1, arr.length).mapToObj(j -> new int[]{arr[i], arr[j]}))
            .sorted(java.util.Comparator.comparingDouble(p -> (double) p[0] / p[1])).skip(k - 1).findFirst().get();
    }
}
