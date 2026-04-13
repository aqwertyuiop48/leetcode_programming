/*
 * @lc app=leetcode id=1356 lang=java
 *
 * [1356] Sort Integers by The Number of 1 Bits
 */

class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
            .boxed()
            .sorted(Comparator
                .comparingInt((Integer x) -> Integer.bitCount(x))
                .thenComparingInt(x -> x))                        
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
