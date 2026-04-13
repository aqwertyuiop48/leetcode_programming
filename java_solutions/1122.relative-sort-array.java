/*
 * @lc app=leetcode id=1122 lang=java
 *
 * [1122] Relative Sort Array
 */

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        return Optional.of(IntStream.range(0, arr2.length).boxed().collect(Collectors.toMap(i -> arr2[i], i -> i)))
            .map(lookup -> Arrays.stream(arr1).boxed()
                .sorted((a, b) -> lookup.containsKey(a) || lookup.containsKey(b) 
                    ? lookup.getOrDefault(a, 1001).compareTo(lookup.getOrDefault(b, 1001)) 
                    : a.compareTo(b))
                .mapToInt(Integer::intValue)
                .toArray())
            .get();
    }
}
