/*
 * @lc app=leetcode id=398 lang=java
 *
 * [398] Random Pick Index
 */

record Solution(int[] nums) {
    public int pick(int target) {
        return java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] == target).boxed().collect(java.util.stream.Collectors.collectingAndThen(java.util.stream.Collectors.toList(), l -> l.get(new java.util.Random().nextInt(l.size()))));
    }
}
