/*
 * @lc app=leetcode id=4000 lang=java
 *
 * [4000] Largest Integer With Given Digit Sum
 */

class Solution {
    public int largestInteger(int n, int s) {
        return s == 0 ? 0 : (n == 1 && s <= 9 ? s : (s > 9 * n ? -1 : java.util.stream.IntStream.range(0, n)
            .boxed()
            .reduce(new int[]{0, s}, (acc, i) -> acc[1] >= 0 && acc[1] <= 9 
                ? new int[]{acc[0] * 10 + acc[1], 0} 
                : new int[]{acc[0] * 10 + 9, acc[1] - 9}, (a, b) -> a)[0]));
    }
}
