/*
 * @lc app=leetcode id=781 lang=java
 *
 * [781] Rabbits in Forest
 */

class Solution {
    public int numRabbits(int[] answers) {
        return java.util.Arrays.stream(answers).boxed().collect(java.util.stream.Collectors.groupingBy(a -> a, java.util.stream.Collectors.counting())).entrySet().stream()
            .mapToInt(e -> (int) ((e.getValue() + e.getKey()) / (e.getKey() + 1)) * (e.getKey() + 1)).sum();
    }
}
