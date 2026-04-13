/*
 * @lc app=leetcode id=2164 lang=java
 *
 * [2164] Sort Even and Odd Indices Independently
 */

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        return Optional.of(new int[][] {
            IntStream.range(0, nums.length).filter(i -> i % 2 == 0).map(i -> nums[i]).sorted().toArray(),
            IntStream.range(0, nums.length).filter(i -> i % 2 != 0).map(i -> nums[i]).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray()
        }).map(a -> IntStream.range(0, nums.length).map(i -> a[i % 2][i / 2]).toArray()).get();
    }
}
