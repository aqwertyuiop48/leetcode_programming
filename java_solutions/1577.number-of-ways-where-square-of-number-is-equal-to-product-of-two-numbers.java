/*
 * @lc app=leetcode id=1577 lang=java
 *
 * [1577] Number of Ways Where Square of Number Is Equal to Product of Two Numbers
 */

class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return (int) Stream.<int[][]>of(new int[][]{nums1, nums2}, new int[][]{nums2, nums1})
            .mapToLong(p -> Optional.of(Arrays.stream(p[1]).boxed()
                .collect(Collectors.groupingBy(i -> (long) i, Collectors.counting())))
                .map(m -> Arrays.stream(p[0]).mapToLong(x -> (long) x * x)
                    .map(s -> m.entrySet().stream()
                        .filter(e -> s % e.getKey() == 0 && m.containsKey(s / e.getKey()) && e.getKey() <= s / e.getKey())
                        .mapToLong(e -> e.getKey() * e.getKey() == s 
                            ? e.getValue() * (e.getValue() - 1) / 2 
                            : e.getValue() * m.get(s / e.getKey()))
                        .sum())
                    .sum())
                .get())
            .sum();
    }
}
