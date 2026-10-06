/*
 * @lc app=leetcode id=658 lang=java
 *
 * [658] Find K Closest Elements
 */

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        return java.util.Arrays.stream(arr).boxed().sorted(java.util.Comparator.comparingInt((Integer a) -> Math.abs(a - x)).thenComparingInt(a -> a)).limit(k).sorted().toList();
    }
}
