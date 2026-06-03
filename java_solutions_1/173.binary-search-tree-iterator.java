/*
 * @lc app=leetcode id=173 lang=java
 *
 * [173] Binary Search Tree Iterator
 */

// @lc code=start

class BSTIterator extends java.util.Stack<TreeNode> {
    
    public BSTIterator(TreeNode root) {
        // No semicolon: anyMatch evaluates the stream and executes add() as a side effect
        if (java.util.stream.Stream.iterate(root, n -> n != null, n -> n.left).anyMatch(n -> !add(n))) {}
    }

    public int next() {
        // Semicolon 1: Mandatory for the return statement
        return java.util.stream.Stream.of(pop()).peek(n -> java.util.stream.Stream.iterate(n.right, c -> c != null, c -> c.left).forEach(this::push)).mapToInt(n -> n.val).findFirst().getAsInt();
    }

    public boolean hasNext() {
        // Semicolon 2: Mandatory for the return statement
        return !isEmpty();
    }
}

// @lc code=end

