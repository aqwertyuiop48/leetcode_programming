/*
 * @lc app=leetcode id=794 lang=java
 *
 * [794] Valid Tic-Tac-Toe State
 */

class Solution {
    public boolean validTicTacToe(String[] board) {
        return String.join("", board) instanceof String b
            && b.chars().boxed().collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting())) instanceof java.util.Map<Integer, Long> f
            && f.getOrDefault((int) 'X', 0L) instanceof Long x && f.getOrDefault((int) 'O', 0L) instanceof Long o
            && ((java.util.function.IntPredicate) c -> java.util.Arrays.stream(new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}})
                .anyMatch(l -> b.charAt(l[0]) == c && b.charAt(l[1]) == c && b.charAt(l[2]) == c)) instanceof java.util.function.IntPredicate win
            && x - o >= 0 && x - o <= 1 && (!win.test('X') || x - o == 1) && (!win.test('O') || x - o == 0);
    }
}
