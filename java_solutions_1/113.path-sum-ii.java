/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 */

// @lc code=start

class Solution {
    public java.util.List<java.util.List<Integer>> pathSum(TreeNode root, int targetSum) {
        return java.util.stream.Stream.<Object[]>of(new Object[]{new java.util.ArrayList<java.util.List<Integer>>(), new java.util.ArrayList<Integer>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Object[]>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Object[]>>) a[2]).set(args -> java.util.stream.Stream.of((TreeNode) args[0]).filter(n -> n != null).forEach(n -> java.util.stream.Stream.of(0).peek(_v -> ((java.util.List<Integer>) a[1]).add(n.val)).peek(_v -> java.util.stream.Stream.of(0).filter(_x -> n.left == null && n.right == null && (int) args[1] == n.val).forEach(_x -> ((java.util.List<java.util.List<Integer>>) a[0]).add(new java.util.ArrayList<>((java.util.List<Integer>) a[1])))).peek(_v -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Object[]>>) a[2]).get().accept(new Object[]{n.left, (int) args[1] - n.val})).peek(_v -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Object[]>>) a[2]).get().accept(new Object[]{n.right, (int) args[1] - n.val})).forEach(_v -> ((java.util.List<Integer>) a[1]).remove(((java.util.List<Integer>) a[1]).size() - 1))))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Object[]>>) a[2]).get().accept(new Object[]{root, targetSum})).map(a -> (java.util.List<java.util.List<Integer>>) a[0]).findFirst().get();
    }
}
// @lc code=end

