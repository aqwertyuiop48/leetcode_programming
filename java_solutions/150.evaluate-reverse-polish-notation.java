/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

class Solution {
    public int evalRPN(String[] t) {
        return java.util.Arrays.stream(t).reduce(new java.util.Stack<Integer>(), (s, x) -> java.util.stream.Stream.of(1).map(dummy -> s.push(x.equals("+") ? s.pop() + s.pop() : x.equals("*") ? s.pop() * s.pop() : x.equals("-") ? -s.pop() + s.pop() : x.equals("/") ? java.util.stream.Stream.of(s.pop()).map(b -> s.pop() / b).findFirst().get() : Integer.parseInt(x))).map(dummy -> s).findFirst().get(), (a, b) -> a).pop();
    }
}
