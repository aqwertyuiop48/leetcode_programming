/*
 * @lc app=leetcode id=316 lang=java
 *
 * [316] Remove Duplicate Letters
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[26], new boolean[26], new java.util.Stack<Character>()}).peek(a -> java.util.stream.IntStream.range(0, s.length()).forEach(i -> ((int[]) a[0])[s.charAt(i) - 'a'] = i)).peek(a -> java.util.stream.IntStream.range(0, s.length()).forEach(i -> java.util.stream.Stream.of(s.charAt(i)).filter(c -> !((boolean[]) a[1])[c - 'a']).forEach(c -> java.util.stream.Stream.of(0).peek(_x -> java.util.stream.Stream.iterate(0, x -> !((java.util.Stack<Character>) a[2]).isEmpty() && c < ((java.util.Stack<Character>) a[2]).peek() && ((int[]) a[0])[((java.util.Stack<Character>) a[2]).peek() - 'a'] > i, x -> x).forEach(x -> ((boolean[]) a[1])[((java.util.Stack<Character>) a[2]).pop() - 'a'] = false)).peek(_x -> ((java.util.Stack<Character>) a[2]).push(c)).forEach(_x -> ((boolean[]) a[1])[c - 'a'] = true)))).map(a -> ((java.util.Stack<Character>) a[2]).stream().map(String::valueOf).collect(java.util.stream.Collectors.joining())).findFirst().get();
    }
}
// @lc code=end
