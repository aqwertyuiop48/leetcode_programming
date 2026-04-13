/*
 * @lc app=leetcode id=1437 lang=java
 *
 * [1437] Check If All 1's Are at Least Length K Places Away
 */

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        return Optional.of(IntStream.range(0, nums.length).filter(i -> nums[i] == 1).boxed().collect(Collectors.toList()))
            .map(idx -> IntStream.range(0, idx.size() - 1)
                .allMatch(i -> idx.get(i + 1) - idx.get(i) > k))
            .get();
    }
}
