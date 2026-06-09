/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */

class Solution {
    public String[] findRelativeRanks(int[] score) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{score.clone(), new java.util.HashMap<Integer, Integer>()}).peek(a -> java.util.Arrays.sort((int[]) a[0])).peek(a -> java.util.stream.IntStream.range(0, score.length).forEach(i -> ((java.util.Map<Integer, Integer>) a[1]).put(((int[]) a[0])[i], score.length - i))).map(a -> java.util.Arrays.stream(score).mapToObj(s -> ((java.util.Map<Integer, Integer>) a[1]).get(s) == 1 ? "Gold Medal" : ((java.util.Map<Integer, Integer>) a[1]).get(s) == 2 ? "Silver Medal" : ((java.util.Map<Integer, Integer>) a[1]).get(s) == 3 ? "Bronze Medal" : String.valueOf(((java.util.Map<Integer, Integer>) a[1]).get(s))).toArray(String[]::new)).findFirst().get();
    }
}
