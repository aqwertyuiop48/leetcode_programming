/*
 * @lc app=leetcode id=1550 lang=java
 *
 * [1550] Three Consecutive Odds
 */

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        return CompletableFuture.supplyAsync(() -> IntStream.range(0, arr.length - 2)
                .anyMatch(i -> (arr[i] & arr[i+1] & arr[i+2] & 1) == 1))
            .join();
    }
}
