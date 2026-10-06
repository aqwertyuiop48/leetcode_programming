/*
 * @lc app=leetcode id=655 lang=java
 *
 * [655] Print Binary Tree
 */

class Solution {
    public List<List<String>> printTree(TreeNode root) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>> ht
            && ht.getAndSet(n -> n == null ? 0 : 1 + Math.max(ht.get().apply(n.left), ht.get().apply(n.right))) == null
            && ht.get().apply(root) instanceof Integer H && new String[H][(1 << H) - 1] instanceof String[][] g
            && java.util.Arrays.stream(g).peek(r -> java.util.Arrays.fill(r, "")).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, H).boxed().reduce(java.util.List.<Object[]>of(new Object[]{root, (1 << (H - 1)) - 1}),
                (level, r) -> level.stream().peek(x -> g[r][(int) x[1]] = "" + ((TreeNode) x[0]).val)
                    .flatMap(x -> java.util.stream.Stream.of(((TreeNode) x[0]).left == null ? null : new Object[]{((TreeNode) x[0]).left, (int) x[1] - (1 << (H - r - 2))},
                        ((TreeNode) x[0]).right == null ? null : new Object[]{((TreeNode) x[0]).right, (int) x[1] + (1 << (H - r - 2))}).filter(java.util.Objects::nonNull)).toList(),
                (a, b) -> a) != null
            ? java.util.Arrays.stream(g).map(java.util.Arrays::asList).toList() : null;
    }
}
