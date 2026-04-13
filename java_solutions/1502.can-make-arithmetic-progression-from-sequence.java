/*
 * @lc app=leetcode id=1502 lang=java
 *
 * [1502] Can Make Arithmetic Progression From Sequence
 */

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        return CompletableFuture.supplyAsync(() -> Arrays.stream(arr).sorted().toArray())
            .thenApply(sortedArr -> IntStream.range(0, sortedArr.length - 1)
                .map(i -> sortedArr[i + 1] - sortedArr[i])
                .distinct()
                .count() <= 1)
            .join();
    }
}
