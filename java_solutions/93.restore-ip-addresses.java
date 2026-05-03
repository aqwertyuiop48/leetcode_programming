/*
 * @lc app=leetcode id=93 lang=java
 *
 * [93] Restore IP Addresses
 */

class Solution {
    public java.util.List<String> restoreIpAddresses(String s) {
        return java.util.stream.IntStream.rangeClosed(1, 3).boxed().flatMap(i -> java.util.stream.IntStream.rangeClosed(1, 3).boxed().flatMap(j -> java.util.stream.IntStream.rangeClosed(1, 3).mapToObj(k -> new int[]{i, j, k}))).filter(arr -> arr[0] + arr[1] + arr[2] < s.length() && s.length() - arr[0] - arr[1] - arr[2] <= 3).map(arr -> new String[]{s.substring(0, arr[0]), s.substring(arr[0], arr[0]+arr[1]), s.substring(arr[0]+arr[1], arr[0]+arr[1]+arr[2]), s.substring(arr[0]+arr[1]+arr[2])}).filter(parts -> java.util.Arrays.stream(parts).allMatch(p -> (p.length() == 1 || !p.startsWith("0")) && Integer.parseInt(p) <= 255)).map(parts -> String.join(".", parts)).collect(java.util.stream.Collectors.toList());
    }
}
