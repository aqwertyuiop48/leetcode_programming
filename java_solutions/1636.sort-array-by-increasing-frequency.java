/*
 * @lc app=leetcode id=1636 lang=java
 *
 * [1636] Sort Array by Increasing Frequency
 */

class Solution {
    public int[] frequencySort(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.collectingAndThen(
                Collectors.groupingBy(Function.identity(), Collectors.counting()),
                freqMap -> Arrays.stream(nums)
                    .boxed()
                    .sorted((a, b) -> freqMap.get(a).equals(freqMap.get(b)) 
                        ? Integer.compare(b, a) 
                        : Long.compare(freqMap.get(a), freqMap.get(b)))
                    .mapToInt(Integer::intValue)
                    .toArray()
            ));
    }
}
