/*
 * @lc app=leetcode id=388 lang=java
 *
 * [388] Longest Absolute File Path
 */

record Solution() {
    public int lengthLongestPath(String input) {
        return (int) java.util.Arrays.stream(input.split("\n")).reduce(new Object[]{new int[input.length() + 2], 0}, (s, p) -> new Object[]{java.util.stream.Stream.of((int[])s[0]).peek(arr -> arr[p.lastIndexOf("\t") + 2] = arr[p.lastIndexOf("\t") + 1] + p.length() - p.lastIndexOf("\t") - (p.lastIndexOf("\t") == -1 ? 0 : 1)).findFirst().get(), p.contains(".") ? Math.max((int)s[1], ((int[])s[0])[p.lastIndexOf("\t") + 1] + p.length() - p.lastIndexOf("\t") - 1) : (int)s[1]}, (a, b) -> a)[1];
    }
}
