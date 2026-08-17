/*
 * @lc app=leetcode id=1367 lang=kotlin
 *
 * [1367] Linked List in Binary Tree
 */

class Solution { fun isSubPath(head: ListNode?, root: TreeNode?): Boolean = DeepRecursiveFunction<Pair<ListNode?, TreeNode?>, Boolean> { (h, n) -> h == null || (n != null && h.`val` == n.`val` && (callRecursive(h.next to n.left) || callRecursive(h.next to n.right))) }.let { isMatch -> DeepRecursiveFunction<TreeNode?, Boolean> { n -> n != null && (isMatch(head to n) || callRecursive(n.left) || callRecursive(n.right)) }(root) } }