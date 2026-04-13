/*
 * @lc app=leetcode id=1900 lang=java
 *
 * [1900] The Earliest and Latest Rounds Where Players Compete
 */

public class Solution {
    public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) {
        return Math.min(firstPlayer, secondPlayer) + Math.max(firstPlayer, secondPlayer) == n + 1 ? new int[]{1, 1} : n <= 4 ? new int[]{2, 2} : Math.min(firstPlayer, secondPlayer) - 1 > n - Math.max(firstPlayer, secondPlayer) ? earliestAndLatest(n, n + 1 - Math.max(firstPlayer, secondPlayer), n + 1 - Math.min(firstPlayer, secondPlayer)) : IntStream.rangeClosed(0, Math.min(firstPlayer, secondPlayer) - 1).boxed().flatMap(i -> IntStream.rangeClosed(0, (Math.max(firstPlayer, secondPlayer) * 2 <= n + 1 ? Math.max(firstPlayer, secondPlayer) - Math.min(firstPlayer, secondPlayer) - 1 : (n + 1 - Math.max(firstPlayer, secondPlayer)) - Math.min(firstPlayer, secondPlayer) - 1)).mapToObj(j -> earliestAndLatest((n + 1) / 2, i + 1, Math.max(firstPlayer, secondPlayer) * 2 <= n + 1 ? i + j + 2 : i + j + 1 + ((Math.max(firstPlayer, secondPlayer) - (n + 1 - Math.max(firstPlayer, secondPlayer)) - 1) + 1) / 2 + 1))).reduce(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}, (a, b) -> new int[]{Math.min(a[0], b[0] + 1), Math.max(a[1], b[1] + 1)});
    }
}
