/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return nums.length == 0 ? List.of(List.of()) : IntStream.range(0, nums.length) .boxed() .flatMap(i -> permute(IntStream.range(0, nums.length).filter(j -> i != j).map(j -> nums[j]).toArray()).stream() .map(p -> Stream.concat(Stream.of(nums[i]), p.stream()).toList())) .toList();
    }
}
