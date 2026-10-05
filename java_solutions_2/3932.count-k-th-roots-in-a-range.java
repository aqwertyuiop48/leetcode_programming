/*
 * @lc app=leetcode id=3932 lang=java
 *
 * [3932] Count K-th Roots in a Range
 */

class Solution {
public int countKthRoots(int l, int r, int k) {
    return k == 1 ? r - l + 1 : (int) IntStream.rangeClosed(0, (int) Math.pow(r, 1.0 / k) + 1).mapToLong(x -> Math.round(Math.pow(x, k))).filter(y -> l <= y && y <= r).count();
}
}
