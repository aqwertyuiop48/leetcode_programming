/*
 * @lc app=leetcode id=665 lang=java
 *
 * [665] Non-decreasing Array
 */

class Solution {
    public boolean checkPossibility(int[] nums) {
        return nums.clone() instanceof int[] a && java.util.stream.IntStream.range(1, a.length)
            .filter(i -> a[i - 1] > a[i] && (i < 2 || a[i - 2] <= a[i] ? (a[i - 1] = a[i]) == a[i] : (a[i] = a[i - 1]) == a[i - 1])).count() <= 1;
    }
}
