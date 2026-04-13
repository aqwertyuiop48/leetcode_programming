/*
 * @lc app=leetcode id=2149 lang=java
 *
 * [2149] Rearrange Array Elements by Sign
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        return Stream.of(Arrays.stream(nums).boxed().collect(Collectors.partitioningBy(n -> n > 0)))
            .flatMapToInt(map -> IntStream.range(0, nums.length)
                .map(i -> map.get(i % 2 == 0).get(i / 2)))
            .toArray();
    }
}
