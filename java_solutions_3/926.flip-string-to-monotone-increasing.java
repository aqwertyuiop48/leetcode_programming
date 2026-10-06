/*
 * @lc app=leetcode id=926 lang=java
 *
 * [926] Flip String to Monotone Increasing
 */

class Solution {
    public int minFlipsMonoIncr(String s) {
        return s.chars().boxed().reduce(new int[]{0, 0}, (a, c) -> c == '1' ? new int[]{a[0] + 1, a[1]} : new int[]{a[0], Math.min(a[1] + 1, a[0])}, (a, b) -> a)[1];
    }
}
