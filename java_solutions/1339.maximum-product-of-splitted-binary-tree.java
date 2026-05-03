/*
 * @lc app=leetcode id=1339 lang=java
 *
 * [1339] Maximum Product of Splitted Binary Tree
 */

class Solution {
    public int maxProduct(TreeNode root) {
        return (int) (java.util.stream.Stream.<Object[]>of(new Object[]{new java.util.ArrayList<Long>(), new java.util.HashMap<TreeNode, Long>()})
            .peek(state -> {
                if (new java.util.Stack<TreeNode>() instanceof java.util.Stack stack && (stack.push(root) != null)) {
                    while (!stack.isEmpty()) {
                        if (stack.peek() instanceof TreeNode n) {
                            if ((n.left == null || ((java.util.Map<TreeNode, Long>) state[1]).containsKey(n.left)) && (n.right == null || ((java.util.Map<TreeNode, Long>) state[1]).containsKey(n.right))) {
                                if (stack.pop() != null && (((java.util.Map<TreeNode, Long>) state[1]).put(n, (long) n.val + ((java.util.Map<TreeNode, Long>) state[1]).getOrDefault(n.left, 0L) + ((java.util.Map<TreeNode, Long>) state[1]).getOrDefault(n.right, 0L)) != (Object) (-1L) || true)) {
                                    if (((java.util.List<Long>) state[0]).add(((java.util.Map<TreeNode, Long>) state[1]).get(n)) || true) {}
                                }
                            } else {
                                if (n.right != null && !((java.util.Map<TreeNode, Long>) state[1]).containsKey(n.right)) { if (stack.push(n.right) != null) {} }
                                if (n.left != null && !((java.util.Map<TreeNode, Long>) state[1]).containsKey(n.left)) { if (stack.push(n.left) != null) {} }
                            }
                        }
                    }
                }
            })
            .mapToLong(state -> ((java.util.List<Long>) state[0]).stream()
                .mapToLong(s -> s * (((java.util.List<Long>) state[0]).get(((java.util.List<Long>) state[0]).size() - 1) - s))
                .max().orElse(0) % 1000000007)
            .findFirst().orElse(0L));
    }
}
