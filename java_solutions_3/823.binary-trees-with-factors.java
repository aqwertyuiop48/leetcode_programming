/*
 * @lc app=leetcode id=823 lang=java
 *
 * [823] Binary Trees With Factors
 */

class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        return java.util.Arrays.stream(arr).sorted().toArray() instanceof int[] a && new java.util.HashMap<Integer, Long>() instanceof java.util.HashMap<Integer, Long> dp
            && java.util.Arrays.stream(a).boxed().allMatch(x -> dp.put(x, (1 + java.util.Arrays.stream(a).filter(y -> x % y == 0 && dp.containsKey(y) && dp.containsKey(x / y))
                .mapToLong(y -> dp.get(y) * dp.get(x / y) % 1000000007L).sum()) % 1000000007L) == null)
            ? (int) (dp.values().stream().mapToLong(v -> v).sum() % 1000000007L) : 0;
    }
}
