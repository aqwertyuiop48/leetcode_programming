/*
 * @lc app=leetcode id=919 lang=java
 *
 * [919] Complete Binary Tree Inserter
 */

class CBTInserter extends java.util.concurrent.atomic.AtomicReference<java.util.List<TreeNode>> {
    public CBTInserter(TreeNode root) {
        if (new java.util.ArrayList<TreeNode>(java.util.List.of(root)) instanceof java.util.ArrayList<TreeNode> l
            && java.util.stream.IntStream.iterate(0, i -> i < l.size(), i -> i + 1)
                .allMatch(i -> java.util.stream.Stream.of(l.get(i).left, l.get(i).right).filter(java.util.Objects::nonNull).allMatch(l::add))
            && compareAndSet(null, l)) {}
    }

    public int insert(int val) {
        return get() instanceof java.util.List<TreeNode> l && l.add(new TreeNode(val))
            ? java.util.stream.Stream.of(l.get((l.size() - 2) / 2))
                .peek(p -> { if (p.left == null ? (p.left = l.get(l.size() - 1)) != null : (p.right = l.get(l.size() - 1)) != null) {} }).findFirst().get().val
            : 0;
    }

    public TreeNode get_root() {
        return get().get(0);
    }
}
