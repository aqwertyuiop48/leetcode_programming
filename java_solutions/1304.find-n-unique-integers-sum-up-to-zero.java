/*
 * @lc app=leetcode id=1304 lang=java
 *
 * [1304] Find N Unique Integers Sum up to Zero
 */

class Solution {
    public int[] sumZero(int n) {
        return IntStream.range(0, n).map(i -> i * 2 - (n - 1)).toArray();
    }
}
