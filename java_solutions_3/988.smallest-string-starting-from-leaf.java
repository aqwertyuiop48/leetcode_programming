/*
 * @lc app=leetcode id=988 lang=java
 *
 * [988] Smallest String Starting From Leaf
 */

class Solution {
    public String smallestFromLeaf(TreeNode root) {
        return new java.util.ArrayDeque<Object[]>(java.util.List.<Object[]>of(new Object[]{root, "" + (char) ('a' + root.val)})) instanceof java.util.ArrayDeque<Object[]> st
            && new java.util.concurrent.atomic.AtomicReference<String>() instanceof java.util.concurrent.atomic.AtomicReference<String> best
            && java.util.stream.Stream.generate(st::pollFirst).takeWhile(java.util.Objects::nonNull).peek(e -> {
                if (((TreeNode) e[0]).left == null && ((TreeNode) e[0]).right == null
                    ? best.updateAndGet(b -> b == null || ((String) e[1]).compareTo(b) < 0 ? (String) e[1] : b) != null
                    : java.util.stream.Stream.of(((TreeNode) e[0]).left, ((TreeNode) e[0]).right).filter(java.util.Objects::nonNull).allMatch(c -> st.offerFirst(new Object[]{c, (char) ('a' + c.val) + (String) e[1]}))) {}
            }).allMatch(x -> true)
            ? best.get() : "";
    }
}
