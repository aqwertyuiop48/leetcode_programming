/*
 * @lc app=leetcode id=923 lang=java
 *
 * [923] 3Sum With Multiplicity
 */

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        return new long[101] instanceof long[] c && java.util.Arrays.stream(arr).peek(x -> c[x]++).allMatch(x -> true)
            ? (int) (java.util.stream.IntStream.rangeClosed(0, 100).mapToLong(i -> java.util.stream.IntStream.rangeClosed(i, 100).mapToLong(j -> java.util.stream.IntStream.of(target - i - j).filter(k -> k >= j && k <= 100)
                .mapToLong(k -> i == j && j == k ? c[i] * (c[i] - 1) * (c[i] - 2) / 6 : i == j ? c[i] * (c[i] - 1) / 2 * c[k] : j == k ? c[i] * (c[j] * (c[j] - 1) / 2) : c[i] * c[j] * c[k]).sum() % 1000000007L).sum() % 1000000007L).sum() % 1000000007L) : 0;
    }
}
