/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

class Solution {
    public String decodeString(String s) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.Stack<Integer>(), new java.util.Stack<java.lang.StringBuilder>(), new java.lang.StringBuilder(), new int[]{0}}).peek(a -> s.chars().forEach(c -> java.util.stream.Stream.of((char)c).peek(ch -> java.util.stream.Stream.of(0).peek(_v -> ((int[])a[3])[0] = Character.isDigit(ch) ? ((int[])a[3])[0] * 10 + (ch - '0') : ((int[])a[3])[0]).peek(_v -> java.util.stream.Stream.of(0).filter(_x -> ch == '[').peek(_x -> ((java.util.Stack<Integer>)a[0]).push(((int[])a[3])[0])).peek(_x -> ((java.util.Stack<java.lang.StringBuilder>)a[1]).push((java.lang.StringBuilder)a[2])).peek(_x -> a[2] = new java.lang.StringBuilder()).forEach(_x -> ((int[])a[3])[0] = 0)).peek(_v -> java.util.stream.Stream.of(0).filter(_x -> ch == ']').peek(_x -> java.util.stream.Stream.of(((java.util.Stack<java.lang.StringBuilder>)a[1]).pop()).peek(tmp -> java.util.stream.IntStream.range(0, ((java.util.Stack<Integer>)a[0]).pop()).forEach(i -> tmp.append((java.lang.StringBuilder)a[2]))).forEach(tmp -> a[2] = tmp)).forEach(_x -> {})).forEach(_v -> java.util.stream.Stream.of(0).filter(_x -> Character.isLetter(ch)).forEach(_x -> ((java.lang.StringBuilder)a[2]).append(ch)))).anyMatch(_v -> true))).map(a -> ((java.lang.StringBuilder)a[2]).toString()).findFirst().get();
    }
}
