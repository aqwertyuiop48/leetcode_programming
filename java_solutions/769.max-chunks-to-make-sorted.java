/*
 * @lc app=leetcode id=769 lang=java
 *
 * [769] Max Chunks To Make Sorted
 */

record Solution() {
    public int maxChunksToSorted(int[] arr) {
        return java.util.stream.IntStream.range(0, arr.length).boxed().reduce(new int[]{0, 0}, (s, i) -> new int[]{Math.max(s[0], arr[i]), s[1] + (Math.max(s[0], arr[i]) == i ? 1 : 0)}, (a, b) -> a)[1];
    }
}
