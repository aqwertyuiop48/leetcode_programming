/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

class Solution {
    public int thirdMax(int[] nums) {
        return Optional.of(Arrays.stream(nums).distinct().boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList())).map(l -> l.size() < 3 ? l.get(0) : l.get(2)).get();
    }
}
