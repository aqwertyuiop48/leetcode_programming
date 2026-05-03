/*
 * @lc app=leetcode id=1367 lang=java
 *
 * [1367] Linked List in Binary Tree
 */

class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return java.util.Optional.of(new java.util.function.BiPredicate[2])
            .filter(a -> (a[0] = (java.util.function.BiPredicate<ListNode, TreeNode>) (h, n) -> h == null || (n != null && h.val == n.val && (a[0].test(h.next, n.left) || a[0].test(h.next, n.right)))) != null)
            .filter(a -> (a[1] = (java.util.function.BiPredicate<ListNode, TreeNode>) (h, n) -> n != null && (a[0].test(h, n) || a[1].test(h, n.left) || a[1].test(h, n.right))) != null)
            .map(a -> a[1].test(head, root))
            .orElse(false);
    }
}
