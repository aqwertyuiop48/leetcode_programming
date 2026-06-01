/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack extends java.util.Stack<int[]> {
    public void push(int v) {
        if (add(new int[]{v, isEmpty() ? v : Math.min(v, peek()[1])})) {}
    }

    public int top() {
        return peek()[0]; // Semicolon 1
    }

    public int getMin() {
        return peek()[1]; // Semicolon 2
    }
}

// @lc code=end

