/*
 * @lc app=leetcode id=1629 lang=java
 *
 * [1629] Slowest Key
 */

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        return CompletableFuture.supplyAsync(() -> IntStream.range(0, releaseTimes.length)
                .boxed()
                .max(Comparator.comparingInt((Integer i) -> i == 0 ? releaseTimes[0] : releaseTimes[i] - releaseTimes[i - 1])
                        .thenComparingInt(i -> (int) keysPressed.charAt(i)))
                .map(keysPressed::charAt)
                .orElse(' '))
            .join();
    }
}
