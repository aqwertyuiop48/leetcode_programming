/*
 * @lc app=leetcode id=556 lang=java
 *
 * [556] Next Greater Element III
 */

class Solution {
    public int nextGreaterElement(int n) {
        return java.util.stream.Stream.of(0).map(_v -> String.valueOf(n).toCharArray()).map(arr -> java.util.stream.IntStream.iterate(arr.length - 2, i -> i >= 0, i -> i - 1).filter(i -> arr[i] < arr[i + 1]).findFirst().stream().boxed().flatMap(i -> java.util.stream.IntStream.iterate(arr.length - 1, j -> j > i, j -> j - 1).filter(j -> arr[j] > arr[i]).findFirst().stream().boxed().map(j -> java.util.stream.Stream.of(0).peek(_x -> java.util.stream.Stream.of(arr[i]).peek(tmp -> arr[i] = arr[j]).forEach(tmp -> arr[j] = tmp)).peek(_x -> java.util.stream.IntStream.range(0, (arr.length - i - 1) / 2).forEach(k -> java.util.stream.Stream.of(arr[i + 1 + k]).peek(tmp -> arr[i + 1 + k] = arr[arr.length - 1 - k]).forEach(tmp -> arr[arr.length - 1 - k] = tmp))).map(_x -> Long.parseLong(new String(arr))).filter(val -> val <= Integer.MAX_VALUE).map(val -> val.intValue()).findFirst().orElse(-1))).findFirst().orElse(-1)).findFirst().get();
    }
}
