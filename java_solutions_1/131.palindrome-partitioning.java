/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {
    public java.util.List<java.util.List<String>> partition(String s) {
        return java.util.stream.Stream.<Object[]>of(new Object[]{new java.util.ArrayList<java.util.List<String>>(), new java.util.ArrayList<String>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>) a[2]).set(idx -> java.util.stream.Stream.of(idx).filter(i -> i == s.length()).peek(i -> ((java.util.List<java.util.List<String>>) a[0]).add(new java.util.ArrayList<>((java.util.List<String>) a[1]))).findAny().orElseGet(() -> (int) java.util.stream.IntStream.rangeClosed(idx + 1, s.length()).filter(end -> java.util.stream.IntStream.range(0, (end - idx) / 2).allMatch(j -> s.charAt(idx + j) == s.charAt(end - 1 - j))).peek(end -> java.util.stream.Stream.of(0).peek(_v -> ((java.util.List<String>) a[1]).add(s.substring(idx, end))).peek(_v -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>) a[2]).get().accept(end)).forEach(_v -> ((java.util.List<String>) a[1]).remove(((java.util.List<String>) a[1]).size() - 1))).count() * 0))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>) a[2]).get().accept(0)).map(a -> (java.util.List<java.util.List<String>>) a[0]).findFirst().get();
    }
}
// @lc code=end

