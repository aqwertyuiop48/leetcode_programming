/*
 * @lc app=leetcode id=1481 lang=java
 *
 * [1481] Least Number of Unique Integers after K Removals
 */

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        return java.util.stream.Stream.of(new int[]{k}).mapToInt(s -> (int) java.util.Arrays.stream(arr).boxed().collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), java.util.stream.Collectors.counting())).values().stream().sorted().dropWhile(v -> (s[0] -= v.intValue()) >= 0).count()).findFirst().getAsInt();
    }
}
