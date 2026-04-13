/*
 * @lc app=leetcode id=3257 lang=java
 *
 * [3257] Maximum Value Sum by Placing Three Rooks II
 */

class Solution { public long maximumValueSum(int[][] board) { return ((Function<int[][], Long>) arr -> IntStream.range(0, arr.length).boxed().flatMap(i -> IntStream.range(i + 1, arr.length).filter(j -> arr[i][1] != arr[j][1] && arr[i][2] != arr[j][2]).boxed().flatMap(j -> IntStream.range(j + 1, arr.length).filter(k -> arr[i][1] != arr[k][1] && arr[j][1] != arr[k][1] && arr[i][2] != arr[k][2] && arr[j][2] != arr[k][2]).mapToObj(k -> (long)arr[i][0] + (long)arr[j][0] + (long)arr[k][0]))).reduce(-4000000000L, Math::max)).apply(((Function<Object[], int[][]>) state -> IntStream.range(0, board.length).boxed().flatMap(i -> IntStream.range(0, board[0].length).mapToObj(j -> new int[]{board[i][j], i, j}).sorted((a, b) -> Integer.compare(b[0], a[0])).limit(3)).sorted((a, b) -> Integer.compare(b[0], a[0])).filter(a -> ((int[])state[0])[a[2]] < 3 ? (((int[])state[0])[a[2]]++ >= 0) : false).limit(100).toArray(int[][]::new)).apply(new Object[]{new int[board[0].length]})); } }
