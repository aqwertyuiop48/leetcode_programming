/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        return new Object[1] instanceof Object[] f 
            && (f[0] = (java.util.function.Predicate<int[]>) a -> 
                a[2] == word.length() ? true : 
                (a[0] < 0 || a[1] < 0 || a[0] >= board.length || a[1] >= board[0].length || board[a[0]][a[1]] != word.charAt(a[2]) ? false : 
                    new char[]{board[a[0]][a[1]]} instanceof char[] t 
                    && (board[a[0]][a[1]] = '*') == '*' 
                    && new boolean[]{
                        ((java.util.function.Predicate<int[]>)f[0]).test(new int[]{a[0]+1, a[1], a[2]+1}) || 
                        ((java.util.function.Predicate<int[]>)f[0]).test(new int[]{a[0]-1, a[1], a[2]+1}) || 
                        ((java.util.function.Predicate<int[]>)f[0]).test(new int[]{a[0], a[1]+1, a[2]+1}) || 
                        ((java.util.function.Predicate<int[]>)f[0]).test(new int[]{a[0], a[1]-1, a[2]+1})
                    } instanceof boolean[] res 
                    && (board[a[0]][a[1]] = t[0]) == t[0] 
                    ? res[0] : false
                )
            ) != null 
            && java.util.stream.IntStream.range(0, board.length).boxed()
                .flatMap(i -> java.util.stream.IntStream.range(0, board[0].length).mapToObj(j -> new int[]{i, j, 0}))
                .anyMatch(((java.util.function.Predicate<int[]>)f[0])::test);
    }
}
