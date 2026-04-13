/*
 * @lc app=leetcode id=2763 lang=java
 *
 * [2763] Sum of Imbalance Numbers of All Subarrays
 */

class Solution { public int sumImbalanceNumbers(int[] A) { return ((Function<int[], Function<int[], Integer>>) seen -> cur -> IntStream.range(0, A.length).map(i -> (seen[A[i]] = i + 1) * 0 + (cur[0] = 0) * 0 + IntStream.range(i + 1, A.length).map(j -> seen[A[j]] != i + 1 ? (cur[0] += 1 - (seen[A[j] - 1] == i + 1 ? 1 : 0) - (seen[A[j] + 1] == i + 1 ? 1 : 0)) * 0 + (seen[A[j]] = i + 1) * 0 + cur[0] : cur[0]).sum()).sum()).apply(new int[A.length + 2]).apply(new int[1]); } }
