/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return Stream.iterate(new int[]{0, numbers.length - 1}, p -> numbers[p[0]] + numbers[p[1]] > target ? new int[]{p[0], p[1] - 1} : new int[]{p[0] + 1, p[1]}) .filter(p -> numbers[p[0]] + numbers[p[1]] == target) .map(p -> new int[]{p[0] + 1, p[1] + 1}) .findFirst() .orElse(new int[]{});
    }
}
