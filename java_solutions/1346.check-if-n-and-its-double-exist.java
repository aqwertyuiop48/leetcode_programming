/*
 * @lc app=leetcode id=1346 lang=java
 *
 * [1346] Check If N and Its Double Exist
 */

class Solution {
    public boolean checkIfExist(int[] arr) {
        return IntStream.range(0, arr.length)
            .anyMatch(i -> IntStream.range(0, arr.length)
                .anyMatch(j -> i != j && arr[i] == 2 * arr[j]));
    }
}
