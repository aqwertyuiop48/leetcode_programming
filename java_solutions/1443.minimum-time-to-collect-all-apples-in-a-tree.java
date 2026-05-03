/*
 * @lc app=leetcode id=1443 lang=java
 *
 * [1443] Minimum Time to Collect All Apples in a Tree
 */

class Solution {
    public int minTime(int n, int[][] edges, java.util.List<Boolean> hasApple) {
        return (int) java.util.Optional.of(new Object[]{new java.util.List[n], new java.util.function.BiFunction[1]})
            .filter(s -> java.util.stream.IntStream.range(0, n).allMatch(i -> (((java.util.List[]) s[0])[i] = new java.util.ArrayList<Integer>()) != null))
            .filter(s -> java.util.Arrays.stream(edges).allMatch(e -> ((java.util.List<Integer>[]) s[0])[e[0]].add(e[1]) && ((java.util.List<Integer>[]) s[0])[e[1]].add(e[0])))
            .filter(s -> (((java.util.function.BiFunction[]) s[1])[0] = (java.util.function.BiFunction<Integer, Integer, Integer>) (u, p) -> ((java.util.List<Integer>[]) s[0])[u].stream().filter(v -> !v.equals(p)).mapToInt(v -> java.util.Optional.<Integer>of((Integer) ((java.util.function.BiFunction<Integer, Integer, Integer>) ((java.util.function.BiFunction[]) s[1])[0]).apply(v, u)).map(res -> res > 0 || hasApple.get(v) ? res + 2 : 0).get()).sum()) != null)
            .map(s -> (Integer) ((java.util.function.BiFunction<Integer, Integer, Integer>) ((java.util.function.BiFunction[]) s[1])[0]).apply(0, -1))
            .get();
    }
}
