/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        return Arrays.stream(nums).boxed().sorted(Comparator.comparingInt(a -> a % 2)).mapToInt(i -> i).toArray();
    }
}
