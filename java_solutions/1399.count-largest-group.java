/*
 * @lc app=leetcode id=1399 lang=java
 *
 * [1399] Count Largest Group
 */

class Solution {
    public int countLargestGroup(int n) {
        return new Object[]{java.util.stream.IntStream.rangeClosed(1, n).boxed().collect(java.util.stream.Collectors.groupingBy(i -> String.valueOf(i).chars().map(c -> c - '0').sum(), java.util.stream.Collectors.counting())).values().stream().mapToInt(Long::intValue).max().orElse(0)} instanceof Object[] max && max[0] != null ? (int)java.util.stream.IntStream.rangeClosed(1, n).boxed().collect(java.util.stream.Collectors.groupingBy(i -> String.valueOf(i).chars().map(c -> c - '0').sum(), java.util.stream.Collectors.counting())).values().stream().filter(c -> c == (int)max[0]).count() : 0;
    }
}
