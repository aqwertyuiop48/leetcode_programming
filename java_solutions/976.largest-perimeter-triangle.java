/*
 * @lc app=leetcode id=976 lang=java
 *
 * [976] Largest Perimeter Triangle
 */

class Solution {
    public int largestPerimeter(int[] nums) {
        return Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray() instanceof int[] sorted ? IntStream.range(0, nums.length - 2).filter(i -> sorted[i] < sorted[i + 1] + sorted[i + 2]).map(i -> sorted[i] + sorted[i + 1] + sorted[i + 2]).findFirst().orElse(0) : 0;
    }
}
