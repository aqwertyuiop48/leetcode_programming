/*
 * @lc app=leetcode id=529 lang=java
 *
 * [529] Minesweeper
 */

class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        return java.util.stream.Stream.of(0).map(_v -> new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<int[]>>()).peek(ref -> ref.set(pos -> java.util.stream.Stream.of(0).filter(_x -> pos[0] >= 0 && pos[0] < board.length && pos[1] >= 0 && pos[1] < board[0].length).peek(_x -> java.util.stream.Stream.of(0).filter(_y -> board[pos[0]][pos[1]] == 'M').forEach(_y -> board[pos[0]][pos[1]] = 'X')).peek(_x -> java.util.stream.Stream.of(0).filter(_y -> board[pos[0]][pos[1]] == 'E').map(_y -> java.util.stream.IntStream.rangeClosed(-1, 1).flatMap(r -> java.util.stream.IntStream.rangeClosed(-1, 1).map(c -> pos[0] + r >= 0 && pos[0] + r < board.length && pos[1] + c >= 0 && pos[1] + c < board[0].length && board[pos[0] + r][pos[1] + c] == 'M' ? 1 : 0)).sum()).peek(mines -> board[pos[0]][pos[1]] = mines > 0 ? (char) (mines + '0') : 'B').filter(mines -> mines == 0).forEach(_y -> java.util.stream.IntStream.rangeClosed(-1, 1).forEach(r -> java.util.stream.IntStream.rangeClosed(-1, 1).forEach(c -> ref.get().accept(new int[]{pos[0] + r, pos[1] + c}))))).forEach(_x -> {}))).peek(ref -> ref.get().accept(click)).map(ref -> board).findFirst().get();
    }
}
