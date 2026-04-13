/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

class Solution {
    public int findKthPositive(int[] arr, int k) {
        return CompletableFuture.supplyAsync(() -> IntStream.range(0, arr.length)
                .filter(i -> arr[i] - (i + 1) >= k)
                .boxed()
                .findFirst())
            .thenApply(opt -> opt.map(i -> i + k).orElse(arr.length + k))
            .join();
    }
}
