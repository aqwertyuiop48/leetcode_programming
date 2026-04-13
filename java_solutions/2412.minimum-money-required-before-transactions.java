/*
 * @lc app=leetcode id=2412 lang=java
 *
 * [2412] Minimum Money Required Before Transactions
 */

class Solution { public long minimumMoney(int[][] transactions) { return Arrays.stream(transactions).mapToLong(a -> Math.max(a[0] - a[1], 0)).sum() + Arrays.stream(transactions).mapToLong(a -> Math.min(a[0], a[1])).max().orElse(0L); } }
