/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */

class Solution { 
    public int findLHS(int[] nums) { 
        return Optional.of(Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))) .map(map -> map.keySet().stream().filter(key -> map.containsKey(key + 1)).mapToLong(key -> map.get(key) + map.get(key + 1)).max().orElse(0L)) .get().intValue();
         } 
}
