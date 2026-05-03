/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        return java.util.stream.Stream.<java.util.function.Function<int[], Boolean>[]>of(new java.util.function.Function[1]).map(f -> java.util.stream.Stream.of(f[0] = (java.util.function.Function<int[], Boolean>) (a -> a[2] == word.length() ? true : (a[0] < 0 || a[1] < 0 || a[0] >= board.length || a[1] >= board[0].length || board[a[0]][a[1]] != word.charAt(a[2]) ? false : java.util.stream.Stream.of(board[a[0]][a[1]]).map(t -> java.util.stream.Stream.of(board[a[0]][a[1]] = '*').map(dummy -> f[0].apply(new int[]{a[0]+1, a[1], a[2]+1}) || f[0].apply(new int[]{a[0]-1, a[1], a[2]+1}) || f[0].apply(new int[]{a[0], a[1]+1, a[2]+1}) || f[0].apply(new int[]{a[0], a[1]-1, a[2]+1})).map(res -> java.util.stream.Stream.of(board[a[0]][a[1]] = t).map(dummy -> res).findFirst().get()).findFirst().get()).findFirst().get()))).findFirst().get()).map(func -> java.util.stream.IntStream.range(0, board.length).boxed().flatMap(i -> java.util.stream.IntStream.range(0, board[0].length).mapToObj(j -> new int[]{i, j, 0})).anyMatch(func::apply)).findFirst().get();
    }
}
