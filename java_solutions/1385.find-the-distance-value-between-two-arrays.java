/*
 * @lc app=leetcode id=1385 lang=java
 *
 * [1385] Find the Distance Value Between Two Arrays
 */

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        return (int) Arrays.stream(arr1)
            .filter(a -> Arrays.stream(arr2).allMatch(b -> Math.abs(a - b) > d))
            .count();
    }
}
