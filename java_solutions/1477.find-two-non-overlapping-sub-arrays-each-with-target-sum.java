/*
 * @lc app=leetcode id=1477 lang=java
 *
 * [1477] Find Two Non-overlapping Sub-arrays Each With Target Sum
 */

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        return java.util.Optional.of(new Object[]{new java.util.HashMap<Integer, Integer>(), new int[]{0, Integer.MAX_VALUE}, new int[arr.length], new int[]{0}})
            .filter(s -> (((java.util.Map<Integer, Integer>) s[0]).put(0, -1) == null || true))
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(arr.length, 0)).removeIf(dummy -> 
                ((((java.util.Map<Integer, Integer>) s[0]).put(((int[]) s[1])[0] += arr[((int[]) s[3])[0]], ((int[]) s[3])[0]) == null || true) &&
                 ((((int[]) s[2])[((int[]) s[3])[0]] = Math.min(((int[]) s[3])[0] > 0 ? ((int[]) s[2])[((int[]) s[3])[0] - 1] : Integer.MAX_VALUE, ((java.util.Map<Integer, Integer>) s[0]).containsKey(((int[]) s[1])[0] - target) ? ((int[]) s[3])[0] - ((java.util.Map<Integer, Integer>) s[0]).get(((int[]) s[1])[0] - target) : Integer.MAX_VALUE)) >= 0 || true) &&
                 ((((java.util.Map<Integer, Integer>) s[0]).containsKey(((int[]) s[1])[0] - target) && ((java.util.Map<Integer, Integer>) s[0]).get(((int[]) s[1])[0] - target) >= 0 && ((int[]) s[2])[((java.util.Map<Integer, Integer>) s[0]).get(((int[]) s[1])[0] - target)] != Integer.MAX_VALUE) ? (((int[]) s[1])[1] = Math.min(((int[]) s[1])[1], ((int[]) s[2])[((java.util.Map<Integer, Integer>) s[0]).get(((int[]) s[1])[0] - target)] + ((int[]) s[3])[0] - ((java.util.Map<Integer, Integer>) s[0]).get(((int[]) s[1])[0] - target))) >= 0 : true) &&
                 (((int[]) s[3])[0]++ >= 0) && false) || true))
            .map(s -> ((int[]) s[1])[1] == Integer.MAX_VALUE ? -1 : ((int[]) s[1])[1])
            .get();
    }
}
