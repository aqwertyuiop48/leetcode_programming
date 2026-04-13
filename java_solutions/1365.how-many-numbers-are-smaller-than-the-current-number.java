/*
 * @lc app=leetcode id=1365 lang=java
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        return Optional.of(Arrays.stream(nums).boxed().sorted().collect(Collectors.toList()))
            .map(sortedList -> Arrays.stream(nums).map(sortedList::indexOf).toArray())
            .get();
    }
}
