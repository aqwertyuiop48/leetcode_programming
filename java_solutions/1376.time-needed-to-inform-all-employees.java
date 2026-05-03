/*
 * @lc app=leetcode id=1376 lang=java
 *
 * [1376] Time Needed to Inform All Employees
 */

class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        return java.util.Optional.of(new java.util.List[n])
            .filter(adj -> java.util.stream.IntStream.range(0, n).allMatch(i -> (adj[i] = new java.util.ArrayList<Integer>()) != null))
            .filter(adj -> java.util.stream.IntStream.range(0, n).allMatch(i -> manager[i] == -1 || adj[manager[i]].add(i)))
            .map(adj -> new Object[]{adj, new java.util.function.IntUnaryOperator[1]})
            .map(s -> (((java.util.function.IntUnaryOperator[]) s[1])[0] = id -> informTime[id] + (((java.util.List<Integer>[]) s[0])[id].isEmpty() ? 0 : ((java.util.List<Integer>[]) s[0])[id].stream().mapToInt(c -> ((java.util.function.IntUnaryOperator[]) s[1])[0].applyAsInt(c)).max().getAsInt())).applyAsInt(headID))
            .orElse(0);
    }
}
