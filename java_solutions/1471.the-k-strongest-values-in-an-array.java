/*
 * @lc app=leetcode id=1471 lang=java
 *
 * [1471] The k Strongest Values in an Array
 */

class Solution {
    public int[] getStrongest(int[] arr, int k) {
        return java.util.stream.Stream.<int[]>of(java.util.Arrays.stream(arr).sorted().toArray()).map(a -> java.util.Arrays.stream(a).boxed().sorted((x, y) -> Math.abs(x - a[(a.length - 1) / 2]) == Math.abs(y - a[(a.length - 1) / 2]) ? y.compareTo(x) : Integer.compare(Math.abs(y - a[(a.length - 1) / 2]), Math.abs(x - a[(a.length - 1) / 2]))).limit(k).mapToInt(Integer::intValue).toArray()).findFirst().get();
    }
}
