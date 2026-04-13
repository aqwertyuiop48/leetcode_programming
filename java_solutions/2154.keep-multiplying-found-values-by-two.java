/*
 * @lc app=leetcode id=2154 lang=java
 *
 * [2154] Keep Multiplying Found Values by Two
 */

class Solution {
    public int findFinalValue(int[] nums, int original) {
        return Stream.of(Arrays.stream(nums).boxed().collect(Collectors.toSet()))
            .map(set -> Stream.iterate(original, x -> x * 2)
                .dropWhile(set::contains)
                .findFirst()
                .get())
            .findFirst()
            .get();
    }
}
