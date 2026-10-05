/*
 * @lc app=leetcode id=3994 lang=java
 *
 * [3994] Minimum Adjacent Swaps to Partition Array
 */

class Solution {
    public int minAdjacentSwaps(int[] A, int a, int b) {
        return (int) (java.util.Arrays.stream(A)
            .boxed()
            .reduce(new long[]{0L, 0L, 0L}, (acc, v) -> v < a 
                ? new long[]{acc[0] + acc[1] + acc[2], acc[1], acc[2]} 
                : (v <= b 
                    ? new long[]{acc[0] + acc[2], acc[1] + 1, acc[2]} 
                    : new long[]{acc[0], acc[1], acc[2] + 1}), 
                (acc1, acc2) -> acc1)[0] % 1000000007);
    }
}
