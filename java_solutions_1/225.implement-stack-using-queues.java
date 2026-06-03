/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start
class MyStack extends java.util.LinkedList<Integer> {

    public void push(int x) {
        // 0 Semicolons: allMatch forces full execution because it depends on add()'s return value
        if (add(x) && java.util.stream.IntStream.range(1, size()).allMatch(i -> add(poll()))) {}
    }

    // pop() is still completely omitted and inherited for free!

    public int top() {
        return peek(); // Semicolon 1
    }

    public boolean empty() {
        return isEmpty(); // Semicolon 2
    }
}

// @lc code=end
