/*
 * @lc app=leetcode id=1424 lang=java
 *
 * [1424] Diagonal Traverse II
 */

class Solution {
    public int[] findDiagonalOrder(java.util.List<java.util.List<Integer>> nums) {
        return java.util.stream.IntStream.range(0, nums.size()).boxed().flatMap(i -> java.util.stream.IntStream.range(0, nums.get(i).size()).mapToObj(j -> new int[]{i + j, j, nums.get(i).get(j)})).sorted((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]).mapToInt(a -> a[2]).toArray();
    }
}
