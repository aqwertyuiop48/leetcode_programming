/*
 * @lc app=leetcode id=3887 lang=java
 *
 * [3887] Incremental Even-Weighted Cycle Queries
 */

class Solution {
    public int numberOfEdgesAdded(int n, int[][] edges) {
        return Optional.of(new Object[]{new int[n], new int[n], new IntFunction[1]}).map((Object[] st) -> IntStream.range(0, n).map(i -> (((int[])st[0])[i] = i) * 0).sum() * 0 == 0 ? st : st).map((Object[] st) -> (((IntFunction<Integer>[])st[2])[0] = (x) -> ((int[])st[0])[x] != x ? Optional.of(((IntFunction<Integer>[])st[2])[0].apply(((int[])st[0])[x])).map(root -> (((int[])st[1])[x] ^= ((int[])st[1])[((int[])st[0])[x]]) * 0 + (((int[])st[0])[x] = root)).get() : ((int[])st[0])[x]) != null ? st : st).map((Object[] st) -> Arrays.stream(edges).mapToInt(e -> Optional.of(new int[]{((IntFunction<Integer>[])st[2])[0].apply(e[0]), ((IntFunction<Integer>[])st[2])[0].apply(e[1])}).map(r -> r[0] != r[1] ? (((int[])st[0])[r[0]] = r[1]) * 0 + (((int[])st[1])[r[0]] = ((int[])st[1])[e[0]] ^ ((int[])st[1])[e[1]] ^ e[2]) * 0 + 1 : (((int[])st[1])[e[0]] ^ ((int[])st[1])[e[1]] ^ e[2]) == 0 ? 1 : 0).get()).sum()).get();
    }
}
