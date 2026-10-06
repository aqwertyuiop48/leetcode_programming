/*
 * @lc app=leetcode id=954 lang=java
 *
 * [954] Array of Doubled Pairs
 */

class Solution {
    public boolean canReorderDoubled(int[] arr) {
        return new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap<Integer, Integer> m && java.util.Arrays.stream(arr).peek(x -> m.merge(x, 1, Integer::sum)).allMatch(x -> true)
            && java.util.Arrays.stream(arr).boxed().sorted(java.util.Comparator.comparingInt(Math::abs)).allMatch(x -> m.get(x) == 0
                || (m.getOrDefault(2 * x, 0) > (x == 0 ? 1 : 0) && m.merge(x, -1, Integer::sum) >= 0 && m.merge(2 * x, -1, Integer::sum) >= 0));
    }
}
