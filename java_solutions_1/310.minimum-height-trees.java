/*
 * @lc app=leetcode id=310 lang=java
 *
 * [310] Minimum Height Trees
 */

// @lc code=start
class Solution {
    public java.util.List<Integer> findMinHeightTrees(int n, int[][] edges) {
        return n == 1 ? java.util.List.of(0) : java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.ArrayList[n], new int[n]}).peek(a -> java.util.stream.IntStream.range(0, n).forEach(i -> ((java.util.List<Integer>[]) a[0])[i] = new java.util.ArrayList<>())).peek(a -> java.util.Arrays.stream(edges).forEach(e -> java.util.stream.Stream.of(0).peek(_x -> ((java.util.List<Integer>[]) a[0])[e[0]].add(e[1])).peek(_x -> ((java.util.List<Integer>[]) a[0])[e[1]].add(e[0])).peek(_x -> ((int[]) a[1])[e[0]]++).forEach(_x -> ((int[]) a[1])[e[1]]++))).map(a -> java.util.stream.Stream.iterate(new Object[]{java.util.stream.IntStream.range(0, n).filter(i -> ((int[]) a[1])[i] == 1).boxed().collect(java.util.stream.Collectors.toList()), n}, s -> new Object[]{((java.util.List<Integer>) s[0]).stream().flatMap(leaf -> java.util.stream.Stream.of(leaf).peek(l -> ((int[]) a[1])[l]--).flatMap(l -> ((java.util.List<Integer>[]) a[0])[l].stream()).filter(neighbor -> --((int[]) a[1])[neighbor] == 1)).collect(java.util.stream.Collectors.toList()), (int) s[1] - ((java.util.List<Integer>) s[0]).size()}).dropWhile(s -> (int) s[1] > 2).findFirst().get()[0]).map(res -> (java.util.List<Integer>) res).findFirst().get();
    }
}
// @lc code=end
