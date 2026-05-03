/*
 * @lc app=leetcode id=1394 lang=java
 *
 * [1394] Find Lucky Integer in an Array
 */

class Solution {
    public int findLucky(int[] arr) {
        return java.util.Arrays.stream(arr).boxed().collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.counting())).entrySet().stream().filter(e -> e.getKey().equals(e.getValue().intValue())).mapToInt(java.util.Map.Entry::getKey).max().orElse(-1);
    }
}
