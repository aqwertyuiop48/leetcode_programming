/*
 * @lc app=leetcode id=1089 lang=java
 *
 * [1089] Duplicate Zeros
 */

class Solution {
    public void duplicateZeros(int[] arr) {
        System.arraycopy(Arrays.copyOfRange(Arrays.stream(String.join("",Arrays.stream(arr).boxed().map(i->String.valueOf(i)).collect(Collectors.toList())).replaceAll("0","00").substring(0,arr.length).split("")).map(i->Integer.valueOf(i)).mapToInt(Integer::intValue).toArray(),0,arr.length), 0, arr, 0, arr.length);
    }
}
