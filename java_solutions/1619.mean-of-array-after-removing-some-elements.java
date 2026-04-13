/*
 * @lc app=leetcode id=1619 lang=java
 *
 * [1619] Mean of Array After Removing Some Elements
 */

class Solution {
    public double trimMean(int[] arr) {
        return CompletableFuture.supplyAsync(() -> Arrays.stream(arr)
                .sorted()
                .skip(arr.length * 5 / 100)
                .limit(arr.length - 2 * (arr.length * 5 / 100))
                .average()
                .orElse(0.0))
            .join();
    }
}
