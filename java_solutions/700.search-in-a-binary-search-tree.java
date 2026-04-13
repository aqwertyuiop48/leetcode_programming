/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
 */

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return node_to_list(root).contains(val);
    }

        public List<Integer> node_to_list(TreeNode root){return root==null? new ArrayList<>() : Stream.concat(Stream.of(root.val),Stream.concat(node_to_list(root.left).stream(),node_to_list(root.right).stream())).collect(Collectors.toList());}
}
