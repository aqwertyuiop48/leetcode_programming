/*
 * @lc app=leetcode id=3785 lang=java
 *
 * [3785] Minimum Swaps to Avoid Forbidden Values
 */

class Solution {
    public int minSwaps(int[] a, int[] f) {
        return Stream.<Object[]>of(new Object[]{
            new int[1], // [0] cnt
            new int[1], // [1] maxi
            new HashMap<Integer, Integer>(), // [2] matching map
            new HashMap<Integer, Integer>(), // [3] a_map
            new HashMap<Integer, Integer>()  // [4] f_map
        }).peek(s -> IntStream.range(0, a.length).allMatch(i -> 
            ((Map<Integer, Integer>) s[3]).merge(a[i], 1, Integer::sum) != null && 
            ((Map<Integer, Integer>) s[4]).merge(f[i], 1, Integer::sum) != null && 
            (a[i] != f[i] || (((int[]) s[0])[0]++ >= 0 && 
            (((int[]) s[1])[0] = Math.max(((int[]) s[1])[0], ((Map<Integer, Integer>) s[2]).merge(a[i], 1, Integer::sum))) >= 0))
        )).map(s -> ((Map<Integer, Integer>) s[3]).entrySet().stream()
            .anyMatch(p -> p.getValue() + ((Map<Integer, Integer>) s[4]).getOrDefault(p.getKey(), 0) > a.length)
            ? -1 : Math.max(((int[]) s[1])[0], (((int[]) s[0])[0] + 1) / 2))
        .findFirst().get();
    }
}
