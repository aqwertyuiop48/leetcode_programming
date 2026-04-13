/*
 * @lc app=leetcode id=1299 lang=java
 *
 * [1299] Replace Elements with Greatest Element on Right Side
 */

class Solution {
    public int[] replaceElements(int[] arr) {
        return Optional.of(new int[arr.length])
            .map(res -> IntStream.iterate(arr.length - 1, i -> i >= 0, i -> i - 1)
                .boxed()
                .reduce(new int[]{-1}, (max, i) -> new int[]{ (res[i] = max[0]) == max[0] ? Math.max(max[0], arr[i]) : 0 }, (a, b) -> a) != null ? res : res)
            .get();
    }
}
