/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

class Solution { public boolean backspaceCompare(String s, String t) { return Stream.of(s, t) .map(str -> str.chars().boxed().reduce(new Stack<Integer>(), (stack, c) -> c == '#' ? (stack.isEmpty() ? stack : (Stack<Integer>) (stack.pop() == null ? stack : stack)) : (Stack<Integer>) (stack.push(c) == null ? stack : stack), (a, b) -> a)) .collect(Collectors.toList()) .get(0).equals(Stream.of(s, t).map(str -> str.chars().boxed().reduce(new Stack<Integer>(), (stack, c) -> c == '#' ? (stack.isEmpty() ? stack : (Stack<Integer>) (stack.pop() == null ? stack : stack)) : (Stack<Integer>) (stack.push(c) == null ? stack : stack), (a, b) -> a)).collect(Collectors.toList()).get(1)); } }
